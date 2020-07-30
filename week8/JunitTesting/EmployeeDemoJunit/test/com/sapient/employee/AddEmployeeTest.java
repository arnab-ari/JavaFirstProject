package com.sapient.employee;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddEmployeeTest {
	private Employee emp;
	private AddEmployee empList;
	
	@Before
	public void setup() {
		emp = new Employee(101,"Ari","Haldia");
		empList = new AddEmployee();
	}
	
	@Test
	public void addEmployee_Should_Add_An_Employee() {
		empList.addEmployee(emp);
		int result = empList.getSize();
		assertNotNull(result);
		assertEquals(1,result);
	}
	
	@Test
	public void getEmployee_Should_Return_An_Existing_Employee() {
		empList.addEmployee(emp);
		Employee e = empList.getEmployee(101);
		String actual = e.toString();
		String expected = emp.toString();
		assertNotNull(e);
		assertEquals(expected,actual);
	}
	
	@Test
	public void getEmployee_Should_Return_Null() {
		empList.addEmployee(emp);
		Employee e = empList.getEmployee(102);
		assertNull(e);
	}

}
