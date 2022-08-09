package gRPC_Project;

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
    comments = "Source: EmergencyChannel.proto")
public final class emergencyChannelGrpc {

  private emergencyChannelGrpc() {}

  public static final String SERVICE_NAME = "emergencyChannel";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPC_Project.callRequest,
      gRPC_Project.callResponse> getEmergencyCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "emergencyCall",
      requestType = gRPC_Project.callRequest.class,
      responseType = gRPC_Project.callResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_Project.callRequest,
      gRPC_Project.callResponse> getEmergencyCallMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.callRequest, gRPC_Project.callResponse> getEmergencyCallMethod;
    if ((getEmergencyCallMethod = emergencyChannelGrpc.getEmergencyCallMethod) == null) {
      synchronized (emergencyChannelGrpc.class) {
        if ((getEmergencyCallMethod = emergencyChannelGrpc.getEmergencyCallMethod) == null) {
          emergencyChannelGrpc.getEmergencyCallMethod = getEmergencyCallMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.callRequest, gRPC_Project.callResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "emergencyChannel", "emergencyCall"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.callRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.callResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new emergencyChannelMethodDescriptorSupplier("emergencyCall"))
                  .build();
          }
        }
     }
     return getEmergencyCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_Project.locationRequest,
      gRPC_Project.locationResponse> getSendLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendLocation",
      requestType = gRPC_Project.locationRequest.class,
      responseType = gRPC_Project.locationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_Project.locationRequest,
      gRPC_Project.locationResponse> getSendLocationMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.locationRequest, gRPC_Project.locationResponse> getSendLocationMethod;
    if ((getSendLocationMethod = emergencyChannelGrpc.getSendLocationMethod) == null) {
      synchronized (emergencyChannelGrpc.class) {
        if ((getSendLocationMethod = emergencyChannelGrpc.getSendLocationMethod) == null) {
          emergencyChannelGrpc.getSendLocationMethod = getSendLocationMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.locationRequest, gRPC_Project.locationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "emergencyChannel", "sendLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.locationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.locationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new emergencyChannelMethodDescriptorSupplier("sendLocation"))
                  .build();
          }
        }
     }
     return getSendLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static emergencyChannelStub newStub(io.grpc.Channel channel) {
    return new emergencyChannelStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static emergencyChannelBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new emergencyChannelBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static emergencyChannelFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new emergencyChannelFutureStub(channel);
  }

  /**
   */
  public static abstract class emergencyChannelImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void emergencyCall(gRPC_Project.callRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.callResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getEmergencyCallMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void sendLocation(gRPC_Project.locationRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.locationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEmergencyCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_Project.callRequest,
                gRPC_Project.callResponse>(
                  this, METHODID_EMERGENCY_CALL)))
          .addMethod(
            getSendLocationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_Project.locationRequest,
                gRPC_Project.locationResponse>(
                  this, METHODID_SEND_LOCATION)))
          .build();
    }
  }

  /**
   */
  public static final class emergencyChannelStub extends io.grpc.stub.AbstractStub<emergencyChannelStub> {
    private emergencyChannelStub(io.grpc.Channel channel) {
      super(channel);
    }

    private emergencyChannelStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected emergencyChannelStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new emergencyChannelStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void emergencyCall(gRPC_Project.callRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.callResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmergencyCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void sendLocation(gRPC_Project.locationRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.locationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendLocationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class emergencyChannelBlockingStub extends io.grpc.stub.AbstractStub<emergencyChannelBlockingStub> {
    private emergencyChannelBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private emergencyChannelBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected emergencyChannelBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new emergencyChannelBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public gRPC_Project.callResponse emergencyCall(gRPC_Project.callRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmergencyCallMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public gRPC_Project.locationResponse sendLocation(gRPC_Project.locationRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendLocationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class emergencyChannelFutureStub extends io.grpc.stub.AbstractStub<emergencyChannelFutureStub> {
    private emergencyChannelFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private emergencyChannelFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected emergencyChannelFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new emergencyChannelFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_Project.callResponse> emergencyCall(
        gRPC_Project.callRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmergencyCallMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_Project.locationResponse> sendLocation(
        gRPC_Project.locationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendLocationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EMERGENCY_CALL = 0;
  private static final int METHODID_SEND_LOCATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final emergencyChannelImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(emergencyChannelImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EMERGENCY_CALL:
          serviceImpl.emergencyCall((gRPC_Project.callRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_Project.callResponse>) responseObserver);
          break;
        case METHODID_SEND_LOCATION:
          serviceImpl.sendLocation((gRPC_Project.locationRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_Project.locationResponse>) responseObserver);
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

  private static abstract class emergencyChannelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    emergencyChannelBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC_Project.SurveillanceSecurityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("emergencyChannel");
    }
  }

  private static final class emergencyChannelFileDescriptorSupplier
      extends emergencyChannelBaseDescriptorSupplier {
    emergencyChannelFileDescriptorSupplier() {}
  }

  private static final class emergencyChannelMethodDescriptorSupplier
      extends emergencyChannelBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    emergencyChannelMethodDescriptorSupplier(String methodName) {
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
      synchronized (emergencyChannelGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new emergencyChannelFileDescriptorSupplier())
              .addMethod(getEmergencyCallMethod())
              .addMethod(getSendLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
