package pruebasVariadas;

import java.util.Scanner;

public class Operaciones01 {
	/**
	 * Programa que pide datos al usuario y halla la suma, resta, multiplicación,
	 * división y resto.
	 * 
	 * @author Robert G
	 */
	Scanner sc;
	private double numero1, numero2;// Declaro variables privadas
	// Constructor sin parametros

	Operaciones01() {
		numero1 = 0;
		numero2 = 0;
	}

	// Calcula la suma de los números
	public double suma() {
		return (numero1 + numero2);
	}

	// Calcula la resta de los números
	public double resta() {
		return (numero1 - numero2);
	}

	// Calcula la multiplicación de los números
	public double multi() {
		return (numero1 * numero2);
	}

	// Calcula la división de los números
	public double divi() {
		return (numero1 / numero2);
	}

	// Calcula el resto de los números
	public double resto() {
		return (numero1 % numero2);
	}

	// Pide el valor de los numeros al usuario
	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el primer número: ");
		numero1 = sc.nextDouble();
		System.out.println("Introduce el segundo número: ");
		numero2 = sc.nextDouble();
		sc.close();
	}

	public static void main(String[] args) {
		Operaciones01 c = new Operaciones01();
		c.inicializar();
		// Muestra los resultados de las operaciones
		System.out.println("La suma de los números es: " + c.suma());
		System.out.println("La resta de los números es: " + c.resta());
		System.out.println("La multiplicación de los números es: " + c.multi());
		System.out.println("La división de los números es: " + c.divi());
		System.out.println("El resto de los números es: " + c.resto());
	}
}