
package com.org.exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.String;

public class EmployeeService {
	List<Employee> list = new ArrayList<Employee>();

	public void add(Employee e) {

		// TODO Auto-generated method stub
		list.add(e);
	}

	public String find(int a) {
		for (Employee emp : list) {
			if (emp.getId() == a)
				return emp.getName();
		}
		return "Id is not present";
	}

	public Iterable<Employee> display() {
		return list;
	}

	public void sortId() {
		Collections.sort(list, (e1, e2) -> e1.getId() - e2.getId());
	}

	public void sortName() {

		Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
	}

	public void sortSalary() {
		Collections.sort(list, (e1, e2) -> e1.getSalary() - e2.getSalary());
	}

	public void sortDOB() {
		Collections.sort(list, (e1, e2) -> e1.getDob().compareTo(e2.getDob()));

	}

}