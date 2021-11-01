package pruebasString;

import java.util.Scanner;

public class Ejercicio03 {
	/**
	 * Crea un programa Java que lea una cadena de teclado y la imprima al revés
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		System.out.println("Dame una cadena");
		Scanner sc = new Scanner(System.in);
		String cad3 = sc.nextLine();
		for (int i = cad3.length() - 1; i >= 0; i--) {
			System.out.print(cad3.charAt(i));
		}
		sc.close();
	}
}