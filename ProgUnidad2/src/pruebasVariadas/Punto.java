package pruebasVariadas;

import java.util.Scanner;

public class Punto {
	/**
	 * Punto en el plano con lo que lleva 2 coordenadas, calculamos la ecuación de
	 * la recta que pasa por dos puntos Donde A(x1 ,y 1 ) y B(x 2 ,y 2
	 * 
	 * @author Robert G
	 */
	private int x, y;

	Punto() {
		x = 0;
		y = 0;
	}

	Punto(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public static void main(String[] args) {
		Punto p1 = new Punto();
		p1.inicializar();
		p1.mostrarCuadrante();

		Punto A = new Punto(2, 3);
		Punto B = new Punto(4, 8);

		double d = distancia(A, B);// Uso el método distancia
		System.out.println("\nLa distancia es: " + d);
		System.out.println("Ecuación de la recta que pasa por A y B es: ");
		System.out.println("(x-" + A.x + ")/" + (B.x - A.x) + " = (y-" + A.y + ")/" + (B.y - A.y));
	}

	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primera coordenada");
		x = sc.nextInt();
		System.out.println("Segunda coordenada");
		y = sc.nextInt();
		sc.close();
	}

	public void mostrarCuadrante() {
		if (x == 0 && y == 0)
			System.out.println("Origen");
		else {
			if (x < 0) {
				if (y < 0)
					System.out.println("Tercer cuadrante");
				else
					System.out.println("Segundo cuadrante");
			} else {
				if (y < 0)
					System.out.println("Cuarto cuadrante");
				else
					System.out.println("Primer cuadrante");
			}
		}
	}

	public static double distancia(Punto A, Punto B) {
		double d = Math.sqrt(Math.pow((B.x - A.x), 2) + Math.pow((B.y - A.y), 2));
		return d;
	}
}