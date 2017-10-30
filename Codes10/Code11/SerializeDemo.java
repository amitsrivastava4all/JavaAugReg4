import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Address implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String state ="Delhi";
	String city = "Delhi";
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	
}

class Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Address address = new Address();
	int age;
	transient int voterId;
	Person(){
		age = 21;
		voterId = 1001;
		System.out.println("Person Cons Call");
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", voterId=" + voterId + "]"+address.toString();
	}
	
}
class Customer extends Person{ //implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double balance;
	private String remarks;
	private String email;
	Customer(int id , String name, double balance){
		
		this.id = id;
		this.name = name;
		this.balance = balance;
		System.out.println("Customer Cons call");
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Balance "+balance+" Email "+email+" Remarks "+remarks + super.toString();
	}
}
public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/files/abcd.dat";
		Customer ram = new Customer(1001,"Ram",9999);
		ram.age++;
		ram.voterId++;
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);
		System.out.println("Object Store in a file...");
		os.close();
		fs.close();
	}

}
