import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class MetaInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc calc = new Calc();
		//Class cls = Calc.class;  // Metadata
		Class cls = calc.getClass();  // Data + Meta Data
		System.out.println("this class has "+cls.getDeclaredFields().length+" Fields");
		System.out.println("this class has "+cls.getDeclaredMethods().length+" Methods");
		System.out.println("Parent class is "+cls.getSuperclass().getName());
		System.out.println("Interfaces Implemented "+cls.getInterfaces().length);
		Field fields [] = cls.getDeclaredFields();
		int staticCount =0;
		int publicCount = 0;
		int privateCount = 0;
		for(Field field : fields){
			if(Modifier.isPrivate(field.getModifiers())){
				privateCount++;
			}
			else
			if(Modifier.isStatic(field.getModifiers())){
				staticCount++;
			}
			else
			if(Modifier.isPublic(field.getModifiers())){	
				publicCount++;
			}
		}
		System.out.println("Private Count "+privateCount);
		
		System.out.println("Static are "+staticCount);
		System.out.println("Public are "+publicCount);

	}

}
