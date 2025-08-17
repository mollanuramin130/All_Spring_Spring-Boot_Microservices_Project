package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.model.Student;
import com.nit.service.IStudentService;

@Controller("controller")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	public void addStudent(Student student) throws Exception {
		student.setStudentName(student.getStudentName().toUpperCase());
		student.setSubject(student.getSubject().toUpperCase());
		studentService.addStudent(student);
	}

	public List<Student> viewAllStudent() throws Exception {
		return studentService.viewAllStudent();
	}

	public double averageMarkOfAllStudent() throws Exception {
		return studentService.averageMarkOfAllStudent();
	}
}
