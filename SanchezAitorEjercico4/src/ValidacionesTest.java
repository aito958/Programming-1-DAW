import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValidacionesTest {


    @Test
    public void testEdadMenorQueMinimo() {
        assertFalse(Validaciones.validarEdad(11));  
        assertFalse(Validaciones.validarEdad(0));   
    }

    @Test
    public void testEdadEnLimiteInferior() {
        assertTrue(Validaciones.validarEdad(12));    
    }

    @Test
    public void testEdadDentroDelRango() {
        assertTrue(Validaciones.validarEdad(20));    
    }

    @Test
    public void testEdadEnLimiteSuperior() {
        assertTrue(Validaciones.validarEdad(30));   
    }

    @Test
    public void testEdadMayorQueMaximo() {
        assertFalse(Validaciones.validarEdad(31));   
        assertFalse(Validaciones.validarEdad(100));  
    }


    @ParameterizedTest
    @ValueSource(strings = {"", "a", "ab", "abc", "abcd", "abcde"})
    public void testContrasennaNoValida(String contrasenna) {
        assertFalse(Validaciones.validarContrasenna(contrasenna));
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcdef", "123456", "contra1", "miPassLarga"})
    public void testContrasennaValida(String contrasenna) {
        assertTrue(Validaciones.validarContrasenna(contrasenna));
    }
}
