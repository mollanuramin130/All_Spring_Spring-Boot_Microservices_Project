package com.implimentation.beans;

public class Student {
	private String student_name;
	int student_rollNo;
	int math_Marks;
	private int physics_Marks;
	private float chemistry_marks;
	private double english_marks;
	private double physicalEdu_marks;
	private boolean examAttended;
	private double average;
	
	
	public Student() {
		super();
	}

	
	public Student(String student_name, int student_rollNo, int math_Marks, int physics_Marks, float chemistry_marks,
			double english_marks, double physicalEdu_marks, boolean examAttended) {
		super();
		this.student_name = student_name;
		this.student_rollNo = student_rollNo;
		this.math_Marks = math_Marks;
		this.physics_Marks = physics_Marks;
		this.chemistry_marks = chemistry_marks;
		this.english_marks = english_marks;
		this.physicalEdu_marks = physicalEdu_marks;
		this.examAttended = examAttended;
		if(examAttended) {
			this.average= (physics_Marks+chemistry_marks+english_marks+physicalEdu_marks+math_Marks)/5;
		}else {
			this.average=0;
		}

	}


	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_rollNo() {
		return student_rollNo;
	}

	public void setStudent_rollNo(int student_rollNo) {
		this.student_rollNo = student_rollNo;
	}

	public int getMath_Marks() {
		return math_Marks;
	}

	public void setMath_Marks(int math_Marks) {
		this.math_Marks = math_Marks;
	}

	public int getPhysics_Marks() {
		return physics_Marks;
	}

	public void setPhysics_Marks(int physics_Marks) {
		this.physics_Marks = physics_Marks;
	}

	public float getChemistry_marks() {
		return chemistry_marks;
	}

	public void setChemistry_marks(float chemistry_marks) {
		this.chemistry_marks = chemistry_marks;
	}

	public double getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(double english_marks) {
		this.english_marks = english_marks;
	}

	public double getPhysicalEdu_marks() {
		return physicalEdu_marks;
	}

	public void setPhysicalEdu_marks(double physicalEdu_marks) {
		this.physicalEdu_marks = physicalEdu_marks;
	}

	public boolean isExamAttended() {
		return examAttended;
	}

	public void setExamAttended(boolean isExamAttended) {
		this.examAttended = isExamAttended;
	}

	public double getAverage() {
		return average;
	}

	
	public double getResult() {
		if(examAttended()) {
			this.average= (physics_Marks+chemistry_marks+english_marks+physicalEdu_marks+math_Marks)/5;
			return average;
		}else {
			this.average=0;
			return average;
		}
	}
	
	public boolean examAttended() {
		return isExamAttended();
	}


	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", student_rollNo=" + student_rollNo + ", math_Marks="
				+ math_Marks + ", physics_Marks=" + physics_Marks + ", chemistry_marks=" + chemistry_marks
				+ ", english_marks=" + english_marks + ", physicalEdu_marks=" + physicalEdu_marks + ", isExamAttended="
				+ examAttended + ", average=" + getResult() + "]";
	}
	
	
}
