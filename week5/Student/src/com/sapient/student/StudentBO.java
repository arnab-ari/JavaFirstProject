package com.sapient.student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StudentBO {
	List<Student> students = new ArrayList<Student>(Arrays.asList(new Student[] {new Student(101,"Arnab","Tajnagar"), new Student(102,"Ari","Sutahata"), new Student(103,"Arpan","Haldia"),  new Student(104,"Sara","Cpur")}));
    Scanner sc = new Scanner(System.in);
	public void readStudent() {
		System.out.println("Enter the name id, name and city of the students");
		students.add(new Student(Integer.parseInt(sc.nextLine()),sc.nextLine(),sc.nextLine()));	
	}
	public void displayStudent() {
		students.stream().forEach(System.out::println);
	}
	public void studentsFromCity(String city) {
		students.stream().filter(student -> student.getCity().equals(city)).forEach(System.out :: println);
		
	}
	public void sortByName() {
		students.sort((student1,student2) -> student1.getName().compareTo(student2.getName()));
		students.stream().forEach(System.out :: println);
	}
	public void sortByCity() {
		students.sort((student1,student2) -> student1.getCity().compareTo(student2.getCity()));
		students.stream().forEach(System.out :: println);
	}
	public void studentsOfId(int id) {
		students.stream().filter(student -> student.getId() == id).forEach(System.out :: println);
	}

}
