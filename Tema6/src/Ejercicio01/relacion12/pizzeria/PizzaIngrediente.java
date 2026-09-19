package Ejercicio01.relacion12.pizzeria;

import java.util.*;

public class PizzaIngrediente extends Pizza {

	private HashSet<Ingredientes> listaIngredientes;

	public PizzaIngrediente(Tamanho tam) {
		super(tam);
		listaIngredientes = new HashSet<Ingredientes>();

	}

	public void agregarIngrediente(Ingredientes ing) {
listaIngredientes.add(ing);
	}

	@Override
	public String toString() {
		return "PizzaIngrediente [listaIngredientes=" + listaIngredientes + "]";
	}

}
