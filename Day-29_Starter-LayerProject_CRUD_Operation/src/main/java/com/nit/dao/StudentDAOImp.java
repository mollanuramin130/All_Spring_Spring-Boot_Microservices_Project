package com.nit.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.model.Student;

@Repository
public class StudentDAOImp implements IStudentDAO {
	private static final String INSERT_QUERY="INSERT INTO STUDENT (ID,NAME,EMAIL,COURSE,REGISTRATION_DATE) VALUES(STU_SEQ1.NEXTVAL,?,?,?,?)";
	private static final String SELECT_ALL_QUERY="SELECT ID,NAME,EMAIL,COURSE,REGISTRATION_DATE FROM STUDENT2";
	private static final String UPDATE_QUERY="UPDATE STUDENT2 SET EMAIL=? WHERE ID=?";
	private static final String DELETE_QUERY="DELETE STUDENT2 WHERE ID=?";
	private static final String SEARCH_BY_COURSE_QUERY="SELECT ID,NAME,EMAIL,COURSE,REGISTRATION_DATE FROM STUDENT2 WHERE COURSE=?";
	
	@Autowired
	private DataSource ds;

	@Override
	public void studentInsert(Student student) throws Exception {
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(INSERT_QUERY);
				) {
			ps.setString(1, student.getStudentName());
			ps.setString(2, student.getEmail());
			ps.setString(3, student.getCourse());
			ps.setDate(4,Date.valueOf(student.getRegistrationDate()));
			int count = ps.executeUpdate();
			if (count == 0) {
				throw new Exception("Record not inserted");
			}
			System.out.println("Record inserted successfully");
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

	@Override
	public List<Student> viewAllStudent() throws Exception {
		try (
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(SELECT_ALL_QUERY);
				) {
			List<Student> studentList = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getInt("ID"));
				student.setStudentName(rs.getString("NAME"));
				student.setEmail(rs.getString("EMAIL"));
				student.setCourse(rs.getString("COURSE"));
				student.setRegistrationDate(rs.getDate("REGISTRATION_DATE").toLocalDate());
				studentList.add(student);
			}
			return studentList;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error while fetching records");
		}
	}



	@Override
	public boolean deleteStudentById(int studentId) throws Exception {
		// TODO Auto-generated method stub
		try (
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(DELETE_QUERY);
				) {
			ps.setInt(1, studentId);
			int count = ps.executeUpdate();
			if (count == 0) {
				throw new Exception("Record not deleted");
			}
			System.out.println("Record deleted successfully");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error while deleting record");
		}
	}

	@Override
	public List<Student> searchRecordByCourse(String course) throws Exception {
		// TODO Auto-generated method stub
		try (
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(SEARCH_BY_COURSE_QUERY);
				) {
			ps.setString(1, course);
			List<Student> studentList = new ArrayList<>();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setStudentId(rs.getInt("ID"));
				student.setStudentName(rs.getString("NAME"));
				student.setEmail(rs.getString("EMAIL"));
				student.setCourse(rs.getString("COURSE"));
				student.setRegistrationDate(rs.getDate("REGISTRATION_DATE").toLocalDate());

				studentList.add(student);
			}
			return studentList;
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error while searching records by course");
		}
	}

	@Override
	public void editStudentById(int studentId, String updateEmail) throws Exception {
		// TODO Auto-generated method stub
		try(
				Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(UPDATE_QUERY);
				) {
			ps.setString(1, updateEmail);
			ps.setInt(2, studentId);
			int count = ps.executeUpdate();
			if (count == 0) {
				throw new Exception("Record not updated");
			}
			System.out.println("Record updated successfully");
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error while updating record");
		}
		
	}

}
