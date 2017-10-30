import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteDataFetch {

	public static void main(String[] args) throws IOException {
		//28081 Dhoni
		//253802 Virat
		//35320 Sachin
		int pid = 35320;
		URL url = new URL("http://cricapi.com/api/playerStats?pid="+pid+"&apikey=A8zoDoPaQgefmB7KunnSuApSgL73");
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
		System.out.println("JSON is "+json);
		is.close();
		
	}

}
