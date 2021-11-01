package juegoDados;

public class Juego {
	/**
	 * Clase Juego donde declaro dos variables de tipo Dado para poder invocar sus
	 * métodos y así jugar. También creo un método Jugar para ejecutar el programa
	 * poniendo los intentos que crea oportuno y mostrar en consola si hay ganador o se
	 * acabaron los intentos.
	 * 
	 * FUNCIONAMIENTO: Tira un jugador y el otro tiene que sacar el mismo número para ganar
	 * Disponemos de los intentos que declaremos en el método jugar.
	 * 
	 * @author Robert G
	 */
	private Dado d1, d2;

	public Juego() {
		d1 = new Dado();
		d2 = new Dado();
	}

	public void jugar() {
		int intentos = 3;
		do {
			d1.lanzar();
			System.out.println("Tira el jugador 1 y...");
			d1.imprimirValor();
			d2.lanzar();
			System.out.println("Tira el jugador 2 y...");
			d2.imprimirValor();
			System.out.println("**************************");
			intentos--;

		} while ((d1.getvalor() != d2.getvalor()) && intentos > 0);

		if (intentos == 0 && (d1.getvalor() != d2.getvalor()))
			System.out.println("Has consumido todos los intentos");
		else
			System.out.println("¡¡GANA!!");
	}

	public static void main(String[] args) {
		Juego j = new Juego();
		j.jugar();
	}
}