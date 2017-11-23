import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

class Calc{
	Calc(){
		System.out.println("Calc Cons call");
	}
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	static{
		System.out.println("Calc Class is Loaded...");
	}
}
class AdvanceCalc{
	AdvanceCalc(){
		System.out.println("Advance Calc Cons Call");
	}
	public int power(int x, int y){
		return (int)Math.pow(x, y);
	}
	static{
		System.out.println("AdvanceCalc Class is loaded...");
	}
}
public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Calc for Load Basic Calculator");
		System.out.println("AdvanceCalc for Load Advance Calculator");
		String className = scanner.next();
		//ACalc c = new ACalc(); // EAGER
		Object object = Class.forName(className).newInstance(); // LAZY
		System.out.println("add for addition");
		System.out.println("subtract for subtraction");
		System.out.println("power for compute power");
		String methodName = scanner.next();
		Method method = object.getClass().getDeclaredMethod(methodName, int.class, int.class);
		Object result= method.invoke(object, 1000,200);
		System.out.println(result);
		//Object b = 10;
		
	}

}
