import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EjemploOrdenacionLista {

    public static void main(String[] args) {

        List<Persona> lista = new ArrayList<>();

        lista.add(new Persona(0, "Alonso"));
        lista.add(new Persona(2, "Piastri"));
        lista.add(new Persona(1, "Antonelli"));
        lista.add(new Persona(3, "Sainz"));

        // Mostrar lista original
        for (Persona p : lista) {
            System.out.println(p);
        }

        // Orden natural (compareTo)
        Collections.sort(lista);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println(lista.toString());

        Collections.sort(lista, (o1, o2) -> o1.DNI - o2.DNI);

        System.out.println("------------------------------------------------------------------------------");
        System.out.println(lista.toString());

        // Orden con Comparator anónimo
        Collections.sort(lista, new Comparator<Persona>() {
            
            public int compare(Persona p1, Persona p2) {
                return p1.DNI - p2.DNI;
            }
        });

        System.out.println("------------------------------------------------------------------------------");
        System.out.println(lista);
    }
}
