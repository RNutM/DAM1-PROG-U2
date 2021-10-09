package pruebasArray;

import java.util.Scanner;

public class Sueldos {
	/**
	 * Programa que pide introducir sueldos para almacenar en un array y despues los
	 * muestra
	 * 
	 * @author Robert G
	 */
	private float[] sueldos;

	// Constructor(inicializa variables y reserva memoria
	public Sueldos() {
		sueldos = new float[5];
	}

	// Metodo cargar
	public void cargar() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Dame el sueldo " + (i + 1));
			sueldos[i] = sc.nextFloat();
		}
		sc.close();
	}

	// Metodo Imprimir
	public void imprimir() {
		for (int i = 0; i < 5; i++)
			System.out.println("Sueldo " + (i + 1) + ": " + sueldos[i]);
	}

	public static void main(String[] args) {

		Sueldos e = new Sueldos();
		e.cargar();
		e.imprimir();
	}
}