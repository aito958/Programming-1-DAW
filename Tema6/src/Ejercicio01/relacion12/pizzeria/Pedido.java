
package Ejercicio01.relacion12.pizzeria;

import java.util.ArrayList;
import java.util.HashSet;

public class Pedido {
	private String direccion;
	private ArrayList<Pizza> pizzas;

	public Pedido(String direccion) {
		pizzas = new ArrayList<Pizza>();

	}

	public void agregarPizza(Pizza a) {
		pizzas.add(a);
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
