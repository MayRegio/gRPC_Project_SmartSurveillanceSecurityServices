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
    comments = "Source: NoiseSoundRecognition.proto")
public final class NoiseSoundRecognitionGrpc {

  private NoiseSoundRecognitionGrpc() {}

  public static final String SERVICE_NAME = "NoiseSoundRecognition";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPC_Project.textRequest,
      gRPC_Project.textResponse> getNoiseRecognitionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "noiseRecognition",
      requestType = gRPC_Project.textRequest.class,
      responseType = gRPC_Project.textResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC_Project.textRequest,
      gRPC_Project.textResponse> getNoiseRecognitionMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.textRequest, gRPC_Project.textResponse> getNoiseRecognitionMethod;
    if ((getNoiseRecognitionMethod = NoiseSoundRecognitionGrpc.getNoiseRecognitionMethod) == null) {
      synchronized (NoiseSoundRecognitionGrpc.class) {
        if ((getNoiseRecognitionMethod = NoiseSoundRecognitionGrpc.getNoiseRecognitionMethod) == null) {
          NoiseSoundRecognitionGrpc.getNoiseRecognitionMethod = getNoiseRecognitionMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.textRequest, gRPC_Project.textResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "NoiseSoundRecognition", "noiseRecognition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.textRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.textResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NoiseSoundRecognitionMethodDescriptorSupplier("noiseRecognition"))
                  .build();
          }
        }
     }
     return getNoiseRecognitionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_Project.messageRequest,
      gRPC_Project.messageResponse> getTextToTheClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "textToTheClient",
      requestType = gRPC_Project.messageRequest.class,
      responseType = gRPC_Project.messageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPC_Project.messageRequest,
      gRPC_Project.messageResponse> getTextToTheClientMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.messageRequest, gRPC_Project.messageResponse> getTextToTheClientMethod;
    if ((getTextToTheClientMethod = NoiseSoundRecognitionGrpc.getTextToTheClientMethod) == null) {
      synchronized (NoiseSoundRecognitionGrpc.class) {
        if ((getTextToTheClientMethod = NoiseSoundRecognitionGrpc.getTextToTheClientMethod) == null) {
          NoiseSoundRecognitionGrpc.getTextToTheClientMethod = getTextToTheClientMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.messageRequest, gRPC_Project.messageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "NoiseSoundRecognition", "textToTheClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.messageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.messageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new NoiseSoundRecognitionMethodDescriptorSupplier("textToTheClient"))
                  .build();
          }
        }
     }
     return getTextToTheClientMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NoiseSoundRecognitionStub newStub(io.grpc.Channel channel) {
    return new NoiseSoundRecognitionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NoiseSoundRecognitionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NoiseSoundRecognitionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NoiseSoundRecognitionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NoiseSoundRecognitionFutureStub(channel);
  }

  /**
   */
  public static abstract class NoiseSoundRecognitionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void noiseRecognition(gRPC_Project.textRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.textResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNoiseRecognitionMethod(), responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void textToTheClient(gRPC_Project.messageRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.messageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTextToTheClientMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getNoiseRecognitionMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                gRPC_Project.textRequest,
                gRPC_Project.textResponse>(
                  this, METHODID_NOISE_RECOGNITION)))
          .addMethod(
            getTextToTheClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gRPC_Project.messageRequest,
                gRPC_Project.messageResponse>(
                  this, METHODID_TEXT_TO_THE_CLIENT)))
          .build();
    }
  }

  /**
   */
  public static final class NoiseSoundRecognitionStub extends io.grpc.stub.AbstractStub<NoiseSoundRecognitionStub> {
    private NoiseSoundRecognitionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoiseSoundRecognitionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoiseSoundRecognitionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoiseSoundRecognitionStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public void noiseRecognition(gRPC_Project.textRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.textResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getNoiseRecognitionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public void textToTheClient(gRPC_Project.messageRequest request,
        io.grpc.stub.StreamObserver<gRPC_Project.messageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTextToTheClientMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NoiseSoundRecognitionBlockingStub extends io.grpc.stub.AbstractStub<NoiseSoundRecognitionBlockingStub> {
    private NoiseSoundRecognitionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoiseSoundRecognitionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoiseSoundRecognitionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoiseSoundRecognitionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *server streaming
     * </pre>
     */
    public java.util.Iterator<gRPC_Project.textResponse> noiseRecognition(
        gRPC_Project.textRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getNoiseRecognitionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public gRPC_Project.messageResponse textToTheClient(gRPC_Project.messageRequest request) {
      return blockingUnaryCall(
          getChannel(), getTextToTheClientMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NoiseSoundRecognitionFutureStub extends io.grpc.stub.AbstractStub<NoiseSoundRecognitionFutureStub> {
    private NoiseSoundRecognitionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NoiseSoundRecognitionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NoiseSoundRecognitionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NoiseSoundRecognitionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPC_Project.messageResponse> textToTheClient(
        gRPC_Project.messageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTextToTheClientMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_NOISE_RECOGNITION = 0;
  private static final int METHODID_TEXT_TO_THE_CLIENT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NoiseSoundRecognitionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NoiseSoundRecognitionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_NOISE_RECOGNITION:
          serviceImpl.noiseRecognition((gRPC_Project.textRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_Project.textResponse>) responseObserver);
          break;
        case METHODID_TEXT_TO_THE_CLIENT:
          serviceImpl.textToTheClient((gRPC_Project.messageRequest) request,
              (io.grpc.stub.StreamObserver<gRPC_Project.messageResponse>) responseObserver);
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

  private static abstract class NoiseSoundRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NoiseSoundRecognitionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC_Project.SurveillanceSecurityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NoiseSoundRecognition");
    }
  }

  private static final class NoiseSoundRecognitionFileDescriptorSupplier
      extends NoiseSoundRecognitionBaseDescriptorSupplier {
    NoiseSoundRecognitionFileDescriptorSupplier() {}
  }

  private static final class NoiseSoundRecognitionMethodDescriptorSupplier
      extends NoiseSoundRecognitionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NoiseSoundRecognitionMethodDescriptorSupplier(String methodName) {
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
      synchronized (NoiseSoundRecognitionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NoiseSoundRecognitionFileDescriptorSupplier())
              .addMethod(getNoiseRecognitionMethod())
              .addMethod(getTextToTheClientMethod())
              .build();
        }
      }
    }
    return result;
  }
}
