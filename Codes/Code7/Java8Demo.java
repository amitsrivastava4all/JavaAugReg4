interface Food{
	default void flavour(){
		System.out.println("Common Flavour");
	}
	default void vitamin(){
		System.out.println("Common Vitamin");
	}
}
interface E{
	void show();  //public abstract void show();
}
class E1 implements Food, E{

	@Override
	public void flavour(){
		Food.super.flavour();
		System.out.println("E Override....");
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
//abstract class CommonFood implements Food{
//
//	@Override
//	public void flavour() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void vitamin() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//class HealthyFood {//extends CommonFood{
//	@Override
//	public void vitamin() {
//		System.out.println("Good For Health..");
//		// TODO Auto-generated method stub
//		
//	}
//}
//class JunkFood {//extends CommonFood{
//	@Override
//	public void flavour() {
//		System.out.println("Good Flavour");
//		
//	}
//}
public class Java8Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
