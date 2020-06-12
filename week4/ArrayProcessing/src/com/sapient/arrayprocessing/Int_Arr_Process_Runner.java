package com.sapient.arrayprocessing;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		Int_Arr_Process ob = new Int_Arr_Process(5);
		ob.readArray();
		ob.display();
		ob.sortArray();
		ob.display();
		ob.findBiggestAndSmallest();
		ob.findSum();
	}

}
