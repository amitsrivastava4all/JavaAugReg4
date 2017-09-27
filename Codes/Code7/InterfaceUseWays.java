@FunctionalInterface
interface P1
{
	int add(int x, int y);
}
class P2 implements P1{
	public int add(int x, int y){
		return x + y;
	}
	public void display(){
		System.out.println("P2 Display");
	}
}
class BB{
	void show(){
		System.out.println("BB Show...");
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Runnable
		P1 obj2 = (a,b)->a+b;
		System.out.println("Lambda "+obj2.add(100, 200));
		P1 obj3 = (x,y)->{
			System.out.println("X is "+x+" and Y is "+y);
			return x + y;
		};
		System.out.println("Multi Line Lambda "+obj3.add(1000, 2000));
//		BB ee = new BB(){
//			@Override
//			void show(){
//				System.out.println("NEW SHOW...");
//			}
//		};
//		ee.show();
		P2 obj = new P2();
		obj.display();
		int result = obj.add(10,20);
		System.out.println(result);
		//2nd
		if(10>2){
//		P1 p = new P1(){
//			@Override
//			public int add(int x, int y){
//				this.display();
//				return x + y;
//				
//			}
//			public void display(){
//				System.out.println("Anonymous Display");
//			}
//		};
//		result = p.add(10,2);
//		System.out.println("An Result "+result);
		//p.display();
		}
	}

}
