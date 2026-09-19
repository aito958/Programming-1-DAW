package Edificios;

public abstract class Vivienda {
    protected String refCatastral;
	public String direccion;
    protected char eficiencia;
    protected boolean cedulaHabitabilidad, ocupada;
    protected Persona propietario;
    protected int metrosCuadrados, numHabitaciones, numBanios, plazasGaraje;
    
    // esto seria el  indice de eficiencia entergetica que se define por letras 
    protected double indiceEficiencia() {
         switch (eficiencia) {
		case 'A':
			return 0.1;
		
		case 'B':
			return 0.2;
		
		case 'C':
			return 0.3;
		
		case 'D':
			return 0.4;
	
		case 'E':
			return 0.4;

		default:
			return 1.0;
		}
    }
 
    public abstract double facturaLuz(double consumo);     // <- obliga a Casa y a Piso que implementen su fórmula de luz
    public abstract double facturaAgua(double consumo);    // <- obliga  a Casa y a Piso: que implementen su fórmula de agua  
    public abstract double impuestos();  // <- obliga  a Casa y a  Piso que implementen sus impuestos

}