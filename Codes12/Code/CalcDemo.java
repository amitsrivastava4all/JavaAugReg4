import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;
interface BB{
	
}
interface HH{
	
}
class Calc implements BB , HH{
	int x;
	static int y;
	private int s;
	private int b;
	protected String h;
	public int f;
	final int T = 100;
	Calc(){
		System.out.println("Calc Cons Call");
	}
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x *y;
	}
}
class AdvCalc {
	int y;
	AdvCalc(){
		System.out.println("AdvCalc Cons call");
	}
	private int power (int x , int y){
		return (int)Math.pow(x, y);
	}
}
public class CalcDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub
		System.out.println("Enter the Calc Class or AdvCalc Class");
		Scanner scanner= new Scanner(System.in);
		String className = scanner.next();
		Object object = Class.forName(className).newInstance();
		System.out.println("OBject is "+object);
		System.out.println("Enter the Method Name");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class,int.class);
		method.setAccessible(true);
		Object result =method.invoke(object, 10,2);
		System.out.println("result is "+result);
		System.out.println("Enter the Field Name");
		String fieldName = scanner.next();
		Field field = object.getClass().getDeclaredField(fieldName);
		field.set(object, 1000);
		System.out.println(field.get(object));
	}

}
