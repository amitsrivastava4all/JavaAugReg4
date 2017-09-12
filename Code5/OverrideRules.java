// 1. Weaker Access Rule
// 2. CoVariant Return Type Rule (JAva 1.5)
class Bill
{
	int x,y;
	// TAX
}
class GSTBill extends Bill{
	int a,b,c;
}
class Z
{
	
}
class Parent
{
	protected Bill show(){
		System.out.println("Parent Show...");
		Bill obj = new Bill();
		return obj;
	}
}
class Child extends Parent
{
	@Override
	public GSTBill show(){
		System.out.println("Child Show...");
		GSTBill obj = new GSTBill();
		return obj;
	}
}

public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
