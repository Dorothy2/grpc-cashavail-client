package com.drifai;

import java.util.Iterator;

import com.drifai.grpc.Cashavail.APIResponse;
import com.drifai.grpc.Cashavail.CashAvailRequest;
import com.drifai.grpc.cashAvailGrpc;
import com.drifai.grpc.cashAvailGrpc.cashAvailBlockingStub;
import com.drifai.grpc.cashAvailGrpc.cashAvailStub;

import io.grpc.Context;
import io.grpc.Context.CancellableContext;

//import com.drifai.grpc.CashAvail.APIResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class GRPCClient {

	public static void main(String[] args) {
		boolean streamExample = true;
		
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
			.usePlaintext()
			.build();
		
		//stubs - generate from proto files
		cashAvailBlockingStub cashAvailStub = cashAvailGrpc.newBlockingStub(channel);
		
		
		if(streamExample) {
			createMultipleResponse(cashAvailStub);
		} else {			
			APIResponse response = createSingleResponse(cashAvailStub);
		}
		
	}
	
	/**
	 * 
	 * @param stub
	 * 
	 * Returning multiples, but still needs work
	 */
	private static void createMultipleResponse(cashAvailBlockingStub stub) {
		CashAvailRequest request = CashAvailRequest.newBuilder()
				.setFundId("3C")
				.setCashAvailType("CapStock")
				.setCashAvailSubType("CPSTKCLR")
				.setCurrency("EUR")
				.build();
		CancellableContext withCancellation = Context.current().withCancellation();
		withCancellation.run(new Runnable() {
		  @Override public void run() {
		    Iterator<APIResponse> it = stub.getCashAvailStream(request);
		    while(it.hasNext()) {
		        APIResponse obj = (APIResponse)it.next();
		        System.out.println(obj);
		      }
		  }
		});
		System.out.println("Stream call succeeded.");
		
		withCancellation.cancel(null);
		
		
		
	}

	private static APIResponse createSingleResponse(cashAvailBlockingStub cashAvailStub) {
		CashAvailRequest request = CashAvailRequest.newBuilder()
				.setFundId("3C")
				.setCashAvailType("CapStock")
				.setCashAvailSubType("CPSTKCLR")
				.setCurrency("EUR")
				.build();
				
		APIResponse response = cashAvailStub.getCashAvail(request);
		System.out.println("Response coming from server: \n" + response.toString());
		return response;
	}

}
