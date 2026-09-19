package cafe;

import java.util.Scanner;

public class MenuMaquina {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		boolean continuar = true;

		Maquina miMaquina = new Maquina(100);

		do {
			System.out.println("--- Máquina de cafe---");
			System.out.println("1. Servir café solo (" + miMaquina.getPrecioCafe() + " € )");
			System.out.println("2. Servir leche (" + miMaquina.getPrecioLeche() + " €) ");
			System.out.println("3. Servir café con leche (" + miMaquina.getPrecioCafeConLeche() + " €) ");
			System.out.println("4.  Consultar estado de la  máquina.");
			System.out.println("5.Apagar máquina y salir");
			System.out.println("Elige una opción (1-5)");
			int opcion = teclado.nextInt();
			double dinero;
			double cambio;
			switch (opcion) {
			case 1:
				System.out.println("Introduce el dinero (" + miMaquina.getPrecioCafe() + "€) ");
				dinero = teclado.nextDouble();
				cambio = miMaquina.servirCafe(dinero);
				System.out.println("Aqui tiene su cambio " +cambio +"€");
				miMaquina.servirCafe(dinero);
				break;
			case 2:
				System.out.println("Introduce el dinero (" + miMaquina.getPrecioLeche() + "€) ");
				dinero = teclado.nextDouble();
				cambio = miMaquina.servirLeche(dinero);
				System.out.println("Aqui tiene su cambio "+cambio+"€");

				miMaquina.servirLeche(dinero);
				break;
			case 3:
				System.out.println("Introduce el dinero (" + miMaquina.getPrecioCafeConLeche() + "€) ");
				dinero = teclado.nextDouble();
				cambio = miMaquina.servirCafe(dinero);
				System.out.println("Aqui tiene su cambio "+cambio+"€");

				miMaquina.servirCafe_Con_Leche(dinero);
				break;
			case 4:
				System.out.println(miMaquina);
				continuar = false;

				break;

			case 5:
				System.out.println("¡HASTA LUEGO, que aproveche !");
				continuar = false;

			case 1234:
			System.out.println("Rellenando los deposito ");
				miMaquina.rellenar();
				System.out.println("Depositos llenos :)");
				break;
			case 6458:
		System.out.println("Vaciando monederos");
			double monedero =	miMaquina.vaciarMonedero();
			System.out.println("Dinero recaudado es de "+ monedero);
				break;
			default:
				System.out.println("Error, valor no válido");
				break;
			}
			System.out.println();

		} while (continuar);

	}

}
