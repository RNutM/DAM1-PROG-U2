package pruebasString;

import java.util.Scanner;

public class Ejercicio5 {
	/**
	 * Crea un programa Java que lea por teclado y muestre un mensaje con el número de
	 * veces que ha aparecido la letra A y la letra E.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		/*
		 * OTRA MANERA int na=0; int ne=0; for(int i=0; i<cad.length(); i++) {
		 */

		System.out.println("Introduce un nombre: ");
		Scanner sc = new Scanner(System.in);
		String cad = sc.nextLine();

		int contadorA = 0;
		int contadorE = 0;
		char c = ' ';
		cad = cad.toUpperCase();
		for (int i = 0; i < cad.length(); i++) {
			c = cad.charAt(i);
			if (c == 'A') {
				contadorA++;
			}
			if (c == 'E') {
				contadorE++;
			}
		}
		System.out.println("Hay " + contadorA + " a y hay " + contadorE + " e");
		sc.close();
	}
}