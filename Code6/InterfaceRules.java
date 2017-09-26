import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

interface A{
	void show();
	int X= 100; // public static final int X = 100;
}
interface B{
	void show();
	void disp();
	int X= 200; 
}
interface C extends A,B{
	void print();
}
class D implements C{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(A.X + B.X);
	}
	
}
class X extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Logic for closing..");
	}
}
public class InterfaceRules {

	public static void main(String[] args) {
		WindowListener l ;
		WindowAdapter w;
		
		// TODO Auto-generated method stub
		D obj = new D();
		obj.print();
	}

}
