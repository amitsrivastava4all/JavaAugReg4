import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Flow {
	Logger logger = Logger.getLogger(Flow.class);
	void view(){
		System.out.println("CAlling DB");
		try{
		db();
		System.out.println("Getting DB data");
		System.out.println("Printing DB Data");
		}
		catch(IOException e){
			System.out.println("SOmething went wrong.......");
			//logger.error(e);
			logger.error(MyLogger.error(e));
//			StringWriter sw = new StringWriter();
//			PrintWriter pw = new PrintWriter(sw);
//			
//			e.printStackTrace(pw);
//			logger.error(sw.toString());
		}
	}
	
	void db() throws IOException{
		try{
		System.out.println("DB COnnection is OPen");
		String path = "d:/Users/amit/Documents/files/abcd.txt";
		File file = new File(path);
		file.createNewFile(); // throw new IOException();
		/*if(age<18){
			throw new MinorAgeException();
		}*/
//		if(10>2){
//		throw new SQLException();
//		}
		//int d = 100/0;
		System.out.println("DB Query Is Fire");
		System.out.println("DB Query Result is Stored");
		}
		finally{
		System.out.println("DB Connection is Close");
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flow flow = new Flow();
		flow.view();
	}

}
