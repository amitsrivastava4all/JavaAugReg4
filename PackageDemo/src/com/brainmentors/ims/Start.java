package com.brainmentors.ims;

import com.brainmentors.ims.billing.Billing;
import com.brainmentors.ims.billing.StudentCourseDetails;
import com.brainmentors.ims.courses.ProgrammingCourse;
import com.brainmentors.ims.students.ITStudents;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ITStudents student = new ITStudents();
		//student.printDetails();
		ProgrammingCourse c = new ProgrammingCourse();
		Billing bill = new Billing();
		StudentCourseDetails obj = bill.printBill(student, c); // 99,88
		System.out.println(obj.batchId);
		System.out.println(obj.batchFees);
		System.out.println(obj.student.name);
		System.out.println(obj.student.rollno);
		System.out.println(obj.course.id);
		for(String co : obj.course.courses)
		{
			System.out.println(co);
		}
		
		
		

	}

}
