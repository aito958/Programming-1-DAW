import java.util.LinkedList;
import java.util.List;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Gestiona las películas de un tema específico organizadas cronológicamente.
 * Utiliza LinkedList para operaciones eficientes de borrado.
 */
public class PeliculasDeUnTema {

	private String tema;
	private LinkedList<Pelicula> peliculas;

	public PeliculasDeUnTema(String tema) {
		this.tema = tema;
		this.peliculas = new LinkedList<>();
	}

	public String getTema() {
		return tema;
	}

	public void annadirPelicula(Pelicula pelicula) throws NetFloxException {
		if (pelicula == null) {
			throw new NetFloxException("La película no puede ser nula");
		}

		// Se compara usando equals() definido en Pelicula (por título)
		if (peliculas.contains(pelicula)) {
			throw new NetFloxException("La película " + pelicula.getTitulo() + " ya existe");
		}

		if (!peliculas.isEmpty()) {
			Pelicula ultimaPelicula = peliculas.getLast();
			if (pelicula.getAñoEstreno() < ultimaPelicula.getAñoEstreno()) {
				throw new NetFloxException(
					"El año de la película debe ser >= " + ultimaPelicula.getAñoEstreno());
			}
		}

		peliculas.add(pelicula);
	}

	public void borrarLasPeliculasDeUnAnno(int anno) throws NetFloxException {
		int tamanioInicial = peliculas.size();

		// Usar Iterator permite borrados seguros durante iteración
		// ArrayList fallaría aquí por ineficiencia en borrados (O(n))
		Iterator<Pelicula> iterator = peliculas.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getAñoEstreno() == anno) {
				iterator.remove();
			}
		}

		if (peliculas.size() == tamanioInicial) {
			throw new NetFloxException("No hay películas de " + anno);
		}
	}

	public void annadirOpinionAPelicula(String tituloPelicula, Opinion opinion) throws NetFloxException {
		Pelicula pelicula = buscarPeliculaPorTitulo(tituloPelicula);

		if (pelicula == null) {
			throw new NetFloxException("Película no encontrada: " + tituloPelicula);
		}

		pelicula.añadirOpinion(opinion);
	}

	public String listadoDePeliculasOrdenadasPorMediaDeOpiniones() {
		LinkedList<Pelicula> peliculasOrdenadas = new LinkedList<>(peliculas);

		// Usa Comparator que ordena por media de opiniones de mayor a menor
		peliculasOrdenadas.sort(new Comparator<Pelicula>() {
			@Override
			public int compare(Pelicula p1, Pelicula p2) {
				// Negativo para ordenar descendente (mayor a menor)
				return Double.compare(p2.mediaDeOpiniones(), p1.mediaDeOpiniones());
			}
		});

		StringBuilder sb = new StringBuilder();
		sb.append("=== PELÍCULAS DE ").append(tema).append(" ===\n");

		if (peliculasOrdenadas.isEmpty()) {
			sb.append("No hay películas\n");
		} else {
			int posicion = 1;
			for (Pelicula pelicula : peliculasOrdenadas) {
				sb.append(String.format("%d. %s (%d) - Media: %.2f\n", 
					posicion, pelicula.getTitulo(), pelicula.getAñoEstreno(), pelicula.mediaDeOpiniones()));
				posicion++;
			}
		}

		return sb.toString();
	}

	public List<Pelicula> listaPeliculasDondeIntervieneUnActor(String actor) {
		List<Pelicula> resultado = new LinkedList<>();

		// HashSet.contains() en actores es O(1)
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getActores().contains(actor)) {
				resultado.add(pelicula);
			}
		}

		return resultado;
	}

	public Pelicula buscarPeliculaPorTitulo(String titulo) {
		// Recorre la lista buscando por título con comparación case-insensitive
		for (Pelicula pelicula : peliculas) {
			if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
				return pelicula;
			}
		}
		return null;
	}

	public boolean borrar(String titulo) {
		// Recorre la lista y borra la película si encontró coincidencia
		Iterator<Pelicula> iterator = peliculas.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getTitulo().equalsIgnoreCase(titulo)) {
				iterator.remove();
				return true;
			}
		}
		return false;
	}

	public int cantidadPeliculas() {
		return peliculas.size();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tema == null) ? 0 : tema.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PeliculasDeUnTema other = (PeliculasDeUnTema) obj;
		if (tema == null) {
			if (other.tema != null)
				return false;
		} else if (!tema.equals(other.tema))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Tema ").append(tema).append("\n");

		if (peliculas.isEmpty()) {
			sb.append("No hay películas en este tema.\n");
		} else {
			// forEach con lambda
			peliculas.forEach(p -> sb.append(p).append("\n"));
		}

		return sb.toString();
	}

}