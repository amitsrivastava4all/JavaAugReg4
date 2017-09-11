package com.brainmentors.ims.common.courses;

public class ChildCourse {
	Course c = new Course();
	void printChild(){
		System.out.println(c.id+" "+c.name);
	}
}
