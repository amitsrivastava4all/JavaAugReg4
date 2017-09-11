package com.brainmentors.ims.students;

import com.brainmentors.ims.courses.ProgrammingCourse;

public class ITStudents {
	ProgrammingCourse programmingCourse = new ProgrammingCourse();
	public int rollno;
	public String name;
	public ITStudents(){
		rollno =101;
		name = "RAM";
	}
	public void printDetails(){
		programmingCourse.print();
	}

}
