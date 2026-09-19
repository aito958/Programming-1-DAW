package apartado2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class UtilidadesFechaTest {

    @Test
    public void testAnioNoMultiplo4() {
        // CAMINO 1: anio % 4 != 0 → return false directo
        assertFalse(UtilidadesFecha.comprobarBisiesto(2023), 
                   "2023 no es múltiplo de 4, debe retornar false");
        assertFalse(UtilidadesFecha.comprobarBisiesto(2021), 
                   "2021 no es múltiplo de 4, debe retornar false");
    }

    @Test
    public void testAnioBisiestoNormal() {
        // CAMINO 2: anio % 4 == 0 Y NO (anio % 100 == 0) → esBisiesto = true
        assertTrue(UtilidadesFecha.comprobarBisiesto(2024), 
                  "2024 es múltiplo de 4 y no de 100, debe ser bisiesto");
        assertTrue(UtilidadesFecha.comprobarBisiesto(2020), 
                  "2020 es múltiplo de 4 y no de 100, debe ser bisiesto");
    }

    @Test
    public void testAnioBisiestoSiglo400() {
        assertTrue(UtilidadesFecha.comprobarBisiesto(2000), 
                  "2000 es múltiplo de 400, debe ser bisiesto");
        assertTrue(UtilidadesFecha.comprobarBisiesto(1600), 
                  "1600 es múltiplo de 400, debe ser bisiesto");
    }

    @Test
    public void testAnioNoBisiestoSiglo100() {
        assertFalse(UtilidadesFecha.comprobarBisiesto(1900), 
                   "1900 es múltiplo de 100 pero no de 400, NO debe ser bisiesto");
        assertFalse(UtilidadesFecha.comprobarBisiesto(2100), 
                   "2100 es múltiplo de 100 pero no de 400, NO debe ser bisiesto");
    }
}
