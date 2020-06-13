package by.sokhaeduard.firsthomework.service;

import org.junit.Assert;
import org.junit.Test;

public class TestNumberLogic {

	@Test
	public void testLastDigitOfNumber() {
		int expected = 6;
		int realy = new NumberLogic().getLastDigitOfNumber(26);
		Assert.assertEquals(realy, expected);
	}

	@Test
	public void testCheckEven() {
		int[] numbers = { 5, 3, 9, 3 };
		boolean expected = false;
		boolean realy = new NumberLogic().checkEven(numbers);
		Assert.assertEquals(realy, expected);
	}
	
	@Test
	public void testIdealNumber() {
		boolean expected = false;
		boolean realy = new NumberLogic().getIdealNumber(7);
		Assert.assertEquals(realy, expected);
	}

}
