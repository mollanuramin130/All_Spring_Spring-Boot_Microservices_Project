package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Student;

@Repository
public class StudentImpDAO implements IStudentDAO {
	private final static String INSERT_QUERY="INSERT INTO STUDENT3(ID,NAME,SUBJECT,MARKS) VALUES(STU3_SQN.NEXTVAL, ?,?,?)";
	private final static String SELECT_ALL_QUERY="SELECT ID,NAME,SUBJECT,MARKS FROM STUDENT3";
	private final static String TOTAL_MARKS="SELECT SUM(MARKS),COUNT(*) FROM STUDENT3";

	@Autowired
	private DataSource ds;
	@Override
	public void addStudent(Student stu) throws Exception {
		// TODO Auto-generated method stub
		try(
				Connection connection=ds.getConnection();
				PreparedStatement ps=connection.prepareStatement(INSERT_QUERY);
				){
			ps.setString(1, stu.getStudentName());
			ps.setString(2, stu.getSubject());
			ps.setDouble(3, stu.getMarks());
			int count = ps.executeUpdate();
			if(count>0) {
				System.out.println("Student added successfully...");
			}
			
		}catch (Exception e) {
			throw e;
		}

	}

	@Override
	public List<Student> viewAllStudent() throws Exception {
		List<Student> students=new ArrayList<Student>();
		try(
				Connection connection=ds.getConnection();
				PreparedStatement ps=connection.prepareStatement(SELECT_ALL_QUERY);
				){
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				do {
					Student student=new Student();
					student.setStudentId(resultSet.getInt(1));
					student.setStudentName(resultSet.getString(2));
					student.setSubject(resultSet.getString(3));
					student.setMarks(resultSet.getDouble(4));
					students.add(student);
					
				}while(resultSet.next());
			}else {
				System.out.println("No record Found!");
			}
		}catch (Exception e) {
			throw e;
		}
		return students;
	}

	@Override
	public double averageMarkOfAllStudent() throws Exception {
		
		try(
				Connection connection=ds.getConnection();
				PreparedStatement ps=connection.prepareStatement(TOTAL_MARKS);
				){
			ResultSet resultSet = ps.executeQuery();
			if (resultSet.next()) {
				return resultSet.getDouble(1)/resultSet.getInt(2);
			}else {
				System.out.println("No record Found!");
			}
			
		}catch (Exception e) {
			throw e;
		}
		return -1;
	}

}
