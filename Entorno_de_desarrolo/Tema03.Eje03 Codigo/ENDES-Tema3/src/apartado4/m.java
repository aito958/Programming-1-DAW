package apartado4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import apartado2.UtilidadesFecha;


public class DiaMesAnioTest {

    @Test
    public void testFebreroNoBisiesto() {
        assertEquals(28, DiaMesAnio.calcularDiasMesAnio(2, 2023), 
                    "Febrero no bisiesto debe tener 28 días");
        assertEquals(28, DiaMesAnio.calcularDiasMesAnio(2, 2021), 
                    "Febrero 2021 debe tener 28 días");
    }

    @Test
    public void testFebreroBisiesto() {
        assertEquals(29, DiaMesAnio.calcularDiasMesAnio(2, 2024), 
                    "Febrero bisiesto 2024 debe tener 29 días");
        assertEquals(29, DiaMesAnio.calcularDiasMesAnio(2, 2000), 
                    "Febrero 2000 (÷400) debe tener 29 días");
    }

    @Test
    public void testMeses30Dias() {
        assertEquals(30, DiaMesAnio.calcularDiasMesAnio(4, 2024), 
                    "Abril siempre 30 días");
        assertEquals(30, DiaMesAnio.calcularDiasMesAnio(6, 2024), 
                    "Junio siempre 30 días");
        assertEquals(30, DiaMesAnio.calcularDiasMesAnio(9, 2024), 
                    "Septiembre siempre 30 días");
        assertEquals(30, DiaMesAnio.calcularDiasMesAnio(11, 2024), 
                    "Noviembre siempre 30 días");
    }

    @Test
    public void testMeses31Dias() {
        assertEquals(31, DiaMesAnio.calcularDiasMesAnio(1, 2024), 
                    "Enero siempre 31 días");
        assertEquals(31, DiaMesAnio.calcularDiasMesAnio(3, 2024), 
                    "Marzo siempre 31 días");
        assertEquals(31, DiaMesAnio.calcularDiasMesAnio(7, 2024), 
                    "Julio siempre 31 días");
        assertEquals(31, DiaMesAnio.calcularDiasMesAnio(12, 2024), 
                    "Diciembre siempre 31 días");
    }
}

