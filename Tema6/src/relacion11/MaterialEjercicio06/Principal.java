package relacion11.MaterialEjercicio06;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Diccionario diccionario = new Diccionario();
		boolean salir;

		do {
			mostrarMenu();
			salir = solicitarYTratarOpcion(diccionario);
		} while (salir == false);

	}

	private static void mostrarMenu() {
		System.out.println(
				"1. Añadir palabra  \n2. 2.Buscar palabra \n3. Borrar la palabra \n4. Listado de palabra que empieze por .. \n5. Salir");

	}

	private static boolean solicitarYTratarOpcion(Diccionario diccionario) {
		int opcion;
		boolean acabar = false;

		opcion = pedirInt("Introduzca la opcion");
	//	try {
			switch (opcion) {
			case 1: {

				EntradaDiccionario entrada = crearEntrada(diccionario);
				break;
			}
			case 2: {
				String palabra = pedirCadena("Introduce la palabra ");
				EntradaDiccionario entrada = diccionario.diccionario.get(palabra);
				if (entrada != null) {
					System.out.println(entrada);
				} else {
					System.out.println("La palabra no existe en el diccionario");
				}

				System.out.println();
				break;
			}
			case 3: {

				String palabra = pedirCadena("Introduce la palabra ");
				EntradaDiccionario entrada = diccionario.diccionario.remove(palabra);

				if (entrada != null) {
					System.out.println("Palabra borrada");
				} else {
					System.out.println("La palabra no existe en el diccionario");
				}

				break;
			}

			case 4: {
				String palabra = pedirCadena("Introduce la palabra ");
				buscarPalabrasEmpezandoPor(palabra, diccionario);

				System.out.println("Historial destruido, puede irse tranquilo");
				break;

			}
			case 5: {
				acabar = true;
				break;
			}

			}
//		} catch (VisitaPaginaWebException e) {
//			System.out.println(e.getMessage());
//		}

		return acabar;

	}

	private static void buscarPalabrasEmpezandoPor(String inicioPalabra, Diccionario diccionario) {

		for (String palabra : diccionario.diccionario.keySet()) {
			if (palabra.startsWith(inicioPalabra)) {
				System.out.println(palabra);
			}
		}
	}

	// TODO


	private static EntradaDiccionario crearEntrada(Diccionario diccionario) {
		String palabra;
		String significado;
		EntradaDiccionario nueva = null;

		boolean incorrecto = false;

		do {
		//	try {
				incorrecto = false;
				palabra = pedirCadena("Introduce la palabra");
				significado = pedirCadena("Introduce el significado de " + palabra);

				if (diccionario.diccionario.containsKey(palabra)) {
					diccionario.diccionario.get(palabra).annadirSignificado(significado);
				} else {
					nueva = new EntradaDiccionario(palabra, significado);
					diccionario.diccionario.put(palabra, nueva);

				}

//			} catch (DiccionarioException e) {
//				incorrecto = true;
//				System.out.println(e.getMessage());
		//	}
		} while (incorrecto == true);

		return nueva;
	}

	private static String pedirCadena(String msg) {
		String cadena;

		System.out.println(msg);
		cadena = teclado.nextLine();

		return cadena;

	}

	private static int pedirInt(String msg) {
		int dato = 0;
		boolean incorrecto = false;

		do {
			try {
				incorrecto = false;
				System.out.println(msg);
				dato = Integer.parseInt(teclado.nextLine());
			} catch (NumberFormatException e) {
				incorrecto = true;
				System.out.println("Solo puedes introducir numeros");
			}
		} while (incorrecto == true);

		return dato;
	}
}
