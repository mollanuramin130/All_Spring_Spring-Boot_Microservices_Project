package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.dao.IStudentDAO;
import com.nit.model.Student;

@Service
public class StudentServiceImp implements IStudentService {
	@Autowired
	private IStudentDAO studentDAO;
	
	@Override
	public void studentInsert(Student student) throws Exception {
		try {
			studentDAO.studentInsert(student);
		} catch (Exception e) {
			throw new Exception("Error inserting student: " + e.getMessage(), e);
		}
		System.out.println("Student inserted successfully");		
	}

	@Override
	public List<Student> viewAllStudent() throws Exception {
		List<Student> studentList;
		try {
			studentList = studentDAO.viewAllStudent();
			if (studentList.isEmpty()) {
				throw new Exception("No records found");
			}
		} catch (Exception e) {
			throw new Exception("Error retrieving students: " + e.getMessage(), e);
		}
		return studentList;
	}

	@Override
	public void editStudentById(int studentId, String updateEmail) throws Exception {
		try {
			studentDAO.editStudentById(studentId, updateEmail);
			System.out.println("Student with ID " + studentId + " updated successfully");
		} catch (Exception e) {
			throw new Exception("Error updating student: " + e.getMessage(), e);
		}
		
	}

	@Override
	public boolean deleteStudentById(int studentId) throws Exception {
		boolean isDeleted;
		try {
			isDeleted = studentDAO.deleteStudentById(studentId);
			if (!isDeleted) {
				throw new Exception("Record not deleted");
			}
		} catch (Exception e) {
			throw new Exception("Error deleting student: " + e.getMessage(), e);
		}
		return isDeleted;
	}

	@Override
	public List<Student> searchRecordByCourse(String course) throws Exception {
		List<Student> studentList;
		try {
			studentList = studentDAO.searchRecordByCourse(course);
			if (studentList.isEmpty()) {
				throw new Exception("No records found for course: " + course);
			}
		} catch (Exception e) {
			throw new Exception("Error searching records by course: " + e.getMessage(), e);
		}
		return studentList;
	}

	
}
