package Relacion10_Ejerc6.clases;

import Relacion10_Ejerc6.Polideportivo;

public class PolideportivoTenis  implements Polideportivo{

	double superficie;
	int tipoInstalacion;
	String nombre;
	
	
	
	public PolideportivoTenis(double superficie, int tipoInstalacion, String nombre) {
		super();
		this.superficie = superficie;
		this.tipoInstalacion = tipoInstalacion;
		this.nombre = nombre;
	}

	@Override
	public double getSuperficieEdificio() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTipoInstalacion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getNombrePolideportivo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "PolideportivoTenis [superficie=" + superficie + ", tipoInstalacion=" + tipoInstalacion + ", nombre="
				+ nombre + "]";
	}

	
	
}
