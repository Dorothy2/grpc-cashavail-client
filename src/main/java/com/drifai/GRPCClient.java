package com.drifai;

import com.drifai.grpc.Cashavail.APIResponse;
import com.drifai.grpc.Cashavail.CashAvailRequest;
import com.drifai.grpc.cashAvailGrpc;
import com.drifai.grpc.cashAvailGrpc.cashAvailBlockingStub;

//import com.drifai.grpc.CashAvail.APIResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GRPCClient {

	public static void main(String[] args) {
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
			.usePlaintext()
			.build();
		
		//stubs - generate from proto files
		cashAvailBlockingStub cashAvailStub = cashAvailGrpc.newBlockingStub(channel);
		
		CashAvailRequest request = CashAvailRequest.newBuilder()
				.setFundId("3C")
				.setCashAvailType("CapStock")
				.setCashAvailSubType("CPSTKCLR")
				.setCurrency("EUR")
				.build();
				
		APIResponse response = cashAvailStub.getCashAvail(request);
		
		System.out.println("Response coming from server: \n" + response.toString());
		
	}

}
