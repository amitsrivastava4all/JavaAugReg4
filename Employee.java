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
	int id;
	/**
	 * 
	 */
	String name;
	
	double salary;
	
	
	void print(){
		System.out.println("Id is "+this.id);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+salary);
	}
	

}
