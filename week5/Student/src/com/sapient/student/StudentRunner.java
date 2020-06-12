package com.sapient.student;

public class StudentRunner {
	public static void main(String[] args) {
		StudentBO student = new StudentBO();
		student.readStudent();
		student.displayStudent();
		student.studentsFromCity("Haldia");
		student.sortByName();
		student.sortByCity();
		student.studentsOfId(103);
	}
}
