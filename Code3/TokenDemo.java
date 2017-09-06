import java.util.StringTokenizer;

public class TokenDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTokenizer sb = new StringTokenizer("A-10,Rajender Nagar,Delhi-7",",");
		while(sb.hasMoreTokens()){
			System.out.println(sb.nextToken());
		}

	}

}
