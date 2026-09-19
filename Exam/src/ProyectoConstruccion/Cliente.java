package ProyectoConstruccion;

public class Cliente {

	private String nombre;
	private Casa casaCliente;
	private float presupuesto;
	
	public Cliente(String nombre, Casa casaCliente, float presupuesto) {
		this.nombre = nombre;
		this.casaCliente = casaCliente;
		this.presupuesto = presupuesto;
	}

	/**
	 * Método que indica si se puede construir la casa del cliente con su presupuesto
	 * 
	 * @return Devuelve la cadena String que se debe mostrar en pantalla.
	 */
	public String veredicto() {
		String res;
		if (this.casaCliente.getPrecio() < this.presupuesto) {
			String casa = "      `'::::.\r\n"
					+ "        _____A_\r\n"
					+ "       /      /\\\r\n"
					+ "    __/__/\\__/  \\___\r\n"
					+ "---/__|\" '' \"| /___/\\----\r\n"
					+ "   |''|\"'||'\"| |' '||\r\n"
					+ "   `\"\"`\"\"))\"\"`\"`\"\"\"\"`";
			res = "Bienvenido a su nueva casa " + this.nombre + "\n\n" + casa + "( " + casaCliente.getPrecio() + " )";
		} else {
			String puente = "          'x|`\r\n"
					+ "        '|xx| `          '|x|\r\n"
					+ "`   '    |xx|    `   '    |x|`\r\n"
					+ "         |xx|             |x|\r\n"
					+ "============|===============|===--\r\n"
					+ "~~~~~~~~~|xx|~~~~~~~~~~~~~|x|~~~ ~~  ~   ~";
			res = "Con tu presupuesto (" + this.presupuesto + ") no puedes comprar la casa de tus sueños ("
					+ this.casaCliente.getPrecio() + ")\n" + puente
					+ "\nPero puedes vivir debajo de este bonito puente";
		}
		
		return res;
	}
	
}