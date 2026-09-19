package RELACION4;

import java.util.Scanner;

public class Ejercicio4 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un año:");
        int año = teclado.nextInt();

        System.out.println("Introduce un mes (1-12):");
        int mes = teclado.nextInt();

        int dias = diasMes(mes, año);

        if (dias != -1) {
            System.out.println("El mes " + mes + " del año " + año + " tiene " + dias + " días.");
        } else {
            System.out.println("Mes no válido. Debe estar entre 1 y 12.");
        }
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public static int diasMes(int mes, int año) {
        int dias;

        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                dias = 31;
                break;
            case 4: case 6: case 9: case 11:
                dias = 30;
                break;
            case 2:
                if (esBisiesto(año)) {
                    dias = 29;
                } else {
                    dias = 28;
                }
                break;
            default:
                dias = -1;
                break;
        }

        return dias;
    }
}
