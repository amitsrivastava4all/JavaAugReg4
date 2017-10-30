import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		final int EOF = -1;
		String path = "/Users/amit/Documents/JavaBatchAug430Reg/FileHandlingDemo/src/FileRead.java";
		//String path = "/Users/amit/Documents/files/xyz.txt";
		File file = new File(path);
		if(!file.exists()){
			System.out.println("Can't Read this file , It is not exist");
			return ;
		}
		FileInputStream fs = new FileInputStream(file);
		int singleByte = fs.read();
		while(singleByte!=EOF){
			System.out.print((char)singleByte);
			singleByte = fs.read();
		}
		fs.close();
		
		
	}

}
