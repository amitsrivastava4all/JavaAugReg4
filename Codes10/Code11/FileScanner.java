import java.io.File;

public class FileScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path ="/Users/amit/Documents/files";
		File file = new File(path);
		File files[] = file.listFiles();
		int fileCount = 0;
		int dirCount = 0;
		for(File f : files){
			if(f.isDirectory()){
				dirCount++;
				System.out.println("<DIR> "+f.getName());
			}
			else if(f.isFile()){
				fileCount++;
				int index = f.getName().lastIndexOf(".");
				String fileName = f.getName().substring(0, index);
				System.out.println("INdex "+index);
				System.out.println(path+"/"+fileName+".haha");
				f.renameTo(new File(path+"/"+fileName+".haha"));
				//f.delete();
			}
		}
		System.out.println("No of Dir "+dirCount);
		System.out.println("No Of Files "+fileCount);
	}

}
