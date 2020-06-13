package by.sokhaeduard.firsthomework.service;

import org.junit.Test;

import by.sokhaeduard.firsthomework.entity.Point;
import junit.framework.Assert;

public class TestDotLogic {

	@Test
	public void testDefineDistance() {
		int expected = 1;
		int realy = new DotLogic().defineDistance(new Point(6, 4), new Point(8, -5));;
		Assert.assertEquals(realy, expected);
	}

}
