import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class NetworkingDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress inet = InetAddress.getLocalHost();
		System.out.println(inet);
		System.out.println("Enter the Host Name");
		String hostName = new Scanner(System.in).next();
		InetAddress add[] = InetAddress.getAllByName(hostName);
		for(InetAddress ad : add){
			System.out.println(ad);
		}

	}

}
