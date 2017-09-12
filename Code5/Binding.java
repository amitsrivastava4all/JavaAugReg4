class K
{
	int x = 30;
	void show(){
		System.out.println("K Show....");
	}
}
class K1 extends K
{
	int x =10;
	void show(){
		//super.x = 10;
		super.show();
		System.out.println("K1 show...");
	}
}
class K2 extends K1
{
	int x= 20;
	@Override
	void show(){
		super.show();
		int x = 40;
		((K)this).x= 1000;
		int z = x + this.x + super.x + ((K)this).x;
		System.out.println("K2 show "+z);
	}
}
public class Binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		K1 obj = new K2();
		obj.show();
		System.out.println(obj.x);
	}

}
