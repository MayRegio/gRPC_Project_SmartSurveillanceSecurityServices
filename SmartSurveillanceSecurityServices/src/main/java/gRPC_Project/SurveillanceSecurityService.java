// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CameraControlService.proto

package gRPC_Project;

public final class SurveillanceSecurityService {
  private SurveillanceSecurityService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cameraRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cameraRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cameraResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cameraResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recordingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_recordingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_recordingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_recordingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032CameraControlService.proto\"%\n\rcameraRe" +
      "quest\022\024\n\014turnCameraOn\030\001 \001(\010\"\'\n\016cameraRes" +
      "ponse\022\025\n\rturnCameraOff\030\001 \001(\010\"\'\n\020recordin" +
      "gRequest\022\023\n\013recordingOn\030\001 \001(\t\",\n\021recordi" +
      "ngResponse\022\027\n\017recordingOutput\030\001 \001(\t2\216\001\n\024" +
      "CameraControlService\0228\n\017turnOnOffCamera\022" +
      "\016.cameraRequest\032\017.cameraResponse\"\000(\0010\001\022<" +
      "\n\017cameraRecording\022\021.recordingRequest\032\022.r" +
      "ecordingResponse\"\000(\001B-\n\014gRPC_ProjectB\033Su" +
      "rveillanceSecurityServiceP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_cameraRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cameraRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cameraRequest_descriptor,
        new java.lang.String[] { "TurnCameraOn", });
    internal_static_cameraResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cameraResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cameraResponse_descriptor,
        new java.lang.String[] { "TurnCameraOff", });
    internal_static_recordingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_recordingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_recordingRequest_descriptor,
        new java.lang.String[] { "RecordingOn", });
    internal_static_recordingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_recordingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_recordingResponse_descriptor,
        new java.lang.String[] { "RecordingOutput", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
