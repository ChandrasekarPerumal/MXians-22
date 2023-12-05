package com.restful.mxians.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.mxians.entity.Student;


@Service
public class StudentService {
	
	

	public List<Student> getAllStudent() {
		// Create a list as type student
		List<Student> student_List = new ArrayList<>();

		Student student = new Student(203, "John Jecab");
		Student student1 = new Student(208, " Jecab");
		Student student2 = new Student(205, "Arun Jecab");
		Student student3 = new Student(88, "Tonny");

		// Add data to the list
		student_List.add(student);
		student_List.add(student1);
		student_List.add(student2);
		student_List.add(student3);

		return student_List;

	}

}
