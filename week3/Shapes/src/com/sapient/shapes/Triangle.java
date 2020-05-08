package com.sapient.shapes;

public class Triangle {
	private int  sides;
	
	Triangle(int sides){
		this.sides = sides;
	}
	public void calculateArea() {
		System.out.println("The Area of the Triangle is " + (0.433*sides*sides));
	}
}
