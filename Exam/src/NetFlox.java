import java.util.HashMap;
import java.util.Set;

public class NetFlox {

	private HashMap<String, PeliculasDeUnTema> temas;

	public NetFlox() {
		this.temas = new HashMap<>();
	}

	public void añadirTema(String tema) throws NetFloxException {
		validarTema(tema);

		tema = tema.toUpperCase();
		if (temas.containsKey(tema)) {
			throw new NetFloxException("El tema ya existe");
		}

		temas.put(tema, new PeliculasDeUnTema(tema));
	}

	public void añadirPelicula(String tema, Pelicula pelicula) throws NetFloxException {
		if (pelicula == null) {
			throw new NetFloxException("La película no puede ser nula");
		}

		tema = tema.toUpperCase();
		PeliculasDeUnTema peliculasDelTema = temas.get(tema);

		if (peliculasDelTema == null) {
			throw new NetFloxException("El tema no existe: " + tema);
		}

		peliculasDelTema.annadirPelicula(pelicula);
	}

	public void borrarPeliculaDeUnTema(String tema, String titulo) throws NetFloxException {
		validarTema(tema);
		validarTitulo(titulo);

		tema = tema.toUpperCase();
		PeliculasDeUnTema peliculasDelTema = temas.get(tema);

		if (peliculasDelTema == null) {
			throw new NetFloxException("El tema no existe: " + tema);
		}

		if (!peliculasDelTema.borrar(titulo)) {
			throw new NetFloxException("Película no encontrada: " + titulo);
		}
	}

	public String temaDePelicula(String titulo) throws NetFloxException {
		validarTitulo(titulo);

		return temas.values().stream()
			.filter(tema -> tema.buscarPeliculaPorTitulo(titulo) != null)
			.map(PeliculasDeUnTema::getTema)
			.findFirst()
			.orElse(null);
	}

	public PeliculasDeUnTema obtenerTema(String tema) throws NetFloxException {
		validarTema(tema);

		tema = tema.toUpperCase();
		PeliculasDeUnTema peliculasDelTema = temas.get(tema);

		if (peliculasDelTema == null) {
			throw new NetFloxException("El tema no existe: " + tema);
		}

		return peliculasDelTema;
	}

	public void listarTodasPeliculas() {
		if (temas.isEmpty()) {
			System.out.println("No hay temas registrados");
			return;
		}

		temas.values().forEach(System.out::println);
	}

	public Set<String> obtenerTemas() {
		return temas.keySet();
	}

	public int cantidadTemas() {
		return temas.size();
	}

	private void validarTema(String tema) throws NetFloxException {
		if (tema == null || tema.trim().isEmpty()) {
			throw new NetFloxException("El tema no puede estar vacío");
		}
	}

	private void validarTitulo(String titulo) throws NetFloxException {
		if (titulo == null || titulo.trim().isEmpty()) {
			throw new NetFloxException("El título no puede estar vacío");
		}
	}

}