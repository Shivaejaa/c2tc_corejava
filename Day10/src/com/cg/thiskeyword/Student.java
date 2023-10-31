package com.cg.thiskeyword;

public class Student {
	
	//instance variables
	private int id;  //unique
	private String name; //unique
	private float fee; //unique
	private String college; //same
	
	
	
	public Student(int id,String name,float fees,String college, float fee)
	{
		this.id=id;
		this.name=name;
		this.fee=fee;
		this.college=college;
		
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fee=" + fee + ", college=" + college + "]";
	}
	
	
	
	
	
	
	
}
