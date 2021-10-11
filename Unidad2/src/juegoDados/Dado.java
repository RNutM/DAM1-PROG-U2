package juegoDados;

public class Dado {
	/**
	 * Clase Dado donde creo el método lanzar para obtener un número aleatorio entre 1 y
	 * 6 y además creo el método imprimirValor para mostrar el resultado obtenido.
	 * 
	 * @author Robert G
	 */
	private int valor;

	Dado() {
		valor = 1;
	}

	public void lanzar() {
		valor = ((int) (Math.random() * 6) + 1);
	}

	public int getvalor() {
		return valor;
	}

	public void imprimirValor() {
		System.out.println("Saca un " + valor);
	}
}