package ProyectoConstruccion;

public class Principal {

	private String nombre;
	private Casa casaCliente;
	private float presupuesto;

	public Principal(String nombre, Casa casaCliente, float presupuesto) {
		this.nombre = nombre;
		this.casaCliente = casaCliente;
		this.presupuesto = presupuesto;
	}

	/**
	 * Método que indica si se puede construir la casa del cliente con su
	 * presupuesto
	 */
	public String veredicto() {

		String respuesta = "";

		try {
			float precioCasa = casaCliente.calcularPrecio();

			if (presupuesto < 1) {
				throw new Exception("El presupuesto debe ser mayor que 0");
			}

			if (presupuesto < precioCasa) {
				respuesta = "No podrás vivir en tu casa de tus sueños :(";
			} else {
				respuesta = "Sí podrás vivir en la casa de tus sueños :)";
			}

		} catch (Exception e) {
			respuesta = "Error al calcular el veredicto";
			System.out.println("Error: " + e.getMessage());
		}

		return respuesta;
	}

	@Override
	public String toString() {
		return "Cliente: " + nombre + ", presupuesto=" + presupuesto + ", casa=(" + casaCliente.toString() + ")";
	}
}