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
	public void addStudent(Student student) throws Exception {
		studentDAO.addStudent(student);
	}

	@Override
	public List<Student> viewAllStudent() throws Exception {
		return studentDAO.viewAllStudent();
	}

	@Override
	public double averageMarkOfAllStudent() throws Exception {
		return studentDAO.averageMarkOfAllStudent();
	}

}
