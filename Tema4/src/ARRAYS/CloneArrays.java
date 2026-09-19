package ARRAYS;

import java.util.Arrays;

public class CloneArrays {

    public static void main(String[] args) {

        double[] notas1 = { 5.5, 6, 5, 8, 3 };
        double[] notas2 = { 5.5, 6, 5, 8, 3 };
        double[] notas1Clonado;
        double[] notas3;

        notas1Clonado = notas1.clone();
        notas3 = notas1; 

        if (notas1.equals(notas2)) {
            System.out.println("equals entre notas1 y notas2 dice IGUALES");
        } else {
            System.out.println("equals entre notas1 y notas2 dice DISTINTO");
        }
        if (notas1.equals(notas1Clonado)) {
            System.out.println("equals entre notas1 y notas1Clonado dice IGUALES");
        } else {
            System.out.println("equals entre notas1 y notas1Clonado dice DISTINTO");
        }

        if (notas1.equals(notas3)) {
            System.out.println("equals entre notas1 y notas3 dice IGUALES");
        } else {
            System.out.println("equals entre notas1 y notas3 dice DISTINTOS");
        }

 
    }
}
