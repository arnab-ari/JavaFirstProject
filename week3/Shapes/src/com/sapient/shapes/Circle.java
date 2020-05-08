package com.sapient.shapes;

public class Circle {
	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	public void calculateArea() {
		System.out.println("The Area of the Circle is " + (3.14*radius*radius));
	}
}
