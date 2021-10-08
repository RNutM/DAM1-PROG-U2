package pruebasString;

import java.util.Scanner;

public class Ejercicio09 {

	/**
	 * Desarrollar un programa que solicite la carga de una clave. La clase debe tener
	 * dos métodos uno para la carga y otro que muestre si la clave es la correcta (la
	 * clave a comparar es "123abc" o la que queramos introducir).
	 * 
	 * @author Robert G
	 * 
	 */
	static Scanner sc = new Scanner(System.in);
	private static String clave, claveUsu;
	private static int intentos=3;
	
	public static void main(String[] args) {	
		cargaClave();	
		compruebaClave();	
	}

	// Método para cargar la clave inicial
	private static void cargaClave() {
		System.out.println("Introduce clave Inicial ");
		clave = sc.next();
	}
	
	// Método para comprobar la clave
	private static void compruebaClave() {
		System.out.println("Primer intento");
		System.out.println("Introduce la clave: ");
		claveUsu = sc.next();
		if(!claveUsu.equals(clave)) {
			System.out.println("La clave es incorrecta");
			intentos--;
		}	
		while(!claveUsu.equals(clave) && intentos>0) {
			System.out.println("Tienes "+intentos+" intentos");
			System.out.println("Introduce la clave: ");
			claveUsu = sc.next();
			intentos--;
			if(!claveUsu.equals(clave)) System.out.println("La clave es incorrecta");
		}	
		if (intentos <= 0)
			System.out.println("Se acabaron los intentos, lo siento");
		else
			System.out.println("La clave es correcta");	
	}
}
