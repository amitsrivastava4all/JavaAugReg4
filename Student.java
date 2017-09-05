// OOPS + OOAD
public class Student {
	private int rollno;
	private String name;
	private int marks[] = new int[3];
	private String collegeName;
	Student(){
		collegeName = "SRCC";
		name = "N/A";
		
	}
	Student(int rollno, String name){
		this();
		this.rollno = rollno;
		this.name= name;
	}
	
	Student(int rollno, int [] marks){
		this();
		this.rollno = rollno;
		this.marks = marks;
	}
	
	Student(int rollno , String  name , int [] marks){
		this(rollno, name);
		
		this.marks = marks;
				
	}
	
	private int totalMarks(){
		int sum = 0;
		for(int mark:marks){
			sum+=mark;
		}
		return sum;
	}
	
	private double percentage(){
		return totalMarks()/marks.length;
	}
	
	private String grade(){
		return percentage()>90?"A Grade ":"B Grade";
	}
	
	
	public String printMarkSheet(){
		String strMark = "";
		String result ="***********************************************\n"
		+"\t " +collegeName +"MARK SHEET OF ::: "+this.name+"\n"+
		"ROLLNO "+rollno+"MARKS ARE :::\n";
		for(int mark: marks){
			strMark += mark +"\n";
			//System.out.println(mark);
		}
		result +=strMark+"Total Marks "+totalMarks()+"\n"
		+"Percentage "+percentage()+"\n"+
		"Grade "+grade();
		return result; 
	}
	
	

}
