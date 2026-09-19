package ejercicio02conExcepciones;

import java.util.Scanner;

public class PrincipalCuenta {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		int opcion;
		double saldoInicial;
		Cuenta cuenta;
		char salir;

		saldoInicial = PrincipalCuenta.pedirSaldoInicial();
		try {
			cuenta = new Cuenta(saldoInicial);

			do {
				// Muestra el menú y solicita la opción
				opcion = PrincipalCuenta.menu();

				// Trata cada una de las opciones del menú
				salir = PrincipalCuenta.tratarMenu(opcion, cuenta);
			} while (salir == 'n');
		} catch (CuentaException ex) {
			System.out.println(ex.getMessage());
		}
	}

	private static double pedirSaldoInicial() {
		double saldoInicial;

		saldoInicial = solicitarDoublePositivo("Introduzca el saldo inicial: ");

		return saldoInicial;
	}

	private static double solicitarDoublePositivo(String msg) {
		double numero = 0;
		boolean hayError;

		do {
			try {
				System.out.println(msg);
				numero = Double.parseDouble(teclado.nextLine());
				hayError = false;
			} catch (NumberFormatException ex) {
				System.out.println("Error. No es un número.");
				hayError = true;
			}
		} while (hayError || numero < 0);

		return numero;
	}

	private static int menu() {
		int opcion = 0;

		do {
			try {
				System.out.println("Elige una opción: ");
				System.out.println("1. Hacer un ingreso.");
				System.out.println("2. Hacer un reintegro.");
				System.out.println("3. Consultar el saldo y el número de reintegros e ingresos realizados.");
				System.out.println("4. Finalizar las operaciones.");
				opcion = Integer.parseInt(teclado.nextLine());

				if (opcion < 1 || opcion > 5)
					System.out.println("Error. Opción incorrecta.");

			} catch (NumberFormatException e) {
				System.out.println("Error. Opción incorrecta.");
			}
		} while (opcion < 1 || opcion > 5);

		return opcion;
	}

	private static char tratarMenu(int opcion, Cuenta cuenta) {
		double cantidad;
		char salir = 'n';

		try {
			switch (opcion) {
			case 1: {

				cantidad = solicitarDoublePositivo("Introduce la cantidad a ingresar: ");
				cuenta.realizarIngreso(cantidad);
				break;
			}
			case 2: {

				cantidad = solicitarDoublePositivo("Introduce la cantidad a retirar: ");
				cuenta.realizarReintegro(cantidad);
				break;
			}
			case 3: {
				System.out.println(cuenta);
				break;
			}
			case 4: {
				do {
					System.out.println("¿Estás seguro (s/n)? ");
					salir = teclado.nextLine().charAt(0);
					// Esto convierte el carácter salir a minúsculas
					salir = Character.toLowerCase(salir);
				} while (salir != 's' && salir != 'n');

				if (salir == 's') {
					System.out.println("Dispones de " + cuenta.getSaldo() + "€ de saldo.");
				}

				break;
			}
			}
		} catch (CuentaException e) {
			System.out.println(e.getMessage());
		}

		return salir;
	}
}
