import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyCode {

	public static void main(String[] args) throws IOException {
		FileOutputStream fo  = new FileOutputStream("/Users/amit/Documents/songs/ECOPY.mp3");
		BufferedOutputStream bo = new BufferedOutputStream(fo,10000);
		FileInputStream fs =  new FileInputStream("/Users/amit/Documents/songs/E.mp3");
		BufferedInputStream bs = new BufferedInputStream(fs,10000);
		int singleByte = bs.read();
		while(singleByte!=-1){
			bo.write(singleByte);
			singleByte = bs.read();
		}
		bo.close();
		fo.close();
		bs.close();
		fs.close();
		System.out.println("Copy Done...");
		

	}

}
