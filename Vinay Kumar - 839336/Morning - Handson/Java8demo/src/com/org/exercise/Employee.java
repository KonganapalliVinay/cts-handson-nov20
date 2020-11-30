package com.org.exercise;

import java.util.List;
import java.util.ArrayList;

public class Employee {

	@Override
	public String toString() {
		return "Emploee [Id=" + Id + ", Name=" + Name + ", Dob=" + Dob + ", Salary=" + Salary + ", emp=" + emp + "]";
	}

	private int Id;
	private String Name;
	private String Dob;
	private int Salary;

	List<Employee> emp = new ArrayList<Employee>();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public Employee(int a, String b, String c, int e) {
		super();
		Id = a;
		Name = b;
		Dob = c;
		Salary = e;
	}

}