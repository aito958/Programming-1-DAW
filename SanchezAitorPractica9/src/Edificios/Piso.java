package Edificios;

public class Piso extends Vivienda {
    public int planta, puerta;
    
    public Piso(String refCatastral, String direccion, char eficiencia, boolean cedula, boolean ocupada, Persona prop, int m2, int hab, int banios, int plazas, int planta, int puerta) {
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
        this.planta = planta;
        this.puerta = puerta;
    }
    
    @Override
    public double facturaLuz(double consumo) {
    	//calcula la factura de la luz del piso 
        return consumo * numHabitaciones * indiceEficiencia();
        // devuelve el precio de la factura
    }
    
    @Override
    // calcula la factura del agua del pisos 
    public double facturaAgua(double consumo) {
        return consumo * numBanios;
    // devuelve el precio de la factura 
    }
    
    @Override
    public double impuestos() {
    	// calcula los impuestos del piso
        return 10 * (metrosCuadrados + metrosCuadrados * plazasGaraje);
   // devuelve la multa 
    }
}