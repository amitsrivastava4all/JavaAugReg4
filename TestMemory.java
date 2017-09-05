import java.util.ArrayList;

public class TestMemory {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//int e = 1;
		System.out.println("Program Start....");
		ArrayList l  = new ArrayList();
		while(true){
			//e = 2;
			int nn [] = {10,20,30};
			Student r = new Student(1001,"R",nn);
			l.add(r);
			Thread.sleep(40);
		}

	}

}
