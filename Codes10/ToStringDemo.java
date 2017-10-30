class Emp {
	private int id;
	private String name;
	private double salary;
	Emp(int id , String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString(){
		return "Id "+id+" Name "+name+" Salary"+salary;
	}
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp ram = new Emp(1001,"Ram",9999);
		System.out.println(ram); // className@hashCode
		try{
			int r = 100/0;
		}
		catch(ArithmeticException e){
			System.out.println(e.toString());
		}

	}

}
