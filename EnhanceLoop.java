import java.util.ArrayList;

public class EnhanceLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[] = {10,20,30,40,50};
		for(int i : x){
			System.out.println(i);
		}
		ArrayList<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.forEach((e)->System.out.println(e));
		

	}

}
