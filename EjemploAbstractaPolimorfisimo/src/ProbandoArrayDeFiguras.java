//En estos ejemplos, para simplificar el ejercicio no se han tenido en cuenta el
//control de excepciones.
import java.util.Random;

public class ProbandoArrayDeFiguras {

	
	public static void main(String[] args) {
	
		Random serie=new Random();		
		Figura[] arrayFigura=new Figura[3];
		

		arrayFigura[0]=new Circulo(serie.nextInt(10), serie.nextInt(10), serie.nextInt(10) + 1 );
		arrayFigura[1]=new Rectangulo(serie.nextInt(10), serie.nextInt(10),serie.nextInt(10)+ 1,serie.nextInt(10) +1);
		arrayFigura[2]=new Triangulo(serie.nextInt(10),serie.nextInt(10),serie.nextInt(10) + 1,serie.nextInt(10)+ 1);
		
		imprimirArray( arrayFigura);
		mostrarAreas( arrayFigura);
	}

	private static void mostrarAreas(Figura[] arrayFigura) {
		
		for (int i = 0; i < arrayFigura.length; i++) {
			System.out.println( "El area es " + arrayFigura[i].area());
		}
		
	}

	private static void imprimirArray(Figura[] arrayFigura) {
		
		for (int i = 0; i < arrayFigura.length; i++) {
			System.out.println(arrayFigura[i].toString());
		}
		
	}

}
