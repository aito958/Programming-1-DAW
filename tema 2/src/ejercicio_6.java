import java.util.Scanner;

public class ejercicio_6 {
    private static final int NOTAS = 0;

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args) {

        int numAlumno;
        double numSuspenso = 0;
        double numAprobado = 0;
        double notas;
        double porcentajeAprob;
        double porcentajeSusp;

        do {
            System.out.println("Cuantos alumnos hay en la clase?");
            numAlumno = teclado.nextInt();
        } while (numAlumno <=0);

        for (int i = 1; i <= numAlumno; i++) {

            do {
                System.out.println("Introduce los notas de los alumnos");
                notas = teclado.nextDouble();
            } while (notas < 0 || notas > 10);

            if (notas >= 5) {
                numAprobado++;
            } else {
                numSuspenso++;
            }

            porcentajeAprob = numAprobado * 100 / numAlumno;
            porcentajeSusp = numSuspenso * 100 / numAlumno;

            System.out.println("El porcentaje de suspensos es " + porcentajeSusp + " El número de suspensos es " + numSuspenso); 
            System.out.println("El porcentaje de aprobados es " + porcentajeAprob + " El número de aprobados es " + numAprobado); 
        }
    }
}
