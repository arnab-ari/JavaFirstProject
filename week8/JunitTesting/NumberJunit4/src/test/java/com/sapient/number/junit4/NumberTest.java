package com.sapient.number.junit4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class NumberTest {
	private Number num;
	
	@Before
	public void setup() {
		num = new Number();
	}
	
	@Test
	public void checkPrimeShouldReturnOne() {
		int result = num.checkPrime(5);
		assertNotNull(result);
		assertEquals(1,result);
	}
	
	@Test
	public void checkPrimeShouldReturnZero() {
		int result = num.checkPrime(10);
		assertNotNull(result);
		assertEquals(0,result);
	}
	
	@Test
	public void checkAmstrongShouldReturnTrue() {
		boolean result = num.checkAmstrong(371);
		assertNotNull(result);
		assertEquals(true,result);
	}
	
	@Test
	public void checkAmstrongShouldReturnFalse() {
		boolean result = num.checkAmstrong(115);
		assertNotNull(result);
		assertEquals(false,result);
	}
	
	@Test
	public void checkPalindromeShouldReturnTrue() {
		boolean result = num.checkPalindrome(123321);
		assertNotNull(result);
		assertEquals(true,result);
	}
	
	@Test
	public void checkPalindromeShouldReturnFalse() {
		boolean result = num.checkPalindrome(12345);
		assertNotNull(result);
		assertEquals(false,result);
	}		
}
