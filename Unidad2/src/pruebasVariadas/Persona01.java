package pruebasVariadas;

import java.util.Scanner;

public class Persona01 {
	/**
	 * Programa persona con nombre y edad, constructor sin y con parámetros. Métodos para
	 * pedir datos al usuario, imprimir esos datos y comprobar si es mayor o menor de
	 * edad.
	 * 
	 * @author Robert G
	 */
	private String nombre;
	private int edad;
	Scanner teclado;

	// Constructor sin parametros
	Persona01() {
		edad = 0;
		nombre = "noname";
	}

	// Constructor con parametros
	Persona01(String n, int e) {
		nombre = n;
		edad = e;
	}

	// Pedir al usuario el nombre y la edad
	public void inicializar() {
		teclado = new Scanner(System.in);
		System.out.println("Dame el nombre");
		nombre = teclado.next();
		System.out.println("Dime la edad");
		edad = teclado.nextInt();
	}

	// Imprimir los valores de edad y nombre
	public void imprimir() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La edad es: " + edad);
	}

	// Imprimir los valores de mayor o menor de edad
	public void esMayor() {
		if (edad >= 18)
			System.out.println("Es mayor de edad");
		else
			System.out.println("Es menor de edad");
	}

	public static void main(String[] args) {
		Persona01 p1 = new Persona01();// Vacío
		Persona01 p2 = new Persona01("Juan", 25);// Con datos
		Persona01 p3 = new Persona01();// Con datos desde el usuario
		
		p3.inicializar(); // Inicializo para mostrar en p3 los datos que introduce el usuario
		
		// Imprime los valores de las personas
		System.out.println("La primera persona: ");
		p1.imprimir();
		p1.esMayor();
		System.out.println("La segunda persona: ");
		p2.imprimir();
		p2.esMayor();
		System.out.println("La tercera persona: ");
		p3.imprimir();
		p3.esMayor();
	}
}