package RELACION4;

public class Ejercicio5 {

    public static void main(String[] args) {
        pintarNuevaHora(20, 40, 40, 120);
    }

    private static void pintarNuevaHora(int hora, int min, int segundos, int segSumar) {

        
        if (hora < 0 || hora >= 24 || min < 0 || min >= 60 || segundos < 0 || segundos >= 60) {
            System.out.println("No se puede calcular la hora, datos incorrectos");
            return;
        }

        System.out.println("La hora anterior era " + hora + ":" + min + ":" + segundos);

        
        segundos += segSumar;

        min += segundos / 60;
        segundos = segundos % 60;

        hora += min / 60;
        min = min % 60;

        hora = hora % 24; 

        System.out.println("La nueva hora es " + hora + ":" + min + ":" + segundos);
    }
}
