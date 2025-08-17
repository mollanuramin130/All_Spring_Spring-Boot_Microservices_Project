package com.nit.service;

import java.util.List;

import com.nit.model.Student;

public interface IStudentService {
	public void addStudent(Student student) throws Exception;
	public List<Student> viewAllStudent() throws Exception;
	public double averageMarkOfAllStudent() throws Exception;
}
