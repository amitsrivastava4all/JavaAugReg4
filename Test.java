
public class Test {

	public static void main(String[] args) {
		String a = "hello";
		String b = "hello";
		String c = "hello";
		//String c = new String("hello").intern();
		if(c==a){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref"); 
			
		}
		c = "ok";
		if(c==a){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref"); 
			
		}
		if(c.equals(a)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		 a= null;
		 
	}

}
