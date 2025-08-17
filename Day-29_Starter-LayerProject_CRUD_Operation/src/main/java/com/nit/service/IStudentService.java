package com.nit.service;

import java.util.List;

import com.nit.model.Student;

public interface IStudentService {
	public void studentInsert(Student student) throws Exception;

	public List<Student> viewAllStudent() throws Exception;

	public void editStudentById(int studentId, String updateEmail) throws Exception;

	public boolean deleteStudentById(int studentId) throws Exception;

	public List<Student> searchRecordByCourse(String course) throws Exception;
}
