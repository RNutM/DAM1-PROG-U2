package pruebasVariadas;

import java.util.Scanner;

public class Cuadrado01 {
	/**
	 * Programa que pide datos al usuario y halla el area y el perímetro de un cuadrado,
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	int lado;

	// Constructor sin parámetros
	Cuadrado01() {
		lado = 0;
	}

	// Constructor con parámetros
	Cuadrado01(int l) {
		lado = l;
	}

	// Calcula el área
	public int area() {
		// System.out.println("El área es: "+(lado*lado));
		return (lado * lado);
	}

	// Imprime el perímetro
	public int perimetro() {
		// System.out.println("El perímetro es: "+(4*lado));
		return (4 * lado);
	}

	// Pide el valor del lado al usuario
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un lado");
		lado = sc.nextInt();
		sc.close();
	}

	public static void main(String[] args) {
		Cuadrado01 c = new Cuadrado01();
		c.inicializar();
		System.out.println("El área es: " + c.area() + "m^2");
		System.out.println("El perímetro es: " + c.perimetro() + "m");

	}
}