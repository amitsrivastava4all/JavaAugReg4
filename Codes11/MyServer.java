import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	ServerSocket serversocket;
	final int PORT = 9001;
	Socket socket;
	MyServer() throws IOException{
		serversocket = new ServerSocket(PORT);
		System.out.println("Server is Up and Running...");
		System.out.println("Waiting For Client....");
		 socket = serversocket.accept();
		 System.out.println("Client Join the Server");
		
	}
	
	void read(){
		
	}
	
	void write() throws IOException{
		System.out.println("Enter the Message To Write");
		Scanner scanner = new Scanner(System.in);
		String message = scanner.nextLine();
		OutputStream os = socket.getOutputStream();
		//os.write(message.getBytes());
		DataOutputStream ds = new DataOutputStream(os);
		ds.writeUTF(message);
		
	}
	
	
	public static void main(String[] args) throws IOException {
		
		MyServer server = new MyServer();
		server.write();
	}

}
