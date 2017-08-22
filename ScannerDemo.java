import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws Exception {
		//Scanner scanner = new Scanner("Hello How are You\n I am Fine ");
		Scanner scanner = new Scanner("10 20 30 40 50 60 70 80 90");
		int counter = 0;
		while(scanner.hasNext()){
			String temp = scanner.next();
			System.out.println(temp);
			//scanner.next();
			counter++;
			//System.out.println(scanner.next());
		}
		System.out.println("Total Words are "+counter);
		/*byte b[] = new byte[10];
		System.out.println("Enter the Name");
		int singleByte = System.in.read();
		System.out.println((char)singleByte);
		*/
		//System.in.read(b);
		//String w = new String(b);
		//System.out.println(w);

	}

}
