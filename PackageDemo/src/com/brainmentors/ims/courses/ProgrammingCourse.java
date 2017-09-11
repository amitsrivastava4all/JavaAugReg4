package com.brainmentors.ims.courses;

import com.brainmentors.ims.common.courses.Course;

public class ProgrammingCourse extends Course {
	public String courses[];
	public int id;
	public ProgrammingCourse(){
		id =1111;
		String courses[] = {"C","C++","Java","MEAN"};
		this.courses = courses;
	}
	
	public void print(){
		int id = 1;
		System.out.println("Parent Id "+super.id+" Current Object ID "+this.id+" Local Id "+id);
		System.out.println("Name is "+super.name);
		System.out.println("Programming Courses are ::");
		for(String course: courses){
			System.out.println(course);
		}
	}

}
