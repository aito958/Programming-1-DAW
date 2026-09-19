package entorno;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class CalculadoraTester {

	@Test
	public void testSuma() {
		assertEquals(4, Calculadora.suma(2, 2));
	}

	@Test
	public void testResta() {
		assertEquals(2, Calculadora.suma(5, 3));
	}

	@Test
	public void testSuma2() {
		assertEquals(Integer.MAX_VALUE + 1, Calculadora.suma(1, Integer.MAX_VALUE));
	}

	@Test
	public void testResta2() {
		assertNotEquals(1, Calculadora.suma(5, 3));
	}

}