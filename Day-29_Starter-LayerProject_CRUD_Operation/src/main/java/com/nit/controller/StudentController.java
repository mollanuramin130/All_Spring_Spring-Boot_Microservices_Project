package com.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.model.Student;
import com.nit.service.IStudentService;

@Component("studentController")
public class StudentController {
	@Autowired
	private IStudentService studentService;
	
	public void studentInsert(Student student) throws Exception{
		
		try {
			studentService.studentInsert(student);
		} catch (Exception e) {
			throw new Exception("Error inserting student: " + e.getMessage(), e);
		}
		System.out.println("Student inserted successfully");
	}
	public List<Student> viewAllStudent() throws Exception{
		
		List<Student> studentList;
		try {
			studentList = studentService.viewAllStudent();
			if (studentList.isEmpty()) {
				throw new Exception("No records found");
			}
		} catch (Exception e) {
			throw new Exception("Error retrieving students: " + e.getMessage(), e);
		}
		return studentList;
	}
	public void editStudentById(int studentId,String updateEmail) throws Exception{
		
		try {
			studentService.editStudentById(studentId, updateEmail);
			System.out.println("Student with ID " + studentId + " updated successfully");
		} catch (Exception e) {
			throw new Exception("Error updating student: " + e.getMessage(), e);
		}
	}
	public boolean deleteStudentById(int studentId) throws Exception{
		
		boolean isDeleted;
		try {
			isDeleted = studentService.deleteStudentById(studentId);
			if (!isDeleted) {
				throw new Exception("Record not deleted");
			}
		} catch (Exception e) {
			throw new Exception("Error deleting student: " + e.getMessage(), e);
		}
		return isDeleted;
	}
	public List<Student> searchRecordByCourse(String course) throws Exception{
		
		List<Student> studentList;
		try {
			studentList = studentService.searchRecordByCourse(course);
			if (studentList.isEmpty()) {
				throw new Exception("No records found for course: " + course);
			}
		} catch (Exception e) {
			throw new Exception("Error searching records by course: " + e.getMessage(), e);
		}
		return studentList;
	}
	
}
