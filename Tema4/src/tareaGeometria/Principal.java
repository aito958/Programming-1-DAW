package tareaGeometria;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Introduce el saldo inicial: ");
        double saldoInicial = sc.nextDouble();
        Cuenta cuenta = new Cuenta(saldoInicial);

        int opcion;
        do {
            System.out.println("--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Hacer un reintegro");
            System.out.println("2. Hacer un ingreso");
            System.out.println("3. Consultar saldo e historial");
            System.out.println("4. Finalizar");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Introduce la cantidad a retirar: ");
                    double retirar = sc.nextDouble();
                    cuenta.reintegrar(retirar);
                    break;
                case 2:
                    System.out.print("Introduce la cantidad a ingresar: ");
                    double ingresar = sc.nextDouble();
                    cuenta.ingresar(ingresar);
                    break;
                case 3:
                    cuenta.mostrarDatos();
                    break;
                case 4:
                    System.out.print("¿Seguro que deseas salir? (s/n): ");
                    String resp = sc.next();
                    if (resp.equalsIgnoreCase("s")) {
                        System.out.println("Operación finalizada. Saldo final: " + cuenta.getSaldo() + " €.");
                        System.out.println("Gracias por usar el programa.");
                        break;
                    } else {
                        opcion = 0; 
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);

        sc.close();
    }
}
	


