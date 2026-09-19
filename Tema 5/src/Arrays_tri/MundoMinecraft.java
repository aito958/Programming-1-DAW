package Arrays_tri;
import java.util.Random;

public class MundoMinecraft {
    // 0 = aire, 1 = tierra, 2 = piedra, 3 = diamante
    public static void main(String[] args) {
        int ALTURA = 5;   // eje Y
        int FILAS = 4;    // eje X
        int COLUMNAS = 6; // eje Z

        int[][][] mundo = new int[ALTURA][FILAS][COLUMNAS];

        // 1) Rellenar el mundo:
        // capa 0: aire, capas 1-3: tierra, capa 4: piedra
        for (int y = 0; y < ALTURA; y++) {
            for (int x = 0; x < FILAS; x++) {
                for (int z = 0; z < COLUMNAS; z++) {
                    if (y == 0) {
                        mundo[y][x][z] = 0; // aire
                    } else if (y < ALTURA - 1) {
                        mundo[y][x][z] = 1; // tierra
                    } else {
                        mundo[y][x][z] = 2; // piedra
                    }
                }
            }
        }

        // 2) Colocar algunos diamantes aleatorios
        Random r = new Random();
        for (int i = 0; i < 5; i++) { // 5 diamantes
            int y = r.nextInt(ALTURA - 1) + 1; // no en el aire
            int x = r.nextInt(FILAS);
            int z = r.nextInt(COLUMNAS);
            mundo[y][x][z] = 3;
        }

        // 3) Contar cuántos diamantes hay
        int diamantes = 0;
        for (int y = 0; y < ALTURA; y++) {
            for (int x = 0; x < FILAS; x++) {
                for (int z = 0; z < COLUMNAS; z++) {
                    if (mundo[y][x][z] == 3) {
                        diamantes++;
                    }
                }
            }
        }

        // 4) Imprimir el mundo por capas
        for (int y = ALTURA - 1; y >= 0; y--) {
            System.out.println("Capa y = " + y);
            for (int x = 0; x < FILAS; x++) {
                for (int z = 0; z < COLUMNAS; z++) {
                    System.out.print(mundo[y][x][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Diamantes encontrados: " + diamantes);
    }
}
