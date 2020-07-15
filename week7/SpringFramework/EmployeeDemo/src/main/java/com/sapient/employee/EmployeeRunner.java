package com.sapient.employee;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeRunner {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("EmployeeBean.xml");
		ApplicationContext context1 = new ClassPathXmlApplicationContext("beanEAOP.xml");
		
		Employee e1 = (Employee) context.getBean("ebean1");
		System.out.println(e1);
		Employee e2 = (Employee) context.getBean("ebean2");
		System.out.println(e2);
		
		Employee e3 = (Employee) context.getBean("ebean3");
		System.out.println(e3);
		
		EmployeeDemo d1 = (EmployeeDemo) context1.getBean("E1");
		
		d1.addEmployee(e1);
		d1.addEmployee(e2);
		d1.addEmployee(e3);
		
		ApplicationContext context2 = new AnnotationConfigApplicationContext(com.sapient.employee.JavaContainer.class);
		
		Employee e4 = context2.getBean(Employee.class);		//e4 created using java container
		
		e4.setId(105);
		e4.setName("Tokai Ari");
		e4.setCity("Cpur");
		
		d1.addEmployee(e4);
		
		try {
			d1.displayEmployeeInfo(105);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
