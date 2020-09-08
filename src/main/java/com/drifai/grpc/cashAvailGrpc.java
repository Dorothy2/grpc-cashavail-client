package com.drifai.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: cashavail.proto")
public final class cashAvailGrpc {

  private cashAvailGrpc() {}

  public static final String SERVICE_NAME = "cashAvail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest,
      com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCashAvail",
      requestType = com.drifai.grpc.Cashavail.CashAvailRequest.class,
      responseType = com.drifai.grpc.Cashavail.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest,
      com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailMethod() {
    io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest, com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailMethod;
    if ((getGetCashAvailMethod = cashAvailGrpc.getGetCashAvailMethod) == null) {
      synchronized (cashAvailGrpc.class) {
        if ((getGetCashAvailMethod = cashAvailGrpc.getGetCashAvailMethod) == null) {
          cashAvailGrpc.getGetCashAvailMethod = getGetCashAvailMethod = 
              io.grpc.MethodDescriptor.<com.drifai.grpc.Cashavail.CashAvailRequest, com.drifai.grpc.Cashavail.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "cashAvail", "getCashAvail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.drifai.grpc.Cashavail.CashAvailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.drifai.grpc.Cashavail.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cashAvailMethodDescriptorSupplier("getCashAvail"))
                  .build();
          }
        }
     }
     return getGetCashAvailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest,
      com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCashAvailStream",
      requestType = com.drifai.grpc.Cashavail.CashAvailRequest.class,
      responseType = com.drifai.grpc.Cashavail.APIResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest,
      com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailStreamMethod() {
    io.grpc.MethodDescriptor<com.drifai.grpc.Cashavail.CashAvailRequest, com.drifai.grpc.Cashavail.APIResponse> getGetCashAvailStreamMethod;
    if ((getGetCashAvailStreamMethod = cashAvailGrpc.getGetCashAvailStreamMethod) == null) {
      synchronized (cashAvailGrpc.class) {
        if ((getGetCashAvailStreamMethod = cashAvailGrpc.getGetCashAvailStreamMethod) == null) {
          cashAvailGrpc.getGetCashAvailStreamMethod = getGetCashAvailStreamMethod = 
              io.grpc.MethodDescriptor.<com.drifai.grpc.Cashavail.CashAvailRequest, com.drifai.grpc.Cashavail.APIResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "cashAvail", "getCashAvailStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.drifai.grpc.Cashavail.CashAvailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.drifai.grpc.Cashavail.APIResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new cashAvailMethodDescriptorSupplier("getCashAvailStream"))
                  .build();
          }
        }
     }
     return getGetCashAvailStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static cashAvailStub newStub(io.grpc.Channel channel) {
    return new cashAvailStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static cashAvailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new cashAvailBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static cashAvailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new cashAvailFutureStub(channel);
  }

  /**
   */
  public static abstract class cashAvailImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCashAvail(com.drifai.grpc.Cashavail.CashAvailRequest request,
        io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCashAvailMethod(), responseObserver);
    }

    /**
     */
    public void getCashAvailStream(com.drifai.grpc.Cashavail.CashAvailRequest request,
        io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCashAvailStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCashAvailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.drifai.grpc.Cashavail.CashAvailRequest,
                com.drifai.grpc.Cashavail.APIResponse>(
                  this, METHODID_GET_CASH_AVAIL)))
          .addMethod(
            getGetCashAvailStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.drifai.grpc.Cashavail.CashAvailRequest,
                com.drifai.grpc.Cashavail.APIResponse>(
                  this, METHODID_GET_CASH_AVAIL_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class cashAvailStub extends io.grpc.stub.AbstractStub<cashAvailStub> {
    private cashAvailStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cashAvailStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cashAvailStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cashAvailStub(channel, callOptions);
    }

    /**
     */
    public void getCashAvail(com.drifai.grpc.Cashavail.CashAvailRequest request,
        io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCashAvailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCashAvailStream(com.drifai.grpc.Cashavail.CashAvailRequest request,
        io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetCashAvailStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class cashAvailBlockingStub extends io.grpc.stub.AbstractStub<cashAvailBlockingStub> {
    private cashAvailBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cashAvailBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cashAvailBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cashAvailBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.drifai.grpc.Cashavail.APIResponse getCashAvail(com.drifai.grpc.Cashavail.CashAvailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCashAvailMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.drifai.grpc.Cashavail.APIResponse> getCashAvailStream(
        com.drifai.grpc.Cashavail.CashAvailRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetCashAvailStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class cashAvailFutureStub extends io.grpc.stub.AbstractStub<cashAvailFutureStub> {
    private cashAvailFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private cashAvailFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected cashAvailFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new cashAvailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.drifai.grpc.Cashavail.APIResponse> getCashAvail(
        com.drifai.grpc.Cashavail.CashAvailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCashAvailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CASH_AVAIL = 0;
  private static final int METHODID_GET_CASH_AVAIL_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final cashAvailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(cashAvailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CASH_AVAIL:
          serviceImpl.getCashAvail((com.drifai.grpc.Cashavail.CashAvailRequest) request,
              (io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse>) responseObserver);
          break;
        case METHODID_GET_CASH_AVAIL_STREAM:
          serviceImpl.getCashAvailStream((com.drifai.grpc.Cashavail.CashAvailRequest) request,
              (io.grpc.stub.StreamObserver<com.drifai.grpc.Cashavail.APIResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class cashAvailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    cashAvailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.drifai.grpc.Cashavail.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("cashAvail");
    }
  }

  private static final class cashAvailFileDescriptorSupplier
      extends cashAvailBaseDescriptorSupplier {
    cashAvailFileDescriptorSupplier() {}
  }

  private static final class cashAvailMethodDescriptorSupplier
      extends cashAvailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    cashAvailMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (cashAvailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new cashAvailFileDescriptorSupplier())
              .addMethod(getGetCashAvailMethod())
              .addMethod(getGetCashAvailStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
