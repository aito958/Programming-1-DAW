package ejercicio07;

import java.io.Serializable;
import java.util.Arrays;

public class Stock implements Serializable {

	private String nombre;
	private String categoria;
	private int cantidadesEnAlmacen[];

	public Stock(String nombre, String categoria, int[] cantidadesEnAlmacen) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.cantidadesEnAlmacen = cantidadesEnAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int[] getCantidadesEnAlmacen() {
		return cantidadesEnAlmacen;
	}

	public void setCantidadesEnAlmacen(int[] cantidadesEnAlmacen) {
		this.cantidadesEnAlmacen = cantidadesEnAlmacen;
	}

	@Override
	public String toString() {
		return "Stock [nombre=" + nombre + ", categoria=" + categoria + ", cantidadesEnAlmacen="
				+ Arrays.toString(cantidadesEnAlmacen) + "]";
	}

}
