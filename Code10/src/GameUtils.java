
public class GameUtils {
	
	public static void delay(long start){
		long startTime = System.currentTimeMillis();
		while(start<=1000000000){
			start++;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

	public static void main(String[] args) {
		delay(1);
	}
}
