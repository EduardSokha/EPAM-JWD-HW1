package by.sokhaeduard.firsthomework.service;

import org.junit.Assert;
import org.junit.Test;

public class TestTimeLogic {
	
	@Test
	public void testDaysInMonth() {
		int expected = 31;
		int realy = new TimeLogic().getDaysInMonth(3, 2020);
		Assert.assertEquals(realy, expected);
	}
	
	@Test
	public void testLeapYear() {
		boolean expected = true;
		boolean realy = new TimeLogic().isLeapYear(2020);
		Assert.assertEquals(realy, expected);
	}
	
	@Test
	public void testParseSecond() {
		int[] expected = {1,0,0};
		int[] realy = new TimeLogic().parseSecond(3600);
		Assert.assertEquals(realy, expected);
	}
}
