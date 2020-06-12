package com.sapient.matrix;

import java.util.Scanner;

public class Matrix {
	private int rows;
	private int columns;
	int [][] matrix;
	
	public Matrix() {
		this(3,3);
	}
	
	public Matrix(int rows,int columns) {
		this.rows = rows;
		this.columns = columns;
		
		matrix = new int [this.rows][];
		for(int i = 0;i<this.rows;i++)
			matrix[i] = new int[this.columns];
	}
	
	public Matrix (Matrix m) {
		this(m.rows,m.columns);
		for(int i = 0;i<this.rows;i++)
			for(int j = 0;j<this.columns;j++)
				this.matrix[i][j] = m.matrix[i][j];
	}
	public void getMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the matrix elements");
		for(int i = 0;i<this.rows;i++)
			for(int j = 0;j<this.columns;j++)
				matrix[i][j] = sc.nextInt();
		sc.close();
	}
	
	public void display() {
		for(int i = 0;i< rows;i++) {
			for(int j = 0;j<columns;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public Matrix add(Matrix m) {
		if(m.rows == this.rows && m.columns == this.columns) {
			Matrix sum = new Matrix(this.rows,this.columns);
			for(int i = 0;i<this.rows;i++)
				for(int j= 0;j<this.columns;j++)
					sum.matrix[i][j] = this.matrix[i][j] + m.matrix[i][j];
			return sum;
		}
		else {
			System.out.println("Sum not possible");
			return null;
		}
	}
	
	public void checkScalar() {
		if(this.rows == this.columns){
			Boolean isScalar = true;
			int e = this.matrix[0][0];
			for(int i=0; i<rows; i++) {
				if(this.matrix[i][i] != e){
					isScalar = false;
				}
				for(int j=0; j<this.columns; j++) {
					if(i!=j && this.matrix[i][j] != 0){
						isScalar = false;	
					}
				}
			}	
			if(isScalar){
				System.out.println("The matrix is scalar");
			}
			else{
				 System.out.println("The matrix is not scalar");
			}

		}
		else
			System.out.println("Cannot detect if the matrix is scalars");
	}
	
	public Matrix multiply(Matrix m){
		if( this.columns == m.rows) {
			Matrix product = new Matrix(this.rows,m.columns);
			for(int i=0; i<this.rows; i++) {
				for(int j=0; j<m.columns ; j++) {
					for(int k=0; k<this.columns; k++) {
						product.matrix[i][j] += this.matrix[i][k] * m.matrix[k][j];
					}
				}
			}
			return product;
		}
		else {
			System.out.println("Incompatible dimensions to multiply matrices");
			return null;
		}	
	}
}

