package com.cg.hierarchialinheritance;

public class Employee extends Person {

	private int id;
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
	

}
