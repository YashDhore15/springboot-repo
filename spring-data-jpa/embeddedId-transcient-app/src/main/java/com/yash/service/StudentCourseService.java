package com.yash.service;

import com.yash.entity.StudentCourse;
import com.yash.entity.StudentCourseId;

public interface StudentCourseService {
	
	public StudentCourse saveRegistration(StudentCourse studentCourse);
	public StudentCourse fetchRegistrationById(StudentCourseId studentCourseId);
	public void deleteRegistration(StudentCourseId studentCourseId);
}
