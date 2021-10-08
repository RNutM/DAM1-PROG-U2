package pruebasString;

import java.util.Scanner;

public class Ejercicio10 {
	/**
	 * Programa que pida al usuario que introduzca un conjunto de palabras (oración o
	 * frase) y luego muestre cada palabra en una linea diferente cada una.
	 * 
	 * @author Robert G
	 */
	private Scanner sc;
	private String conjunto;

	public Ejercicio10() {
		sc = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		conjunto = sc.nextLine();

	}

	public void imprimir() {
		for (int f = 0; f < conjunto.length(); f++) {
			if (conjunto.charAt(f) == ' ') {
				System.out.println();
			} else {
				System.out.print(conjunto.charAt(f));
			}
		}
	}

	public static void main(String[] args) {
		Ejercicio10 cadena = new Ejercicio10();
		cadena.imprimir();
	}
}

/*
 * MUY IMPORTANTE: Darse cuenta de que en el método imprimir el system del else tiene
 * ser print y no println ya que imprimiria las palabras desglosadas a cada letra
 */