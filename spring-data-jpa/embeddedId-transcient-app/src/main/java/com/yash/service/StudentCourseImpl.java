package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.entity.StudentCourse;
import com.yash.entity.StudentCourseId;
import com.yash.repository.StudentCourseRepository;

@Service("studentCourseService")
public class StudentCourseImpl implements StudentCourseService {
	
	@Autowired
	private StudentCourseRepository studentCourseRepository;

	@Override
	public StudentCourse saveRegistration(StudentCourse studentCourse) {
		return studentCourseRepository.save(studentCourse);
	}

	@Override
	public StudentCourse fetchRegistrationById(StudentCourseId studentCourseId) {
		return studentCourseRepository.findById(studentCourseId).orElseThrow(
					() -> new RuntimeException("Registration Not Found!")
				);
	}

	@Override
	public void deleteRegistration(StudentCourseId studentCourseId) {
		StudentCourse studentCourse = fetchRegistrationById(studentCourseId);
		studentCourseRepository.delete(studentCourse);
	}

}
