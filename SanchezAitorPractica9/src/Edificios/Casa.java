
package Edificios;

public class Casa extends Vivienda {
    private int numPlantas;
    private int metrosJardin;
    private boolean piscina;
    
    public Casa(String refCatastral, String direccion, char eficiencia,  boolean cedula, boolean ocupada, Persona prop, int m2,  int hab, int banios, int plazas, int plantas, int jardin, boolean piscina) {
        this.refCatastral = refCatastral;
        this.direccion = direccion;
        this.eficiencia = eficiencia;
        this.cedulaHabitabilidad = cedula;
        this.ocupada = ocupada;
        this.propietario = prop;
        this.metrosCuadrados = m2;
        this.numHabitaciones = hab;
        this.numBanios = banios;
        this.plazasGaraje = plazas;
        this.numPlantas = plantas;
        this.metrosJardin = jardin;
        this.piscina = piscina;
    }
    
    @Override
    public double facturaLuz(double consumo) {
    	// calculo la factura de luz que seria el consumo porhabitaciones ente las plantas por el indice de eficiencia
        return consumo * numHabitaciones / numPlantas * indiceEficiencia();     }
    
    @Override
    public double facturaAgua(double consumo) {
    	// calculo la factura del agua que seria  el consumo por los numeros de baños por los metros dl jardin entre 100
        double factura = consumo * numBanios * metrosJardin / 100.0;
   // si luego de todo lo anterior tienes piscina se te multiplica el valor de la piscina que seria 1.20
        if (piscina) factura *= 1.20;
        return factura;
    }
    
    @Override
    public double impuestos() {
    	// los impuestos que seria 100 por toada la casa (plazas del garaje , metros del jardín , numero de palntas entre lso metros cuadrado de tu casa
        double imp = 100 * (plazasGaraje * metrosJardin * numPlantas / metrosCuadrados);
        // si luego de todo lo anterior tienes piscina se te multiplica el valor de la piscina que seria 1.20
        if (piscina) imp *= 1.20;
        return imp;
        // y devuelve el bromita tras ser calculada
    }
}