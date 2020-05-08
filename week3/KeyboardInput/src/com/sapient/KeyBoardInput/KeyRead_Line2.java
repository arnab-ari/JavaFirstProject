package com.sapient.KeyBoardInput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 

public class KeyRead_Line2 {
	List<Integer> list = new ArrayList<>();
	int noOfElements; //number of data entries
	private Scanner scanner;
	
	public void read(){
		scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int noOfElements = scanner.nextInt();
		this.noOfElements = noOfElements;
		for (int i = 0; i<noOfElements ; i++) {
			list.add(scanner.nextInt());
		}	
	}

	public void display() {
		 System.out.println(list);	
	}
	
	public void sort() {
		Collections.sort(list);
	}
	
	public void find(int n) {
		if(list.indexOf(n) != -1) {
			System.out.println("Number is present");
		}
		else {
			System.out.println("Number is not present");
		}
	}
	
}
