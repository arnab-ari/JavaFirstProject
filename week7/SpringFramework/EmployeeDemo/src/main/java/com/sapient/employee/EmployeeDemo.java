package com.sapient.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDemo {
	
	List <Employee> employeeList;
	
	public EmployeeDemo() {
		this.employeeList = new ArrayList<Employee> ();
	}
	
	public void addEmployee(Employee e) {
		this.employeeList.add(e);
	}
	public void printSize() {
		System.out.println("Created");
		System.out.println(this.employeeList.size());
	}

	public void displayEmployeeInfo(Integer id) {
		for(Employee employee: employeeList) {
			if(employee.getId() == id)
				System.out.println(employee);
		}
	}
	
}
