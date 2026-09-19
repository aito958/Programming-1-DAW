package apartado1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class RectanguloTest {
    
    @Test
    public void testAreaValida() {
        float base = 5.0;
        float altura = 3.0;
        float areaEsperada = 15.0;
        
        Rectangulo rectangulo = new Rectangulo(base, altura);
        float areaCalculada = rectangulo.area();
        
        assertEquals(areaEsperada, areaCalculada, 0.001f,  "El área de un rectángulo 5x3 debe ser 15");
    }
}
