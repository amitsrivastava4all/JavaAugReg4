
public class TestEmployee {
	
	public static void main(String[] args) {
		Employee ram = new Employee();
		ram.print();
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println("Salary is "+ram.salary);
		ram.id = 1001;
		ram.name = "Ram";
		ram.salary = 9999;
		ram.print();
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println("Salary is "+ram.salary);
		
		//System.out.println(ram);
	}

}
