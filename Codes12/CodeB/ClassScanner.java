import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

interface BB{
	
}
interface CC{
	
}
class DD{
	
}
class A extends DD implements BB, CC
{
	private int x,y,z;
	public int e,t1;
	protected int b;
	final int c=10;
	A(int x,int y,int z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	void show(){
		
	}
	private void display(){
		System.out.println("Display call");
	}
}
public class ClassScanner {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		// TODO Auto-generated method stub
		Class c = A.class;  // Meta
		int privateCount =0;
		int publicCount =0;
		System.out.println("Var is "+c.getDeclaredFields().length);
		for(Field f: c.getDeclaredFields()){
			if(Modifier.isPrivate(f.getModifiers())){
				privateCount++;
			}
			if(Modifier.isPublic(f.getModifiers())){
				publicCount++;
			}
			
		}
		System.out.println("Private "+privateCount);
		System.out.println("Public "+publicCount);
		A obj = new A(10,20,30);
		//obj.x=100;
		
		Class cc = obj.getClass(); // Data + Meta
		//Field field = cc.getClass().getDeclaredField("x");
		//field.setAccessible(true);
		//field.set(obj, 1000);
		//System.out.println(field.get(obj));
		Method method = cc.getDeclaredMethod("display", null);
		method.setAccessible(true);
		method.invoke(obj);
	}

}
