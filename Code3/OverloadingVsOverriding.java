class Example
{
	protected void show(){
		System.out.println("show no args");
	}
	double show(int x){
		System.out.println("show int x");
		return 0.0;
	}
	int show(long x){
		System.out.println("show long x");
		return 0;
	}
	public void show(int x , long y){
		
	}
	void show(long x , int y){
		
	}
	 /*public void show(int x , long y){
		
	}*/
	/*String show(int x , long y){
		return "";
	}*/
}
class A
{
	void show(){
		System.out.println("A Show");
	}
	void print(){
		System.out.println("A Print");
	}
}
class B extends A
{
	@Override
	void show(){
		System.out.println("B Show this is overriding...");
	}
	void show(int x){
		System.out.println("B Show , this is overloading...");
	}
	void output(){
		System.out.println("B Output");
	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A obj2= new A();
		A obj2 = new B();
		obj2.show();
		obj2.print();
		//obj2.output();
		
		Example obj = new Example();
		obj.show(10);
		obj.show();
		obj.show(10,20L);
		

	}

}
