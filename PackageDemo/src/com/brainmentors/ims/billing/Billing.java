package com.brainmentors.ims.billing;

import com.brainmentors.ims.courses.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudents;

public class Billing {
	
	// Student Details , Course Details

	public StudentCourseDetails printBill(ITStudents student, ProgrammingCourse course){
		StudentCourseDetails studentCourse = new StudentCourseDetails(student, course);
		studentCourse.batchFees = 12000;
		studentCourse.batchId=100;
		return studentCourse;
	}
}
