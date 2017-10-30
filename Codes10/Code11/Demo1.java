import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// File Write
		// c:\\abcd\\xyz.txt
		Scanner scanner= new Scanner(System.in);
		String path = "/Users/amit/Documents/files/xyz.txt";
		File file = new File(path);
		if(file.exists()){
			System.out.println("This file is Already Exist , Now i want to append ");
			FileOutputStream fs = new FileOutputStream(file,true);
			System.out.println("Enter the Data to Append in a File");
			String data = scanner.nextLine(); 
			fs.write(data.getBytes());  // Data Write in a File
			fs.close();
			//System.out.println("Do u want to override");
		}
		else
		{
			file.createNewFile();
			FileOutputStream fs = new FileOutputStream(file);  // File Open
			System.out.println("Enter the Data to Store in a File");
			String data = scanner.nextLine(); 
			fs.write(data.getBytes());  // Data Write in a File
			fs.close();
			System.out.println("Data Store in a file...");
		}

	}

}
