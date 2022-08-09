package gRPC_Project;

//imported through our Maven dependencies
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class NewServer {
	//declare variable to create a gRPC server
	private Server server;

	public static void main(String[] args) {
		
		//create an object to the NewServer class
		NewServer ourServer = new NewServer();
		
		//call the start method to run our server
		ourServer.start();
		
		
		

	}

	//here we start to work on gRPC
	private void start() {
		//output for our start method - this  method will start our server
		System.out.print("Starting gRPC Server");
		
		//declare variable to store the port number
		int port = 50051;
		//create a gRPC server through a builder pattern with forPort method
		// . will separe and call the methods
		//addService is where you specify your specific service creating a new object
		server = ServerBuilder.forPort(port).addService(new SurveillanceSecurityServiceImpl().build().start();
		
		
		
	}
	
	//declare the implementation class - it will be extend abstract base class for our own implementation
	//this is the implementation to our whole service
	//here you call your className from your proto file 
	//and extend it into your java folder
	static class SurveillanceSecurityServiceImpl extends SurveillanceSecurityServiceImplBase {
		
	}

}
