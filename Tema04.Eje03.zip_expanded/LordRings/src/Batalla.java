import problemas.ProblemaAtaque;
import problemas.ProblemasVariable;
import soluciones.alternativa.AtaqueSimple;
import soluciones.alternativa.AtaqueVoraz;
import temporizador.Temporizador;

/**
 * BENCHMARK COMPARATIVO: Simple vs Voraz (Fijo vs Variable)
 * Ejecuta 100 veces cada estrategia, mide rendimiento.
 */
public class Batalla {
    
    /**
     * MAIN BENCHMARK: Compara 4 configuraciones
     * 2 Problemas × 2 Algoritmos = Rendimiento empírico
     */
    public static void main(String[] args) {
        // DATOS DE ENTRADA
        ProblemaAtaque p = new ProblemaAtaque();           // ← Fijo (predefinido)
        ProblemasVariable pV = new ProblemasVariable();    // ← Aleatorio (1-99 grupos)
        
        Temporizador t = new Temporizador(100);             // ← 100 ejecuciones/estrategia
        
        // : SIMPLE + DATOS FIJOS
        AtaqueSimple solSimple = new AtaqueSimple(p);
        t.cronometra(solSimple);                           // ← Mide tiempo real
        System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
        System.out.println("Problema: " + p);
        System.out.println("Solución: " + solSimple + "\n");
        
        // VORAZ + DATOS FIJOS (Template Method)
        AtaqueVoraz solVoraz = new AtaqueVoraz(p);
        t.cronometra(solVoraz);
        System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
        System.out.println("Problema: " + p);
        System.out.println("Solución: " + solVoraz + "\n");
        
        //  SIMPLE + DATOS VARIABLES
        AtaqueSimple solSimpleVariable = new AtaqueSimple(pV);
        t.cronometra(solSimpleVariable);
        System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
        System.out.println("Problema: " + pV);
        System.out.println("Solución: " + solSimpleVariable + "\n");
        
        // : VORAZ + DATOS VARIABLES (Escenario real)
        AtaqueVoraz solVorazVariable = new AtaqueVoraz(pV);
        t.cronometra(solVorazVariable);
        System.out.println("El tiempo de ejecución: " + t.getTiempoMinimo());
        System.out.println("Problema: " + pV);
        System.out.println("Solución: " + solVorazVariable + "\n");
    }
}
