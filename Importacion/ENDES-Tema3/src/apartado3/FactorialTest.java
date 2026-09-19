package apartado3;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testRecursivo() {
		assertEquals(7034535277573963776l, Factorial.calcularFactorialRecursivo(25));
	}
	
	@Test
	public void testNormal() {
		assertEquals(7034535277573963776l, Factorial.calcularFactorial(25));
	}
	
}