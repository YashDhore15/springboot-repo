package com.yash.entity;

import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StudentCourse {
	
	@EmbeddedId
	private StudentCourseId studentCourseId;
	
	private LocalDate enrollmentDate;
	private Float marks;
	
	@Transient
	private Character grade;
	
	public void setMarks(Float marks) {
		this.marks = marks;
		calculateGrade();
	}
	
	public void calculateGrade() {

	    if (marks == null) {
	        grade = null;
	    } else if (marks >= 90) {
	        grade = 'A';
	    } else if (marks >= 80) {
	        grade = 'B';
	    } else if (marks >= 70) {
	        grade = 'C';
	    } else if (marks >= 60) {
	        grade = 'D';
	    } else {
	        grade = 'F';
	    }
	}
}



