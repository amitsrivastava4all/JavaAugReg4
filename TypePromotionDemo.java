class Overloading{
	void show(String z , float w , int ...x){
		
	}
	void show(int ...x){
		//System.out.println(x[0]+ x[1]);
		int sum = 0;
		for(int i :x){
			sum+=i;
		}
		System.out.println("Sum is "+sum);
	}
	void show(byte x){
		System.out.println("byte ");
	}
	void show(short x){
		System.out.println("short ");
	}
	/*void show(int x){
		System.out.println("int ");
	}*/
	/*void show(Integer x){
		System.out.println("Integer...");
	}*/
	void show(Long x){
		System.out.println("Long...");
	}
	/*void show(long x){
		System.out.println("long ");
	}*/
	/*void show(float x){
		System.out.println("float");
	}*/
	/*void show(double x){
		System.out.println("double");
	}*/
}
public class TypePromotionDemo {

	public static void main(String[] args) {
		/*Integer p2 = 130;
		Integer p = 130;
		if(p==p2){
			System.out.println("Same ");
		}
		else
		{
			System.out.println("Not Same");
		}
		p++;
		System.out.println(p);
		Integer t = new Integer(100); // Boxing
		int e = t.intValue();  // Unboxing
		float r = t.floatValue();
		long tt = t.longValue();
		String hexa = Integer.toHexString(100);
		String binaryNo = Integer.toBinaryString(100);
		String octal = Integer.toOctalString(100);
		System.out.println(hexa +" "+octal + " "+binaryNo);
		e++;
		t = new Integer(e);  // Boxing
		//t++;  AutoBoxing
		int j = 100;
		*/
		// TODO Auto-generated method stub
		Overloading obj  = new Overloading();
		byte x = 1;
		obj.show(100);
		obj.show();
		obj.show(10,20);
		obj.show(10,20,30);
		obj.show(10,20,30,40,50);
		//obj.show(20L);
		//obj.show(x);
		//obj.show((byte)10);

	}

}
