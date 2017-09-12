//final class V1
class V1
{
	final int X;
	V1(){
		X = 100;
		
	}
	private final void print(){
		
	}
	void show(){
		
	}
}
class V2 extends V1
{
	int a, b,c;
	//@Override
	void print(){
		
	}
}
public class UseOfFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		V1 obj = new V1();
		System.out.println();
		//obj.X++;
		final V2 obj2  = new V2();
		obj2.a++;
		obj2.b = 100;
		obj2.c= obj2.b * obj2.a;
		System.out.println(obj2.a +" "+obj2.b +" "+obj2.c);

	}

}
