import java.util.Date;

/**
 * Employee class is used to take Employee Information
 * @author amit
 * @since Aug 2017
 * @version 1.0
 * 
 */

public class Employee {
	
	static int counter;
	/**
	 * id is unique to hold employee id
	 */
	private int id; // Instance Variable (Per Object)
	/**
	 * 
	 */
	private String name; // private with in the class
	
	private double salary;
	
	private double bonus;
	
	private String country;
	
	private String city;
	
	private Date doj;
	
	private int exp;
	
	
	private String branch;
	
	{
		System.out.println(" I am a INit Block, I am a Pre Constructor Call "+id +" " +name+"   " + salary);
	}
	{
		System.out.println("I am INit 2");
	}
	
	static{
		counter = 100;
		System.out.println("I Will Call Only Once when Class is Loaded..."+counter);
	}
	public Employee(){
		counter++;
		System.out.println(" I am a Default Constructor");
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
		System.out.println("I am a 2 Param Cons ");
		this.id = id;
		
		this.name = name;
	}
	public Employee(int id , String name , double salary){
		this(id,name);
		System.out.println("I am a 3 Param Cons ");
		//this.id = id;
		//this.name = name;
		this.salary = salary;
	}
			
	
	
	public int getId() {
		return id;
	}
	public static int getCounter() {
		return counter;
	}
	public static void setCounter(int counter) {
		Employee.counter = counter;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
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
