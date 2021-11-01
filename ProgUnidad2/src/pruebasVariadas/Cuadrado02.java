package pruebasVariadas;

import java.util.Scanner;

public class Cuadrado02 {
	/**
	 * Programa que pide datos al usuario y halla el area y el perímetro de un cuadrado,
	 * otra forma diferente a Cuadrado01
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	int lado;

	// Constructor sin parámetros
	Cuadrado02() {
		lado = 0;
	}

	// Constructor con parámetros
	Cuadrado02(int l) {
		lado = l;
	}

	// Imprime el área
	public void area() {
		System.out.println("El área es: " + (lado * lado) + "m^2");
	}

	// Imprime el perímetro
	public void perimetro() {
		System.out.println("El perímetro es: " + (4 * lado) + "m");
	}

	// Pide el valor del lado al usuario
	public void inicializar() {
		sc = new Scanner(System.in);
		System.out.println("Introduce un lado");
		lado = sc.nextInt();
	}

	public static void main(String[] args) {
		Cuadrado02 c = new Cuadrado02();
		c.inicializar();
		c.area();
		c.perimetro();
	}
}