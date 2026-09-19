package com.monroy.pizzeria;

public class PizzaNormal extends Pizza {

	public static final int TOTAL_PIZZAS_PREPARADAS = 20;
	private int numPizza;
	
	public PizzaNormal(Tamanho tam, int num) throws PizzaException{
		super(tam);
		setNumPizza(num);
	}

	public int getNumPizza() {
		return numPizza;
	}

	public void setNumPizza(int numPizza) throws PizzaException {
		if(numPizza < 1 || numPizza > TOTAL_PIZZAS_PREPARADAS)
			throw new PizzaException("ERROR. El número de Pizza no es correcto.");
		this.numPizza = numPizza;
	}

	@Override
	public String toString() {
		return super.toString()+"\nNúmero: " + numPizza;
	}
	
	
	
}
