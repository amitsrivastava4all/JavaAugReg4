class Customer{
	int id;
	String name;
	String city;
	
	
}

class MathOperation{
	private MathOperation(){}
	static void sin(){
		
	}
}

class Validation{
	static boolean checkBlank(String str){
		if(str.length()==0){
			return true;
		}
		else
		{
			return false;
		}
	}
}

class P
{
	static void show(){
		System.out.println("P Class Show");
	}
}
class C extends P
{
	static void show(){
		System.out.println("C Class Show...");
	}
}
public class StaticMethodOverride {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("Hello ");
		//System s = new System();
		//s.out.println("Hello ");
		//MathOperation m = new MathOperation();
		//m.sin();
		MathOperation.sin();
		// TODO Auto-generated method stub
		//P.show();
		//C.show();
		P obj = new C();
		obj.show(); // P.show()
	}

}
