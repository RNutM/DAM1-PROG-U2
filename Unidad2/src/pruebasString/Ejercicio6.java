package pruebasString;

import java.util.Scanner;

public class Ejercicio6 {
	/**
	 * Realizar un programa que haga lo siguiente: 
	 * 1) Pida al usuario un número entero comprendido entre [10,25] y repita 
	 * la solicitud en caso de que el número no pertenezca al intervalo. 
	 * 
	 * 2) Una vez introducido el número el programa debe
	 * detectar si es divisible por 5 y mostrar el mensaje adecuado. 
	 * 
	 * 3) Luego, el programa pedirá al usuario su nombre para mostrarle lo siguiente: 
	 * Número de caracteres del nombre Carácter inicial y final Nombre en mayúsculas
	 * Indicación de si la letra ñ o la Ñ forman parte de su nombre. 
	 * 
	 * NOTA 1: las excepciones deben gestionarse con la cláusula “throws IOException”.
	 * NOTA 2: la letra ñ es el carácter 164 de la tabla Unicode, la Ñ el 165.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 0;

		while (n < 10 || n > 25) {
			System.out.println("Introduce un número entero entre 10 y 25: ");
			n = sc.nextInt();
		}

		if (n >= 10 || n <= 25) {

			if (n % 5 == 0) {
				System.out.println("Es múltiplo de 5");
			} else {
				System.out.println("No es multiplo de 5");

			}
		}

		System.out.println("Introduce tu nombre: ");
		System.out.println("*********************");
		String cadena = sc.next();

		// Cantidad de letras o caracteres del nombre introducido
		System.out.println("El nombre tiene " + cadena.length() + " letras");

		// Primera letra y última del nombre introducido
		int posFinal = cadena.length() - 1; // Restamos uno para obtener el índice del ultimo caracter
		char letraFinal = cadena.charAt(posFinal);// Obtenemos el carácter de dicha posición
		System.out.println("La primera letra es la " + cadena.charAt(0) + " y la última letra es la " + letraFinal);

		// Cambiar a mayusculas el nombre introducido
		System.out.println("El nombre en mayúsculas es: " + cadena.toUpperCase());

		// Comprobación de si el nombre contiene la letra ñ o no
		// String letra=("ñ");
		// String letra2=("Ñ");
		boolean cadena1 = (cadena.contains("ñ") || cadena.contains("Ñ"));

		if (cadena1) {
			System.out.println("El nombre contiene la letra ñ o Ñ");
		} else {
			System.out.println("El nombre no contiene la letra ñ o Ñ");
		}
		sc.close();
	}
}