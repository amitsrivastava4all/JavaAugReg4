import java.util.Scanner;

public class StringQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char w = 'A';
		System.out.println("Enter the Sentence");
		Scanner s = new Scanner(System.in);
		String sen = s.nextLine();
		String words[] = sen.split(" ");
		for(String word : words){
			String result = String.valueOf(word.charAt(0)).toUpperCase() 
					+ word.substring(1).toLowerCase();
			System.out.print(result+" ");
		}
		

	}

}
