package pruebasVariadas;

import java.util.Scanner;

public class Triangulo {
	/**
	 * Programa que pide los 3 lados de un triángulo y determina si es Equilátero(3 lados
	 * iguales), Isósceles(2 lados iguales) o Escaleno(ningún lado igual).
	 * 
	 * También he incluido un método para hallar el área de un rectángulo.
	 * 
	 * @author Robert G
	 */
	private int lado1, lado2, lado3;
	Scanner teclado;

	Triangulo() {
		lado1 = 0;
		lado2 = 0;
		lado3 = 0;
	}

	Triangulo(int i, int j, int k) {
		lado1 = i;
		lado2 = j;
		lado3 = k;
	}

	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Introduce el lado 1");
		lado1 = teclado.nextInt();
		System.out.println("Introduce el lado 2");
		lado2 = teclado.nextInt();
		System.out.println("Introduce el lado 3");
		lado3 = teclado.nextInt();
	}

	// Imprimir los valores de triángulo
	public void mostrarloslados() {
		System.out.println("los lados son " + lado1 + " " + lado2 + " " + lado3);
	}

	// Método que determina de tipo es el triángulo
	public void esTipo() {
		if (lado1 == lado2 && lado2 == lado3)
			System.out.println("El triángulo es Equilátero");
		else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
			System.out.println("El triángulo es Isósceles");
		else
			System.out.println("El triángulo es Escaleno");
	}

	// Método para hallar el area de un rectángulo
	public int area(int base, int altura) {
		return ((base * altura) / 2);
	}

	public static void main(String[] args) {

		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Triangulo t3 = new Triangulo();

		t1.inicializar();
		t1.mostrarloslados();
		t1.esTipo();

		t2.inicializar();
		t2.mostrarloslados();
		t2.esTipo();

		t3.inicializar();
		t3.mostrarloslados();
		t3.esTipo();

		Triangulo rectangulo = new Triangulo();
		int area = rectangulo.area(4, 3);
		System.out.println("\nEl area del rectángulo es: " + area);
	}
}