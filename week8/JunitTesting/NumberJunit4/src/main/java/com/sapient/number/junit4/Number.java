package com.sapient.number.junit4;
import java.lang.Math;
public class Number {
	
	public int checkPrime(int x) {
		int result = 1;
		for(int i = 2 ;i <= Math.sqrt(x); i++)
			if(x % i == 0) {
				result = 0;
				break;
			}
		return result;
	}
	
	public boolean checkAmstrong(int x) {
		boolean result = false;
		int sum= 0,digit,num = x;
		while(num != 0) {
			digit = num % 10;
			sum += digit * digit * digit;
			num = num / 10;
		}
		if(sum == x )
			result = true;
		
		return result;
	}
	
	public boolean checkPalindrome(int x) {
		boolean result = true;
		String strNum = Integer.toString(x);
		char [] strNumArr = strNum.toCharArray();
		for(int i = 0;i <= (strNumArr.length - 1) / 2;i++){
			if(strNumArr[i] != strNumArr[strNumArr.length - 1 - i]) {
				result = false;
				break;
			}
		}
		return result;
	}
}
