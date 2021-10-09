package pruebasArray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMeses01 {
	/**
	 * Programa que pide introducir un número del 1 al 12 para después mostrar el mes del
	 * año
	 * 
	 * @author Robert G
	 */
	private String[] es = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };
	private String[] en = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };

	// private boolean england= false;
	private boolean spanish = true;

	public void imprimir(int i) {
		if (spanish)
			System.out.println(es[i]);
		else
			System.out.println(en[i]);
	}

	public void cambiaridiomaen() {
		// england=true;
		spanish = false;
	}

	public void cambiaridiomaes() {
		// england=false;
		spanish = true;
	}

	public void printallmonths() {
		System.out.println(Arrays.toString(es));
		System.err.println(Arrays.toString(en));
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero = 0;
		do {
			System.out.println("Dame un número entre 1 y 12");
			numero = sc.nextInt();
		} while (numero <= 0 || numero > 12);

		numero--;

		ArrayMeses01 m = new ArrayMeses01();

		m.cambiaridiomaes();
		m.imprimir(numero);// Devuelve el més solicitado

		m.cambiaridiomaen();
		m.imprimir(numero);// Devuelve el més solicitado

		m.printallmonths();// Devuelve todos los meses
		sc.close();
	}
}