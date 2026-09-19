import java.util.Random;

public class casaPapel {

    private static final float NANOSEGUNDOS = 1000000000f;  

    public static void main(String[] args) {
        Random aleatorio = new Random();
        char caracter1 = (char) aleatorio.nextInt(65, 91);
        char caracter2 = (char) aleatorio.nextInt(65, 91);
        char caracter3 = (char) aleatorio.nextInt(65, 91);
        char caracter4 = (char) aleatorio.nextInt(65, 91);
        String contraseña = "" + caracter1 + caracter2 + caracter3 + caracter4;

        System.out.println("" + caracter1 + caracter2 + caracter3 + caracter4);
        System.out.println("Por fuerza aleatoria ha tardado -> " + fuerzaAleatoria(contraseña));
        System.out.println("Por fuerza justa ha tardado -> " + fuerzaJusta(contraseña));
        System.out.println("Por fuerza bruta ha tardado -> " + fuerzaBruta(contraseña));  
    }

    private static float fuerzaJusta(String contraseña) {
        long tiempoInicial = System.nanoTime();

        boolean encontrado = false;
        for (int i = 65; i <= 90 && !encontrado; i++) {
            if (contraseña.charAt(0) == (char) i) {
                encontrado = true;
            }
        }

        encontrado = false;
        for (int i = 65; i <= 90 && !encontrado; i++) {
            if (contraseña.charAt(1) == (char) i) {
                encontrado = true;
            }
        }

        encontrado = false;
        for (int i = 65; i <= 90 && !encontrado; i++) {
            if (contraseña.charAt(2) == (char) i) {
                encontrado = true;
            }
        }

        encontrado = false;
        for (int i = 65; i <= 90 && !encontrado; i++) {
            if (contraseña.charAt(3) == (char) i) {
                encontrado = true;
            }
        }

        long tiempoFinal = System.nanoTime();
        return (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
    }

    private static float fuerzaAleatoria(String contraseña) {
        long tiempoInicial = System.nanoTime();

        Random aleatorio = new Random();
        String contraseñaPosible;
        do {
            char c1 = (char) aleatorio.nextInt(65, 91);
            char c2 = (char) aleatorio.nextInt(65, 91);
            char c3 = (char) aleatorio.nextInt(65, 91);
            char c4 = (char) aleatorio.nextInt(65, 91);
            contraseñaPosible = "" + c1 + c2 + c3 + c4;
        } while (!contraseñaPosible.equals(contraseña));

        long tiempoFinal = System.nanoTime();
        return (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
    }

    private static float fuerzaBruta(String contraseña) {
        long tiempoInicial = System.nanoTime();

        String contraseñaPosible;
        boolean encontrado = false;
        for (int i = 65; i <= 90 && !encontrado; i++) {
            for (int j = 65; j <= 90 && !encontrado; j++) {
                for (int k = 65; k <= 90 && !encontrado; k++) {
                    for (int w = 65; w <= 90 && !encontrado; w++) {
                        contraseñaPosible = "" + (char) i + (char) j + (char) k + (char) w;
                        if (contraseña.equals(contraseñaPosible)) {
                            encontrado = true;  
                        }
                    }
                }
            }
        }

        long tiempoFinal = System.nanoTime();
        return (tiempoFinal - tiempoInicial) / NANOSEGUNDOS;
    }
}
