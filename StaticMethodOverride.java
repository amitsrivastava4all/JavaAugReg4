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
 

// show is bind with P e.g P.show()
class P
{
	int age;
	private void output(){
		
	}
	static void show(){
		System.out.println("P Class Show");
	}
}
// show is bind with C, e.g. C.show();
class C extends P
{
	/*@Override
	void output(){
		
	}*/
	String city;
	void print(){
		System.out.println(age +" "+city);
	}
	//@Override
	static void show(){
		System.out.println("C Class Show...");
	}
}
public class StaticMethodOverride {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		kloop:
		for(int k=1 ; k<=3; k++){
		myloop:
		for(int i = 1; i<=3; i++){
			for(int j = 1; j<=3; j++){
				if(i==j){
					continue kloop;
					//break myloop;
					//continue myloop;
					//break;
				}
				else
				{
					System.out.println("I is "+i+" and J is "+j);
				}
			}
		}
		}
	System.out.println("Outside the loop");
		
		
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
