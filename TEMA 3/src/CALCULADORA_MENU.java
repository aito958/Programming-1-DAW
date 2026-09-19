
import java.util.Scanner;

public class CALCULADORA_MENU {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;
        do {
            mostrarMenu();
            opcion = solicitarOpcion();
            tratarOpcionesMenu(opcion);
        } while (opcion != 5);

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
    }

    private static void mostrarMenu() {
        System.out.println("\n===== MENU CALCULADORA =====");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
    }

   
    private static int solicitarOpcion() {
        int opcionElegida;
        do {
            System.out.print("Introduce opción (1-5): ");
            opcionElegida = Integer.parseInt(teclado.nextLine());
        } while (opcionElegida < 1 || opcionElegida > 5);
        return opcionElegida;
    }


    private static void tratarOpcionesMenu(int opcion) {
        int num1, num2;

        switch (opcion) {
            case 1:
                num1 = solicitarNumero();
                num2 = solicitarNumero();
                System.out.println("El resultado de la suma es " + (num1 + num2));
                break;
            case 2:
                num1 = solicitarNumero();
                num2 = solicitarNumero();
                System.out.println("El resultado de la resta es " + (num1 - num2));
                break;
            case 3:
                num1 = solicitarNumero();
                num2 = solicitarNumero();
                System.out.println("El resultado de la multiplicación es " + (num1 * num2));
                break;
            case 4:
                num1 = solicitarNumero();
                num2 = solicitarNumero();
                if (num2 == 0)
                    System.out.println("Error: no se puede dividir entre cero.");
                else
                    System.out.println("El resultado de la división es " + ((double) num1 / num2));
                break;
            case 5:
                break;
        }
    }

   
    private static int solicitarNumero() {
        System.out.print("Introduce un número: ");
        return Integer.parseInt(teclado.nextLine());
    }
}
