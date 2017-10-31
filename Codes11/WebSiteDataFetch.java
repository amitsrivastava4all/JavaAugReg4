import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import com.google.gson.Gson;

public class WebSiteDataFetch {

	public static void main(String[] args) throws IOException {
		//28081 Dhoni
		//253802 Virat
		//35320 Sachin
		System.out.println("Enter the Host Name");
		String hostName = new Scanner(System.in).next();
		int pid = 35320;
		//URL url = new URL("http://cricapi.com/api/playerStats?pid="+pid+"&apikey=A8zoDoPaQgefmB7KunnSuApSgL73");
		URL url = new URL("https://freegeoip.net/json/"+hostName);
		URLConnection connection = url.openConnection();
		connection.connect();
		InputStream is = connection.getInputStream();
		int singleByte = is.read();
		StringBuffer sb = new StringBuffer();
		while(singleByte!=-1){
			sb.append((char)singleByte);
			singleByte = is.read();
		}
		String json = sb.toString();
		Gson gson = new Gson();
		DomainInfo domainInfo = gson.fromJson(json, DomainInfo.class);
		System.out.println("Domain Info is ");
		System.out.println(domainInfo);
//		System.out.println("IP IS "+domainInfo.getIp());
//		System.out.println("Country "+domainInfo.getCountryName());
//		System.out.println("City "+domainInfo.getCity());
		//System.out.println("JSON is "+json);
		is.close();
		
	}

}
