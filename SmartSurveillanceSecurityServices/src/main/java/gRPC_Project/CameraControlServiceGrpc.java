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
 * <pre>
 *Here we will define the name of the service and the method to it will be called
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: CameraControlService.proto")
public final class CameraControlServiceGrpc {

  private CameraControlServiceGrpc() {}

  public static final String SERVICE_NAME = "CameraControlService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPC_Project.cameraRequest,
      gRPC_Project.cameraResponse> getTurnOnOffCameraMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOnOffCamera",
      requestType = gRPC_Project.cameraRequest.class,
      responseType = gRPC_Project.cameraResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC_Project.cameraRequest,
      gRPC_Project.cameraResponse> getTurnOnOffCameraMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.cameraRequest, gRPC_Project.cameraResponse> getTurnOnOffCameraMethod;
    if ((getTurnOnOffCameraMethod = CameraControlServiceGrpc.getTurnOnOffCameraMethod) == null) {
      synchronized (CameraControlServiceGrpc.class) {
        if ((getTurnOnOffCameraMethod = CameraControlServiceGrpc.getTurnOnOffCameraMethod) == null) {
          CameraControlServiceGrpc.getTurnOnOffCameraMethod = getTurnOnOffCameraMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.cameraRequest, gRPC_Project.cameraResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CameraControlService", "turnOnOffCamera"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.cameraRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.cameraResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraControlServiceMethodDescriptorSupplier("turnOnOffCamera"))
                  .build();
          }
        }
     }
     return getTurnOnOffCameraMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPC_Project.recordingRequest,
      gRPC_Project.recordingResponse> getCameraRecordingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cameraRecording",
      requestType = gRPC_Project.recordingRequest.class,
      responseType = gRPC_Project.recordingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<gRPC_Project.recordingRequest,
      gRPC_Project.recordingResponse> getCameraRecordingMethod() {
    io.grpc.MethodDescriptor<gRPC_Project.recordingRequest, gRPC_Project.recordingResponse> getCameraRecordingMethod;
    if ((getCameraRecordingMethod = CameraControlServiceGrpc.getCameraRecordingMethod) == null) {
      synchronized (CameraControlServiceGrpc.class) {
        if ((getCameraRecordingMethod = CameraControlServiceGrpc.getCameraRecordingMethod) == null) {
          CameraControlServiceGrpc.getCameraRecordingMethod = getCameraRecordingMethod = 
              io.grpc.MethodDescriptor.<gRPC_Project.recordingRequest, gRPC_Project.recordingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "CameraControlService", "cameraRecording"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.recordingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPC_Project.recordingResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new CameraControlServiceMethodDescriptorSupplier("cameraRecording"))
                  .build();
          }
        }
     }
     return getCameraRecordingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CameraControlServiceStub newStub(io.grpc.Channel channel) {
    return new CameraControlServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CameraControlServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CameraControlServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CameraControlServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CameraControlServiceFutureStub(channel);
  }

  /**
   * <pre>
   *Here we will define the name of the service and the method to it will be called
   * </pre>
   */
  public static abstract class CameraControlServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *bi-directional method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gRPC_Project.cameraRequest> turnOnOffCamera(
        io.grpc.stub.StreamObserver<gRPC_Project.cameraResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getTurnOnOffCameraMethod(), responseObserver);
    }

    /**
     * <pre>
     *client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gRPC_Project.recordingRequest> cameraRecording(
        io.grpc.stub.StreamObserver<gRPC_Project.recordingResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getCameraRecordingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnOffCameraMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                gRPC_Project.cameraRequest,
                gRPC_Project.cameraResponse>(
                  this, METHODID_TURN_ON_OFF_CAMERA)))
          .addMethod(
            getCameraRecordingMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                gRPC_Project.recordingRequest,
                gRPC_Project.recordingResponse>(
                  this, METHODID_CAMERA_RECORDING)))
          .build();
    }
  }

  /**
   * <pre>
   *Here we will define the name of the service and the method to it will be called
   * </pre>
   */
  public static final class CameraControlServiceStub extends io.grpc.stub.AbstractStub<CameraControlServiceStub> {
    private CameraControlServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraControlServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraControlServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraControlServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *bi-directional method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gRPC_Project.cameraRequest> turnOnOffCamera(
        io.grpc.stub.StreamObserver<gRPC_Project.cameraResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getTurnOnOffCameraMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *client streaming method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<gRPC_Project.recordingRequest> cameraRecording(
        io.grpc.stub.StreamObserver<gRPC_Project.recordingResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCameraRecordingMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Here we will define the name of the service and the method to it will be called
   * </pre>
   */
  public static final class CameraControlServiceBlockingStub extends io.grpc.stub.AbstractStub<CameraControlServiceBlockingStub> {
    private CameraControlServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraControlServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraControlServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraControlServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *Here we will define the name of the service and the method to it will be called
   * </pre>
   */
  public static final class CameraControlServiceFutureStub extends io.grpc.stub.AbstractStub<CameraControlServiceFutureStub> {
    private CameraControlServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CameraControlServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CameraControlServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CameraControlServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_TURN_ON_OFF_CAMERA = 0;
  private static final int METHODID_CAMERA_RECORDING = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CameraControlServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CameraControlServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON_OFF_CAMERA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.turnOnOffCamera(
              (io.grpc.stub.StreamObserver<gRPC_Project.cameraResponse>) responseObserver);
        case METHODID_CAMERA_RECORDING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.cameraRecording(
              (io.grpc.stub.StreamObserver<gRPC_Project.recordingResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CameraControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CameraControlServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPC_Project.SurveillanceSecurityServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CameraControlService");
    }
  }

  private static final class CameraControlServiceFileDescriptorSupplier
      extends CameraControlServiceBaseDescriptorSupplier {
    CameraControlServiceFileDescriptorSupplier() {}
  }

  private static final class CameraControlServiceMethodDescriptorSupplier
      extends CameraControlServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CameraControlServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CameraControlServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CameraControlServiceFileDescriptorSupplier())
              .addMethod(getTurnOnOffCameraMethod())
              .addMethod(getCameraRecordingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
