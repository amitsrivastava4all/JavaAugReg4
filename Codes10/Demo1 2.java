import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {
		// String path = "c:\\users\\amit
		String path = "/Users/amit/Documents/files/abcd.txt";
		File file = new File(path);
		boolean isopen = false;
		try{
			System.out.println("DB Connection is Open....");
			isopen = true;
			if(10>2){
				//System.exit(0);
				return ;
			}
		file.createNewFile();  //throw new IOException();  Implicit Throw
		//int w = 109/0;  // throw new ArithmeticException();
		System.out.println("This code will not run when exception is here");
		System.out.println("I will run only no exception...");
		//System.out.println("DB COnnection Close...");
		}
		catch(IOException e){
			System.out.println("There is some Problem while creating file , contact to System vendor");
			
		}
		catch(ArithmeticException e){
			System.out.println("U divide a number with Zero ");
		}
		catch(Exception e){
			System.out.println("Some Mis Exception Occured....");
		}
		finally{
			// Resource Clean Up Code
			System.out.println("DB COnnection Close...");
		}
		}

}
