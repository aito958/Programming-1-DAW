import java.util.Random;

public class Apellido1Apellido2Practica2 {

    // constantes para los códigos ASCII de A hasta la  Z
    public static final int ASCII_A = 65;
    public static final int ASCII_Z = 90;

    // constante para convertir nanosegundos a segundos
    public static final int NANOSEGUNDOS = 1000000000;

    public static void main(String[] args) {

        // Generamos una clave aleatoria de 4 letras 
        String clave = generarClave();
        System.out.println("La combinación es: " + clave);

        double tiempoAleatoria = fuerzaAleatoria(clave);
        System.out.println("Encontrado de manera aleatoria !! -> " + clave);
        System.out.println("Por fuerza aleatoria tardó: " + tiempoAleatoria + " segundos, está chupado");

        double tiempoBruta = fuerzaBruta(clave);
        System.out.println("Encontrado de manera secuencial !! -> " + clave);
        System.out.println("Por fuerza bruta tardó: " + tiempoBruta + " segundos, está chupado");

        double tiempoJusta = fuerzaJusta(clave);
        System.out.println("Encontrado letra a letra !! -> " + clave);
        System.out.println("Por fuerza justa tardó: " + tiempoJusta + " segundos, está chupado");
    }

    // Genera una clave aleatoria de 4 letras mayúsculas
    public static String generarClave() {
        Random palabra = new Random();
        String clave = "";

        // Generamos 4 letras aleatorias entre 'A' y 'Z'
        for (int i = 0; i < 4; i++) {
            char letra = (char) (ASCII_A + palabra.nextInt(26)); // 26 letras del alfabeto , ya que si ponemos mas de 26 ejemplo 100 nos saldra co n caracter espeiales como = [&... ; y si ponemos menos de 26 tendremos menos caracter posible para generar la letra 
            clave += letra;
        }

        return clave;
    }

 
   
    public static double fuerzaAleatoria(String clave) {
        Random palabra = new Random();
        long inicio = System.nanoTime(); // Tiempo inicial

        String intento = "";

        // Repetimos hasta que la clave generada coincida con la original
        while (!intento.equals(clave)) {
            intento = "";
            for (int i = 0; i < 4; i++) {
                char letra = (char) (ASCII_A + palabra.nextInt(26));
                intento += letra;
            }
        }

        long fin = System.nanoTime(); // Tiempo final
        return (fin - inicio) / (double) NANOSEGUNDOS; // Convertimos a segundos el tiempo final ya que nos sale en nanosegundos
    }

   
    public static double fuerzaBruta(String clave) {
        long inicio = System.nanoTime();

        // uso cuatro bucles para recorrer todas las combinaciones posibles desde la a hasta la z
        for (char a = 'A'; a <= 'Z'; a++) {
            for (char b = 'A'; b <= 'Z'; b++) {
                for (char c = 'A'; c <= 'Z'; c++) {
                    for (char d = 'A'; d <= 'Z'; d++) {

                        String intento = "" + a + b + c + d;

                        // Si coincide la clave, devolvemos el tiempo
                        if (intento.equals(clave)) {
                            long fin = System.nanoTime();
                            return (fin - inicio) / (double) NANOSEGUNDOS;
                        }
                    }
                }
            }
        }
        return -1; // No debería ocurrir
    }

    // Busca la clave letra por letra, comprobando cada posición
    public static double fuerzaJusta(String clave) {
        long inicio = System.nanoTime();

        // Recorremos cada una de las 4 posiciones de la clave
        for (int i = 0; i < 4; i++) {

            // Probamos letras desde A hasta Z hasta encontrar la correcta
            for (char letra = 'A'; letra <= 'Z'; letra++) {
                if (letra == clave.charAt(i)) {
                    break; // Cuando la encontramos, pasamos a la siguiente posición
                }
            }
        }

        long fin = System.nanoTime();
        return (fin - inicio) / (double) NANOSEGUNDOS;
    }
}
