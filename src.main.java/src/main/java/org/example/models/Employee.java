package org.example.models;

public class Employee {

	private int id;

	
	public String geteName() {
		return eName;
	}

	public void setEname(String eName) {
		this.eName = eName;
	}

	private String eName;

	private Integer marks;

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				'}';
	}
}
