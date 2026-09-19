/**
 * Debe implementarse un menú con 5 opciones:
	1. Servir café solo (1 euro)
	2. Servir leche (0,8 euros)
	3. Servir café con leche (1,5 euros)
	4. Consultar   estado   máquina.   Aparecen   los   datos   de   los   depósitos   y 
	   del monedero
	5. Apagar máquina y salir
 *
 */
package ejercicio03;

import java.util.Scanner;

public class PrincipalMaquina {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String args[]) {

		Maquina maquina;
		double monedero;
		int opcion;

		monedero = PrincipalMaquina.solicitarDinero("Introduce la cantidad inicial del monedero: ");
		maquina = new Maquina(monedero);

		do {
			opcion = PrincipalMaquina.mostrarMenuCafes();
			PrincipalMaquina.tratarMenuCafes(maquina, opcion);
		} while (opcion != 5);
	}

	/**
	 * Método que muestra el menú de la máquina de café.
	 * 
	 * @param maquina
	 * @param opcion
	 */
	private static void tratarMenuCafes(Maquina maquina, int opcion) {

		double dinero;
		double cambio = 0;
		switch (opcion) {
		case 1:
			dinero = PrincipalMaquina.solicitarDinero("Introduce el dinero para el café solo: ");
			cambio = maquina.servirCafe(dinero);
			PrincipalMaquina.mostrarCambio(cambio);
			break;
		case 2:
			dinero = PrincipalMaquina.solicitarDinero("Introduce el dinero para la leche: ");
			cambio = maquina.servirLeche(dinero);
			PrincipalMaquina.mostrarCambio(cambio);
			break;
		case 3:
			dinero = PrincipalMaquina.solicitarDinero("Introduce el dinero para el café con leche: ");
			cambio = maquina.servirCafeconLeche(dinero);
			PrincipalMaquina.mostrarCambio(cambio);
			break;
		case 4:
			System.out.println(maquina);
		}
	}

	private static void mostrarCambio(double cambio) {
		if (cambio > 0) {
			System.out.println("Recoge tu cambio " + cambio);
		}
	}

	private static int mostrarMenuCafes() {

		int opcion;

		do {
			System.out.println("\n1. Servir café solo" + "(" + Maquina.PRECIO_CAFE + "  euros)" + "\n2. Servir leche "
					+ "(" + Maquina.PRECIO_LECHE + " euros)" + "\n3. Servir café con leche " + "("
					+ Maquina.PRECIO_CAFE_CON_LECHE + " euros)" + "\n4. Consultar el estado de la máquina"
					+ "\n5. Apagar máquina y salir\nIntroduce opción:");

			opcion = Integer.parseInt(teclado.nextLine());

		} while (opcion < 1 || opcion > 5);

		return opcion;
	}

	private static double solicitarDinero(String mensaje) {

		String cadena;
		double monedero;

		do {
			System.out.println(mensaje);
			cadena = teclado.nextLine();
			monedero = Double.parseDouble(cadena);
		} while (monedero <= 0);

		return monedero;
	}
}
