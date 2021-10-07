package PruebasString;

import java.util.Scanner;

public class Ejercicio4 {
	/**
	 * Determina si una cadena leída por teclado es o no un palíndromo: Palabra o
	 * expresión que es igual si se lee de izquierda a derecha que de derecha a
	 * izquierda.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("Introduce nombre:");
		Scanner sc = new Scanner(System.in);
		String cad4 = sc.next();
		cad4 = cad4.toUpperCase();
		String cad5 = "";
		for (int i = cad4.length() - 1; i >= 0; i--) {
			cad5 = cad5 + cad4.charAt(i);
		}
		if (cad4.equals(cad5)) {
			System.out.println("Es un palíndromo");
		} else {
			System.out.println("No es un palíndromo");
		}
		sc.close();
	}
}