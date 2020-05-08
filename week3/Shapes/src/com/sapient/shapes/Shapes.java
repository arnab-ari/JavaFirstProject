package com.sapient.shapes;

public class Shapes {
	

	public static void main(String[] args) {
		calculateShapeArea(3,12);
		calculateShapeArea(4,15);
		calculateShapeArea(5,15);

	}
	
	static void calculateShapeArea(int numberOfSides,int side) {
		switch(numberOfSides) {
		case 1:
			Circle circle = new Circle(side);
			circle.calculateArea();
			break;
		case 3:
			Triangle triangle = new Triangle(side);
			triangle.calculateArea();
			break;
		case 4:
			Square square = new Square(side);
			square.calculateArea();
			break;
		default:
			System.out.println("No Shapes Present");
				
		
			
		}
	}

}
