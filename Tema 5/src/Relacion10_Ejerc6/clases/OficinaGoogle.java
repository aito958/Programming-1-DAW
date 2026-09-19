package Relacion10_Ejerc6.clases;

import Relacion10_Ejerc6.EdificioOficinas;

public class OficinaGoogle implements EdificioOficinas {

	double SuperficieEdificio;
	int numeroOficina;
	
	
	
	public OficinaGoogle(double SuperficieEdificio, int numeroOficina) {
		super();
		this.SuperficieEdificio = SuperficieEdificio;
		this.numeroOficina = numeroOficina;
	}

	@Override
	public double getSuperficieEdificio() {
		return 0;
	}

	@Override
	public int getNumeroOficinas() {
		return 0;
	}

	@Override
	public String toString() {
		return "EdificoOficinaNULL [superficie=" + SuperficieEdificio + ", numeroOficina=" + numeroOficina + "]";
	}

}
