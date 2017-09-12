import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Day Mon Year");
		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();
		int mon = scanner.nextInt();
		int year = scanner.nextInt();
		Calendar c = Calendar.getInstance();
		c.set(Calendar.DATE, day);
		c.set(Calendar.MONTH,(mon-1));
		c.set(Calendar.YEAR, year);
		Date date = c.getTime();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(String.valueOf(Calendar.DAY_OF_WEEK));
		switch(c.get(Calendar.DAY_OF_WEEK)){
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;	
			case 4:
				System.out.println("Wed");
				break;
			case 5:
				System.out.println("Thur");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Sat");
				break;	
		}
		System.out.println(date);

	}

}
