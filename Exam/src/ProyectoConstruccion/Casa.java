package ProyectoConstruccion;

public class Casa {

	public static final String CALIDAD_BAJA = "baja";
	public static final String CALIDAD_MEDIA = "media";
	public static final String CALIDAD_ALTA = "alta";

	public static final int PRECIO_BAJA = 700;
	public static final int PRECIO_MEDIA = 800;
	public static final int PRECIO_ALTA = 900;

	private int metros;
	private int plantas;
	private int habitaciones;
	private int banios;
	private String calidad;
	private boolean piscina;
	private boolean garaje;

	public Casa(int metros, int plantas, int habitaciones, int banios, String calidad, boolean piscina,
			boolean garaje) {

		try {
			if (metros < 1)
				throw new Exception("Metros inválidos, no puede ser menor que 1");
			if (plantas < 1)
				throw new Exception("Plantas inválidas, no puede ser menor que 1");
			if (habitaciones < 1)
				throw new Exception("Habitaciones inválidas, no puede ser menor que 1");
			if (banios < 1)
				throw new Exception("Baños inválidos, no puede ser menor que 1");

			calidad = calidad.toLowerCase();
			if (!calidad.equals(CALIDAD_BAJA) && !calidad.equals(CALIDAD_MEDIA) && !calidad.equals(CALIDAD_ALTA)) {
				throw new Exception("Calidad inválida, escoja solamente las 3 indicadas");
			}

			this.metros = metros;
			this.plantas = plantas;
			this.habitaciones = habitaciones;
			this.banios = banios;
			this.calidad = calidad;
			this.piscina = piscina;
			this.garaje = garaje;

		} catch (Exception e) {
			System.out.println("Error al crear la casa: " + e.getMessage());
		}
	}

	public float calcularPrecio() {
		int precioM2 = 0;

		try {
			switch (calidad) {
			case CALIDAD_BAJA:
				precioM2 = PRECIO_BAJA;
				break;
			case CALIDAD_MEDIA:
				precioM2 = PRECIO_MEDIA;
				break;
			case CALIDAD_ALTA:
				precioM2 = PRECIO_ALTA;
				break;
			default:
				throw new Exception("Calidad desconocida");
			}
		} catch (Exception e) {
			System.out.println("Error en la calidad: " + e.getMessage());
		}

		float precio = metros * precioM2;

		try {
			if (plantas > 1) {
				precio += precio * 0.10 * (plantas - 1);
			}
		} catch (Exception e) {
			System.out.println("Error en plantas");
		}

		precio += banios * 1000;
		if (piscina)
			precio += 10000;

		if (garaje)
			precio += 5000;

		return precio;
	}

	public float getPrecio() {
		return calcularPrecio();
	}

	@Override
	public String toString() {
		return "Casa: " + metros + "m2, " + plantas + " plantas, " + habitaciones + " habitaciones, " + banios
				+ " baños, " + "calidad " + calidad + ", piscina=" + piscina + ", garaje=" + garaje;
	}
}