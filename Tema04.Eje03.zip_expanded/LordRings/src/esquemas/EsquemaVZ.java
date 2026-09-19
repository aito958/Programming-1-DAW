package esquemas;

/**
 * Estructura fija para problemas de selección óptima local.
 * Usado en: mochila fraccionaria, ordenación por ratio, etc.
 */
public abstract class EsquemaVZ {
    
    
    public void voraz() {
        inicializa();                           // Fase 1: Setup
        while (!fin()) {                        // Fase 2: Iterar hasta condición
            seleccionaYElimina();               // Elige óptimo local
            if (prometedor()) {                 // Fase 3: Heurística de validez
                anotaEnSolucion();              // Fase 4: Acumula solución
            }
        }
    }

 
    
    /** Fase 1: Prepara estructuras (arrays, contadores, etc.) */
    abstract protected void inicializa();
    
    /** Fase 2: Condición de parada del bucle principal */
    abstract protected boolean fin();
    
    /**  Selecciona la mejor opción local + elimina del pool */
    abstract protected void seleccionaYElimina();
    
    /** Esta selección parcial lleva a óptimo */
    abstract protected boolean prometedor();
    
    /** Fase 4: Registra en solución final (arraySolucion[], valor, etc.) */
    abstract protected void anotaEnSolucion();
}
