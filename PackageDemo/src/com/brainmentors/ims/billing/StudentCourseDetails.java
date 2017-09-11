package com.brainmentors.ims.billing;

import com.brainmentors.ims.courses.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudents;

public class StudentCourseDetails {
	public ITStudents student ;
	public ProgrammingCourse course;
	public int batchId;
	public int batchFees;
	
	public StudentCourseDetails(ITStudents student, ProgrammingCourse course){
		this.student = student;
		this.course = course;
	}
	

}
