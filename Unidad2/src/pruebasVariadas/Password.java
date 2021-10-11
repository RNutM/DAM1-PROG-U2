package pruebasVariadas;

import java.util.Scanner;

public class Password {
	/**
	 * Programa password donde se puede pedir al usuario que introduzca password,
	 * comprobamos que tenga más de x caracteres, si la pass es fuerte con otro método y
	 * después imprime los resultados.
	 * 
	 * @author Robert G
	 */
	private int longitud;
	private String pass;
	static Scanner sc = new Scanner(System.in);

	// Constructor - Reservamos un espacio en memoria
	public Password() {
		longitud = 11;
		pass = "aaaaaaaa";
	}

	// Constructor - Reservarmos un espacio en memoria
	public Password(int longitud) {
		this.longitud = longitud;
	}

	// Metodo get longitud
	public int getLongitud() {
		return longitud;
	}

	// Metodo set longitud
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	// Metodo get pass
	public String getPass() {
		return pass;
	}

	// Metodo para generar la contraseña
	public void generarPassword() {
		do {
			System.out.println("Dame una contraseña (Mínimo 11 caracteres)");
			pass = sc.next();
		} while (pass.length() < 11);

		longitud = pass.length();
		// sc.close(); // No cierro el Scanner para poder seguir pidiendo passwords
	}

	// Método para imprimir los datos introducidos por el usuario
	public void imprimir() {
		System.out.println("La contraseña es " + pass + " y su longitud es " + longitud);
	}

	// Metodo para comprobar si la contraseña es fuerte
	public boolean esfuerte() {
		boolean fuerte = false;

		int M = 0;
		int m = 0;
		int n = 0;

		for (int i = 0; i < longitud; i++) {
			if (Character.isDigit(pass.charAt(i)))
				n++;
			if (Character.isLowerCase(pass.charAt(i)))
				m++;
			if (Character.isUpperCase(pass.charAt(i)))
				M++;
		}

		// más de 2 mayúsculas(3), mas de 1 minúscula(2) y mas de 5 números(6)
		if (M > 2 && m > 1 && n > 5)
			fuerte = true;
		return fuerte;
	}

	public static void main(String[] args) {

		Password p1 = new Password();
		Password p2 = new Password();
		Password p3 = new Password();
		do {
			System.out.println("Primera contraseña");
			p1.generarPassword();
		} while (!p1.esfuerte());
		System.out.println("_______________________");
		do {
			System.out.println("Segunda contraseña");
			p2.generarPassword();
		} while (!p2.esfuerte());
		System.out.println("_______________________");
		do {
			System.out.println("Tercera contraseña");
			p3.generarPassword();
		} while (!p3.esfuerte());
		System.out.println("_______________________");

		/*
		 * p1.generarPassword(); p2.generarPassword(); p3.generarPassword(); sc.close();
		 * p1.imprimir(); p2.imprimir(); p3.imprimir();
		 * 
		 * p1.esfuerte(); p2.esfuerte(); p3.esfuerte();
		 */

		if (p1.esfuerte()) {
			System.out.println("La contraseña es " + p1.getPass() + " es fuerte");
		} else {
			System.out.println("La contraseña " + p1.getPass() + " no es fuerte");
		}

		if (p2.esfuerte()) {
			System.out.println("La contraseña es " + p2.getPass() + " es fuerte");
		} else {
			System.out.println("La contraseña " + p2.getPass() + " no es fuerte");
		}

		if (p3.esfuerte()) {
			System.out.println("La contraseña es " + p3.getPass() + " es fuerte");
		} else {
			System.out.println("La contraseña " + p3.getPass() + " no es fuerte");
		}
	}
}
