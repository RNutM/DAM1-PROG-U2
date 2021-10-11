package pruebasVariadas;

import java.util.Scanner;

public class Operaciones02 {
	/**
	 * Programa que pide datos al usuario y halla la suma de los pares y los impares, el
	 * total de pares y de impares y la media.
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	private int numero1, numero2;// Declaro variables privadas
	// Constructor con parametros

	Operaciones02(int n1, int n2) {
		numero1 = n1;
		numero2 = n2;
	}

	// Calcula la suma de los pares entre n1 y n2
	public int sumapares() {
		int suma = 0;
		int aux;
		if (numero1 > numero2) {
			aux = numero2;
			numero2 = numero1;
			numero1 = aux;
		}
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0)
				suma = suma + i;
		}
		return suma;
	}

	// Calcula la suma de los impares entre n1 y n2
	public int sumaimpares() {
		int suma = 0;
		int aux;
		if (numero1 > numero2) {
			aux = numero2;
			numero2 = numero1;
			numero1 = aux;
		}
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 != 0)
				suma = suma + i;
		}
		return suma;
	}

	// Calcula el total de los pares entre n1 y n2
	public int contpares() {
		int cont = 0;
		int aux;
		if (numero1 > numero2) {
			aux = numero2;
			numero2 = numero1;
			numero1 = aux;
		}
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0)
				cont++;
		}
		return cont;
	}

	// Calcula el total de los impares entre n1 y n2
	public int contimpares() {
		int cont = 0;
		int aux;
		if (numero1 > numero2) {
			aux = numero2;
			numero2 = numero1;
			numero1 = aux;
		}
		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 != 0)
				cont++;
		}
		return cont;
	}

	// Calcula la media entre n1 y n2
	public double media() {
		double suma = 0;
		int aux;
		if (numero1 > numero2) {
			aux = numero2;
			numero2 = numero1;
			numero1 = aux;
		}
		int cont = 0;
		for (int i = numero1; i <= numero2; i++) {
			suma = suma + i;
			cont++;
		}
		return (suma / cont);
	}

	public static void main(String[] args) {
		Operaciones02 o = new Operaciones02(3, 10);
		System.out.println("La suma de los pares entre n1 y n2 es: " + o.sumapares());
		System.out.println("La suma de los impares entre n1 y n2 es: " + o.sumaimpares());
		System.out.println("El total de los pares entre n1 y n2 es: " + o.contpares());
		System.out.println("El total de los impares entre n1 y n2 es: " + o.contimpares());
		System.out.println("La media entre n1 y n2 es: " + o.media());
	}
}
// NOTA: Cambiar en suma por cont en los dos primeros bucles para hacer los dos siguientes