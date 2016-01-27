package test.junit.anno;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BasicTest {

	@Test
	public void multiplicationOfZeroIntegersShouldReturnZero() {

		// MyClass is tested
		Tester tester = new Tester();

		// assert statements
		assertEquals("10 x 0 must be 0", 0, tester.multiply(10, 0));
		assertEquals("0 x 10 must be 0", 0, tester.multiply(0, 10));
		assertEquals("0 x 0 must be 0", 0, tester.multiply(0, 0));
	}
	
	@Test
	public void multiplicationGtZeroIntersShouldReturnGtZero() {
		Tester tester = new Tester();
		assertTrue(tester.multiply(3, 7) > 0);
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideByZeroShouldThrowArithmeticException() {
		Tester tester = new Tester();
		tester.divide(3, 0);
	}
}
