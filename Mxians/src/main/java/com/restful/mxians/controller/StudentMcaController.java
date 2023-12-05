/**
 * 
 */
package com.restful.mxians.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.mxians.entity.Student;
import com.restful.mxians.service.StudentService;

/**
 * @author mglocadmin
 * 
 *         Chandrasekar EMP_ID:1120
 *
 */

@RestController
@RequestMapping(path = "api/v1")
public class StudentMcaController {

	@Autowired
	private StudentService studentService;

	
	
	
	// Constructor inject
//	public StudentMcaController(StudentService theStudentService) {
//		this.studentService = theStudentService;
//	}

	@GetMapping("/students")
	public ResponseEntity<List<Student>> studentList() {

		return ResponseEntity.ok(studentService.getAllStudent());
	}

	@GetMapping("/hello")
	public String display() {
		return " HELLO 22MXIANS";
	}

	@GetMapping(path = "/stud")
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

	@GetMapping(path = "/students/{id}")
	public Student getStudentById(@PathVariable("id") int studentId) {

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

		Student responseStudent = null;

		for (Student ii : student_List) {

			if (ii.getStudentId() == studentId) {
				responseStudent = new Student(ii.getStudentId(), ii.getName());
			}

		}

		return null;
	}

//	@GetMapping(path = "/stud")
//	public Student getStudentByIdAndByName(@RequestBody("")  ) {
//
//		// Create a list as type student
//		List<Student> student_List = new ArrayList<>();
//
//		Student student = new Student(203, "John Jecab");
//		Student student1 = new Student(208, " Jecab");
//		Student student2 = new Student(205, "Arun Jecab");
//		Student student3 = new Student(88, "Tonny");
//
//		// Add data to the list
//		student_List.add(student);
//		student_List.add(student1);
//		student_List.add(student2);
//		student_List.add(student3);
//		
//
//		Student responseStudent= null;
//		
//		for(Student ii: student_List) {
//			
//			if(ii.getStudentId() == studentId) {
//				responseStudent = new Student(ii.getStudentId(),ii.getName());
//			}
//			
//		}
//		
//	 ResponseEntity<T>
//
//		return null;
//	}

}
