package com.sapient.arrayprocessing;

import java.util.Scanner;
import java.util.Arrays;

public class Int_Arr_Process {
	private int noOfElements;
	int[] arr;
	
	public Int_Arr_Process() {
		this.noOfElements = 10;
		this.arr = new int [this.noOfElements];
	}
	
	public Int_Arr_Process(int noOfElements) {
		this.noOfElements = noOfElements;
		this.arr = new int [this.noOfElements];
	}
	
	public Int_Arr_Process(Int_Arr_Process ob) {
		this.noOfElements = ob.noOfElements;
		this.arr = new int [this.noOfElements];
		for(int i = 0;i<this.noOfElements;i++) {
			this.arr[i] = ob.arr[i];
		}
	}
	
	public void readArray() {
		System.out.println("Enter the array elements");
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<this.noOfElements;i++) {
			this.arr[i] = sc.nextInt();
		
		}
		sc.close();
	}
	
	public void display() {
		for(int i = 0;i< this.noOfElements; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		for(int i = 0;i< this.noOfElements; i++)
			System.out.println(arr[i]);
	}
	
	public void sortArray() {
		Arrays.sort(arr);
	}
	
	public void findBiggestAndSmallest() {
		int biggest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		
		for(int i = 0;i < this.noOfElements;i++) {
			if(arr[i]>biggest)
				biggest = arr[i];
			if(arr[i]<smallest)
				smallest = arr[i];
		}
		System.out.println("Biggest = " + biggest + " Smallest = "+ smallest);
	}
	
	public void findSum() {
		int sum = 0;
		for(int elements : arr)
			sum += elements;
		System.out.println("Sum = " + sum);
	}
}
