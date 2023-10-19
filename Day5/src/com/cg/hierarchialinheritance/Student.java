package com.cg.hierarchialinheritance;

public class Student extends Person {
	private int rollNo;
	private float cgpa;
	private int classroom;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", cgpa=" + cgpa + ", classroom=" + classroom + "]";
	}

}
