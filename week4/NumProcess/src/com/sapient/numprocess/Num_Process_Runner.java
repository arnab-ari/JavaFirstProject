package com.sapient.numprocess;

import java.util.Scanner;

public class Num_Process_Runner {

	public static void main(String[] args) {
		Num_Process add = (int x,int y) -> x+y;
		Num_Process substract = (int x,int y) -> x-y;
		Num_Process multiply = (int x,int y) -> x*y;
		Num_Process divide = (int x,int y) -> x/y;
		Num_Process[] operations = {add,substract,multiply,divide};
		int a,b;
		System.out.println("Enter the two numbers");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Enter the operation - \n0 -> Add\n1 -> Substract\n2 -> Multiply\n3 -> Divide\n");
		int operation = sc.nextInt();
		sc.close();
		int result = operations[operation].cal(a, b);
		System.out.println("The result is - " + result);
	}

}
