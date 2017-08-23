import java.util.Scanner;

public class PalindromeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuffer org =new StringBuffer(str);
		StringBuffer dup =new StringBuffer(str);
		dup.reverse();
		System.out.println(org+" "+dup);
		if(org.toString().equals(dup.toString())){
			System.out.println("Same");
		}
		else{
			System.out.println("Not Same");
		}
		

	}

}
