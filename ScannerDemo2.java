import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the three numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("A "+a+" B "+b+" C "+c);
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Salary "+salary);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		System.out.println("Enter the Name");
		scanner.nextLine();
		String name = scanner.nextLine();
		
		System.out.println("Name is "+name+" and Age is "+age);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the City");
		String city = s.next();
		System.out.println("City "+city);
		scanner.close();
		s.close();
	}

}
