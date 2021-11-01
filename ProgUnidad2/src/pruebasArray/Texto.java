package pruebasArray;

import java.util.Scanner;

public class Texto {
	/**
	 * Programa que pide introducir varias palabras formando conjuntos hasta que
	 * pulsemos(*) y muestre los resultados por consola solo poniendo la primera letra de
	 * cada palabra introducida. Como extra crearemos varios métodos: Introducir
	 * letras(addChar), Contar cuantas vocales hay(cuentaVocales) - Imprimir contenido de
	 * lo escrito(printText) - Borrar caracteres(borraChar).
	 * 
	 * @author Robert G
	 */
	private char[] contenido;
	private int indice = 0;
	private char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'á', 'é', 'í', 'ó', 'ú', 'Á', 'É', 'Í',
			'Ó', 'Ú' };

	public Texto(int tam) {
		contenido = new char[tam];
	}

	public void addChar(char nuevo) {
		if (indice < contenido.length) {
			if (nuevo != '*') {
				contenido[indice] = nuevo;
				indice++;
			}
		} else {
			System.out.println("No hay hueco para el carácter!");
		}
	}

	public int cuentaVocales() {
		int cont = 0;
		for (int i = 0; i < indice; i++) {// PARA CADA ELEMENTO DEL ARRAY CONTENIDO
			for (int j = 0; j < vocales.length; j++) {
				if (contenido[i] == vocales[j])
					cont++;
			}
		}
		return cont;
	}

	public void printText() {
		for (int i = 0; i < indice; i++) {
			System.out.print(contenido[i] + "\n");
		}
	}

	public void borraChar() {
		if (indice != 0) // Si es distinto de 0 es que hay algo y puedo borrar
			indice--;
	}

	// Método para añadir, borrar y mostrar todas las letras según las necesitemos
	private static void prueba1() {
		Texto t = new Texto(4);// Huecos para caracteres
		t.addChar('H');
		t.addChar('O');
		t.addChar('L');
		t.addChar('A');
		t.printText();
		System.out.println("El número de vocales es " + t.cuentaVocales());
		t.borraChar();// Borro las dos últimas
		t.borraChar();
		t.printText();
		System.out.println("\n");
		t.addChar('J');
		t.addChar('A');
		t.printText();
	}

	// Método para imprimir solo las primeras letras de cada palabra introducida
	private static void prueba2() {
		Texto t = new Texto(180);// Instancio con los huecos que necesite
		Scanner sc = new Scanner(System.in);
		char caracter;
		System.out.println("Añade el texto");
		do {
			caracter = (sc.next()).charAt(0);
			t.addChar(caracter);
			t.cuentaVocales();
		} while (caracter != '*');
		t.printText();
		sc.close();
	}

	public static void main(String[] args) {
		prueba1();
		prueba2();
	}
}