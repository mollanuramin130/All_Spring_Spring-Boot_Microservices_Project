package com.nit.dao;

import java.util.List;

import com.nit.model.Student;

public interface IStudentDAO {
	public void studentInsert(Student student) throws Exception;
	public List<Student> viewAllStudent() throws Exception;
	public void editStudentById(int studentId,String updateEmail) throws Exception;
	public boolean deleteStudentById(int studentId) throws Exception;
	public List<Student> searchRecordByCourse(String course) throws Exception;
}
