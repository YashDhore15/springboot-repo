package com.yash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.StudentCourse;
import com.yash.entity.StudentCourseId;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, StudentCourseId> {

}
