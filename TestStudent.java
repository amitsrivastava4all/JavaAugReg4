import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		Student p1 = new Student();
		Student p2 = new Student();
		p2 = p1;
		if(10>2){
			Student p = new Student();
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Rollno");
		int rollno = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		int marks[] = new int[3];
		System.out.println("Enter the Marks...");
		for(int i = 0 ;i<marks.length; i++){
			marks[i] = scanner.nextInt();
		}
		
		Student student = new Student(rollno,name,marks);
		//String result = student.printMarkSheet();
		System.out.println(student.printMarkSheet());
		//student = null;
		scanner.close();
		

	}

}
