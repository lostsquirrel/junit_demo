package test.junit.suites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import test.junit.anno.Tester;

public class SuiteTest {
	@Test
	public void divideZeroByOtherIntegerShouldReturnZero() {
		Tester tester = new Tester();
		assertEquals("0 / 3 must be 0", 0, tester.divide(0, 3));
	}
}
