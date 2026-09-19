package testRectangulo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class RectanguloTest {

	Rectangulo rect;
	int ancho;
	int longuitud;
	int area;
	int perimetro;
	String nombre;

	public RectanguloTest(int ancho, int aera, int perimetro, int longuitud, String nombre) {
		this.ancho = ancho;
		this.area = aera;
		this.longuitud = longuitud;
		this.perimetro = perimetro;
		this.nombre = nombre;

	}

	@Parameters(name = "{index} : test area {1} test perimetro {2}")
	public static Collection<Object[]> datos() {
		return Arrays.asList(new Object[][] { { 2, 4, 8, 2, "R1" }, { 3, 6, 10, 2, "R2" } });
	}

	@Before
	public void antes() {
		rect = new Rectangulo();
		rect.setAncho(ancho);
		rect.setLonguitud(longuitud);
		System.out.println("Hola");
	}

	@Test
	public void testParametrizado() {
		assertEquals(this.area, rect.area());
		assertEquals(this.perimetro, rect.perimetro());
	}
}
