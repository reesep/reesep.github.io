import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testAdd() {
		int result = Calculator.add(2, 3);
		assertEquals(result, 5);
	}
	
	@Test
	public void testAddNegative() {
		int result = Calculator.add(-2, -3);
		assertEquals(result, -5);
	}
	
	@Test
	public void testDivide() {
		int result = Calculator.divide(7, 2);
		assertEquals(result, 3.5);
	}
	
	
}
