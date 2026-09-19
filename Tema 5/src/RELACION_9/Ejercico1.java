package RELACION_9;

import java.util.Random;

public class Ejercico1 {

    public static void main(String[] args) {

        Random random = new Random();
        int notasAlumnos[][] = new int[30][5];

        int[] numerosuspensos = new int[6];

        String asignaturas[] = { "BD", "Programación", "Lenguaje de Marcas", "Sistemas", "Entorno de Desarrollo" };

        // Rellenar notas
        for (int i = 0; i < notasAlumnos.length; i++) {
            for (int j = 0; j < notasAlumnos[i].length; j++) {
                notasAlumnos[i][j] = random.nextInt(0, 11);
            }
        }

        // Mostrar notas y contar suspensos por alumno
        for (int i = 0; i < notasAlumnos.length; i++) {
            int contadorSuspensos = 0;

            for (int j = 0; j < notasAlumnos[i].length; j++) {
                System.out.print(notasAlumnos[i][j] + " - ");
                if (notasAlumnos[i][j] < 5) {
                    contadorSuspensos++;
                }
            }

            numerosuspensos[contadorSuspensos]++;
            System.out.println();
        }

        // Mostrar cuántos alumnos tienen X suspensos
        for (int i = 0; i < numerosuspensos.length; i++) {
            System.out.println("Alumnos con " + i + " suspensos = " + numerosuspensos[i]);
        }

        // Mostrar la matriz por columnas (tu último bucle)
        for (int j = 0; j < notasAlumnos[0].length; j++) {
         int media = 0;
        	for (int i = 0; i < notasAlumnos.length; i++) {
//                System.out.print(notasAlumnos[i][j] + " ");
            media += notasAlumnos[i][j];
            }
            System.out.println("La nota media de "+ asignaturas[j]+ " es "+ media/notasAlumnos.length);
        }

    }
}
