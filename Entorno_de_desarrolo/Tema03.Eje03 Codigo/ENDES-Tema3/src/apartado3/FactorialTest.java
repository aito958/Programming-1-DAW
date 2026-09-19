package apartado3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class FactorialTest {

    @Test
    public void testIterativoCasoNegativo() {
        assertEquals(-1, Factorial.calcularFactorial(-5), "Número negativo debe devolver -1");
    }

    @Test
    public void testIterativoCasoCero() {
        assertEquals(1, Factorial.calcularFactorial(0),"0! debe ser 1");
    }

    @Test
    public void testIterativoCasoUno() {
        assertEquals(1, Factorial.calcularFactorial(1),"1! debe ser 1");
    }

    @Test
    public void testIterativoCasoNormal() {
        assertEquals(120, Factorial.calcularFactorial(5), "5! debe ser 120");
        assertEquals(720, Factorial.calcularFactorial(6), "6! debe ser 720");
    }

    @Test
    public void testRecursivoCasoNegativo() {
        assertEquals(-1, Factorial.calcularFactorialRecursivo(-3), "Número negativo recursivo debe devolver -1");
    }

    @Test
    public void testRecursivoCasoBase() {
        assertEquals(1, Factorial.calcularFactorialRecursivo(0),  "0! recursivo debe ser 1");
        assertEquals(1, Factorial.calcularFactorialRecursivo(1),  "1! recursivo debe ser 1");
    }

    @Test
    public void testRecursivoCasoRecursivo() {
        assertEquals(120, Factorial.calcularFactorialRecursivo(5), "5! recursivo debe ser 120");
    }
}
