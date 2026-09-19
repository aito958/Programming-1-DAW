package problemas;

import java.util.Random;

/**
 * Clase que genera datos aleatorios para simulación de ataques.
 * Hereda estructura base de ProblemaAtaque para arrays de combate.
 * 
 */
public class ProblemasVariable extends ProblemaAtaque {  // Herencia: extiende funcionalidad base

    /**
     * Constructor: Genera grupos aleatorios de orcos y aliados.
     * - numGrupos: 1-99 grupos
     * - Valores: 100-999 por grupo (fuerzas razonables para simulación)
     */
    public ProblemasVariable() {
        Random ran = new Random();  // Generador pseudoaleatorio (semilla por defecto: tiempo sistema)

        int numGrupos = ran.nextInt(99) + 1;  // [1,99] grupos de batalla

        // Arrays heredados de ProblemaAtaque, inicializados dinámicamente
        orcos = new int[numGrupos];   // Orcos por grupo
        aliados = new int[numGrupos]; // Aliados por grupo

        // Llenado paralelo: mismo número de grupos
        for (int i = 0; i < numGrupos; i++) {
            orcos[i] = ran.nextInt(900) + 100;   // 100-999 orcos
            aliados[i] = ran.nextInt(900) + 100; // 100-999 aliados
        }
        //  Arrays listos para simular ataques (comparar orcos[i] vs aliados[i])
    }
}
