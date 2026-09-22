package com.yash.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.yash.entity.StudentCourse;
import com.yash.entity.StudentCourseId;
import com.yash.service.StudentCourseService;

@Component
public class MyAppRunner implements ApplicationRunner {
	
	@Autowired
	private StudentCourseService studentCourseService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {


		// Case 1 : Save Registration
		StudentCourse studentCourse = StudentCourse.builder()
									 .studentCourseId(new StudentCourseId(2, 101))
									 .enrollmentDate(LocalDate.now())
									 .marks(70f)
									 .build();
		
		studentCourse = studentCourseService.saveRegistration(studentCourse);
		
		StudentCourse studentCourse2 = StudentCourse.builder()
				 .studentCourseId(new StudentCourseId(1, 102))
				 .enrollmentDate(LocalDate.now())
				 .marks(65f)
				 .build();
		
		studentCourseService.saveRegistration(studentCourse2);
		
		System.out.println("Registration Saved!");


/*
		// Case 2 : Find By Id
		
		StudentCourse studentCourse = studentCourseService.fetchRegistrationById(
					new StudentCourseId(1, 102)
				);
		
		studentCourse.calculateGrade();
		
		System.out.println("Registration : ");
		System.out.println("Student Course Id : " + studentCourse.getStudentCourseId());
		System.out.println("Enrollment Date : " + studentCourse.getEnrollmentDate());
		System.out.println("Marks : " + studentCourse.getMarks());
		System.out.println("Grade : " + studentCourse.getGrade());
*/
		
		// Case 3 : Delete Registration
		
//		studentCourseService.deleteRegistration(new StudentCourseId(2, 101));
	}

}















