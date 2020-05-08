package com.sapient.shapes;

public class Square {
	private int sides;
	
	Square(int sides){
		this.sides = sides;
	}
	
	public void calculateArea() {
		System.out.println("The Area of the Square is " + (sides*sides));
	}
}
