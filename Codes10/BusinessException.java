import java.util.Scanner;

class MinorAgeException extends Exception{
	private int age;
	private String message;
	 MinorAgeException(int age, String message) {
		this.age = age;
		this.message = message;
	}
	 public String toString(){
		 return message + " "+age;
	 }
}
public class BusinessException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try{
		if(age<18){
			throw new MinorAgeException(age,"U r Age is Less , so U r a Minor");
		}
		System.out.println("Congrats U can Apply for Following...");
		System.out.println("U can Apply for DL");
		System.out.println("U Can Apply for VoterId");
		}
		catch(MinorAgeException e){
			System.out.println(e);
		}
		finally{
			if(scanner!=null){
			scanner.close();
			}
		}

	}

}
