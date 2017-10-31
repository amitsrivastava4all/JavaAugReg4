import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {
	
	Socket socket ; 
	final String SERVER_IP="192.168.1.9";
	final int PORT= 9001;
	
	MyClient() throws UnknownHostException, IOException{
		socket = new Socket(SERVER_IP, PORT);
		System.out.println("Client Come");
		
	}
	
	void read() throws IOException{
		InputStream is = socket.getInputStream();
		DataInputStream ds = new DataInputStream(is);
		String message = ds.readUTF();
		System.out.println("Server is Saying "+message);
		
	}
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		MyClient client = new MyClient();
		client.read();

	}

}
