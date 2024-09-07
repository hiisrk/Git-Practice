package org.example.models;

public class Employee {

	private int id;

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
