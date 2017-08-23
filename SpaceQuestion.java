import java.util.Scanner;

public class SpaceQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		//StringBuffer val = new StringBuffer(s.next());
		String val = s.next();
		for(int i = 0 ; i<val.length(); i++){
			char firstChar = val.charAt(0);
			val = val+firstChar;
			val = val.substring(1);
			System.out.println(val);
			//char firstChar = val.charAt(0);
			//val.append(val.charAt(0));
			//val.deleteCharAt(0);
			//System.out.println((val.append(val.charAt(0)).deleteCharAt(0)));
			//System.out.println(val);
		}

	}

}
