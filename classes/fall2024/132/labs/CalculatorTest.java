import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {


	@Test
	public void testAdd() {
		int result = Calculator.add(2,3);
		assertEquals(5, result);
	}
	
	@Test
	public void testAddNegative() {
		int result = Calculator.add(-4, -7);
		assertEquals(-11, result);
	}
	
	@Test
	public void testDivide() {
		int result = Calculator.divide(10, 5);
		assertEquals(2,result);
	}

	@Test
	public void testDivideDecimal() {
		int result = Calculator.divide(7, 2);
		assertEquals(3.5,result,"7 divided by 2 should be 3.5");
	}

	
}
