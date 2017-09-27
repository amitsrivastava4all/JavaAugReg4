interface T1{
	default void show(){
		System.out.println("T1 Show...");
	}
	static void print(){
		System.out.println("This is T1 Print....");
	}
}
interface T2{
	default void show(){
		System.out.println("T2 Show...");
	}
}
interface T3 extends T1 , T2{
	@Override
	public default void show(){
		T1.super.show();
		T2.super.show();
		System.out.println("this is t3 show....");
	}
}
class T4 implements T3{
	
}
// this is called utility class
interface Validation{
//class Validation{
	//private Validation(){}
static boolean isBlank(){
return false;
}
}

public class MultipleInheritanceProblem {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Validation v = new Validation();
		Validation.isBlank();
		//v.isBlank();
		T4 obj = new T4();
		obj.show();
		T1.print();
	}

}
