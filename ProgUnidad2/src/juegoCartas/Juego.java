package juegoCartas;

public class Juego {
	/**
	 * Clase Juego donde declaro dos variables de tipo Carta para poder invocar sus
	 * métodos y así jugar. También creo un método Jugar para ejecutar el programa y
	 * mostrar en consola si hay ganador o empate.
	 * 
	 * @author Robert G
	 */
	private Carta j1, j2;// Declaro variables j1 para jugador 1 y j2 para jugador2

	public Juego() {
		j1 = new Carta();
		j2 = new Carta();
	}

	public void jugar() {

		j1.extraercarta();// Jugador 1 extrae carta
		j1.imprimir(); // Imprime el valor de j1
		j2.extraercarta();// Jugador 2 extrae carta
		j2.imprimir(); // Imprime el valor de j2
		System.out.println("**************************");

		if (j1.getNcarta() > j2.getNcarta()) // Si j1 es mayor que j2
			System.out.println("Gana el jugador 1");
		else if (j1.getNcarta() < j2.getNcarta()) // Si j1 es menor que j2
			System.out.println("Gana el jugador 2");
		else // En caso contrario
			System.out.println("Empate");// Imprime Empate
	}

	public static void main(String[] args) {
		Juego j = new Juego();
		j.jugar();
	}
}