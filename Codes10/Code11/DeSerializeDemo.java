import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/files/abcd.dat";
		File file = new File(path);
		if(!file.exists()){
			System.out.println("File Not Found...");
			return ;
		}
		FileInputStream fs = new FileInputStream(file);
		ObjectInputStream os = new ObjectInputStream(fs);
		Customer customer = (Customer)os.readObject();
		System.out.println(customer); // customer.toString()
		fs.close();
		os.close();
		

	}

}
