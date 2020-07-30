package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class AddEmployee {
	List<Employee> list = new ArrayList<Employee>();
	
	void addEmployee(Employee emp) {
		list.add(emp);
	}
	
	Employee getEmployee(int id) {
		for(Employee emp: this.list) {
			if(emp.getId() == id)
				return emp;
		}
		return null;
	}
	
	int getSize() {
		return this.list.size();
	}
}
