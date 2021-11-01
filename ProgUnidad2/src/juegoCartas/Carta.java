package juegoCartas;

public class Carta {
	/**
	 * Clase Carta donde creo el método para extraer cartas aleatorias del 1 al 12 y los
	 * palos aleatorios del 1 al 4. También creo un método imprimir para mostrar los
	 * resultados.
	 * 
	 * @author Robert G
	 */
	private int ncarta;
	private String palo;

	Carta() {// Constructor sin parametros
		ncarta = 0;
		palo = "";
	}

	Carta(int ncarta, String palo) {// Constructor con parametros
		this.ncarta = ncarta;
		this.palo = palo;
	}

	public void extraercarta() {
		ncarta = ((int) (Math.random() * 12) + 1);// Almacena un numero aleatorio entre 1 y 12 en la variable ncarta
		while (ncarta == 8 || ncarta == 9) {// Mientras que ncarta sea 8 o 9 calcula de nuevo
			ncarta = ((int) (Math.random() * 12) + 1);// Almacena un numero aleatorio entre 1 y 12 en la variable ncarta
		}
		int p = ((int) (Math.random() * 4) + 1);// Almacena un numero aleatorio entre 1 y 4 en la variable p

		switch (p) {
		case 1:
			palo = "Oros";// En caso de que p valga 1 es Oros
			break;
		case 2:
			palo = "Copas";// En caso de que p valga 2 es Copas
			break;
		case 3:
			palo = "Bastos";// En caso de que p valga 3 es Bastos
			break;
		case 4:
			palo = "Espadas";// En caso de que p valga 4 es Espadas
			break;
		}
	}

	public void imprimir() {// Imprimir los valores de palo y ncarta
		System.out.println("El palo es: " + palo);
		System.out.println("El número es: " + ncarta);
	}

	public int getNcarta() {
		return ncarta;
	}

	public void setNcarta(int ncarta) {
		this.ncarta = ncarta;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}
}