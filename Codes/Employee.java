/**
 * Employee class is used to take Employee Information
 * @author amit
 * @since Aug 2017
 * @version 1.0
 * 
 */

public class Employee {
	/**
	 * id is unique to hold employee id
	 */
	private int id; // Instance Variable (Per Object)
	/**
	 * 
	 */
	private String name; // private with in the class
	
	private double salary;
	
	private String branch;
	
	public Employee(){
		System.out.println(" I am a Constructor");
		branch = "Noida";
//		id = 1001;
//		name = "Ram";
//		salary = 1000;
	}
	public void Employee(){
		System.out.println("I am a Function ....");
	}
	
	public Employee(int id , String name){
		this();
		this.id = id;
		this.name = name;
	}
	public Employee(int id , String name , double salary){
		this(id,name);
		
		//this.id = id;
		//this.name = name;
		this.salary = salary;
	}
			
	
	public void takeInput(int id , String name , double salary){
		if(id<=0 && salary<=0){
			System.out.println("Invalid Data");
			return ;
		}
		this.id = id;  // Instance Var = Local Var (Shadow Problem) use this
		this.name = name ;
		this.salary = salary;
	}
	
	
	public void print(){
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
		System.out.println("Branch is "+branch);
	}
	

}
