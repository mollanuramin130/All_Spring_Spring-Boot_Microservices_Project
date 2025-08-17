package com.nit.dao;

import java.util.List;

import com.nit.model.Student;

public interface IStudentDAO {
	public void addStudent(Student student) throws Exception;
	public List<Student> viewAllStudent() throws Exception;
	public double averageMarkOfAllStudent() throws Exception;
}
