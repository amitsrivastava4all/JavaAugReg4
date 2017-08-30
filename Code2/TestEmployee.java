
public class TestEmployee {
	
	public static void main(String[] args) {
		//main(null);
		int p = 100;
		Employee ram = new Employee(1010,"RAMESH ",8888);
		ram.setName("RAM");
		System.out.println("Name is "+ram.getName());
		//ram.takeInput(1001, "Ram", 9999);
		ram.print();
		System.out.println("*********************************");
		Employee shyam = new Employee(1020,"Shyam",7777);
		//shyam = new Employee();
		//shyam.takeInput(-1002, "Shyam", -8888);
		shyam.print();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Employee t = new Employee();
		t.Employee();
		
		System.out.println("How Many Objects "+Employee.counter);
		
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println("Salary is "+ram.salary);
		//ram.id = -1001;
		/*ram.name = "Ram";
		ram.salary = -9999;*/
		//ram.print();
//		System.out.println("Id is "+ram.id);
//		System.out.println("Name is "+ram.name);
//		System.out.println("Salary is "+ram.salary);
		
		//System.out.println(ram);
	}

}
