
public enum TipoEstadoCivil {
	
	SOLTERO(Persona.RETENCION_SOLTERO),
	CASADO(Persona.RETENCION_CASADO), 
	VIUDO(Persona.RETENCION_VIUDO), 
	SEPARADO(Persona.RETENCION_SEPARADO), 
	OTRO(Persona.RETENCION_OTRO);
	
	
	private int retencion;

	
	private TipoEstadoCivil(int retencion) {
		this.retencion=retencion;
	}
	
	public int getRetencion() {
		return retencion;
	}
	
	
}
