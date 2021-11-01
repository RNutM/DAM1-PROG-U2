package pruebasString;

import java.util.Scanner;

public class Adivina {
	/**
	 * Programa para adivinar la palabra secreta que introduce el usuario y después
	 * dispone de 5 intentos, obteniendo como pista solo las consonantes.
	 * 
	 * @author Robert G
	 */
	String secreta, aux;// Declaramos variables String
	Scanner sc = new Scanner(System.in);

	// Constructor sin parámetros
	Adivina() {
		secreta = " ";
		aux = " ";
	}

	// Constructor con parámetros
	Adivina(String secreta, String aux) {
		this.secreta = secreta;
		this.aux = aux;
	}

	public static void main(String[] args) {

		Adivina a = new Adivina();

		a.imprimirsinvocales();
		a.existevocal();
	}

	// Método imprimir sin vocales
	public void imprimirsinvocales() {
		System.out.println("Introduzca una palabra secreta");
		secreta = sc.next();

		// Declaramos variables
		char x;// x=asterisco
		int largo = secreta.length();// largo es la longitud de la palabra secreta
		aux = secreta;// Igualamos aux a secreta

		for (int i = 0; i < largo; i++) {// Bucle for para incrementar mientras sea menor que largo
			x = secreta.charAt(i);

			if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
				secreta = secreta.replace(x, '*');// Tapamos las vocales con *
			}
		}
		System.out.println(secreta);
	}

	// Método existevocal
	public void existevocal() {
		System.out.println("Dime vocales para averiguar que palabra es: " + secreta);
		System.out.println("Dispones de 5 intentos");

		int cont = 5;// Variable para contar

		// Mientras que aux sea distinto de secreta y el contador mayor que 0
		while (!aux.equals(secreta) && cont > 0) {
			System.out.println(secreta + "   Solo te quedan " + cont + " intentos");
			System.out.println("Introduce una vocal");

			char vocal;// Variable tipo caracter para las vocales
			vocal = sc.next().charAt(0);

			System.out.println("Has introducido la letra: " + vocal);

			for (int i = 0; i < secreta
					.length(); i++) {/*
										 * Mientras que i sea menor que la longitud de la palabra secreta incrementa i
										 */
				if (secreta.charAt(i) == '*' && vocal == aux.charAt(i)) {
					// System.out.println("acierto");
					secreta = secreta.substring(0, i) + vocal + secreta.substring(i + 1);
				}
			}
			cont--;// Contador de intentos hacia atras
		}

		if (cont <= 0)
			System.out.println("Has perdido se acabaron los intentos, vuelve a jugar");
		else
			System.out.println("Has ganado, enhorabuena!!!");
	}
}