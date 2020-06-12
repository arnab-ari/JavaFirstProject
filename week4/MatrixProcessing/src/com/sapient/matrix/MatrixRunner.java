package com.sapient.matrix;

public class MatrixRunner {

	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.getMatrix();
		m1.display();
		Matrix m2 = new Matrix(m1);
		Matrix sum = m1.add(m2);
		Matrix product = m1.multiply(m2);
		System.out.println("The sum-");
		sum.display();
		System.out.println("The product-");
		product.display();
		Matrix m3 = new Matrix(3,3);
		m3.getMatrix();
		m3.checkScalar();
	}

}
