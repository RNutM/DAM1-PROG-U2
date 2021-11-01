package pruebasVariadas;

import java.util.Scanner;

public class Raices01 {
	/**
	 * Programa raices para resolver ecuaciones de 2º grado, donde pedimos al usuario que
	 * introduzca el valor de a, b y c. Después mostramos si tiene dos soluciones
	 * diferentes, dos soluciones iguales que es lo mismo que tener una sola solución o
	 * si no tiene solución.
	 * 
	 * @author Robert G
	 */
	int a, b, c;

	public Raices01(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void obtenerRaices() {
		double raiz1 = 0, raiz2 = 0;
		if (this.getDiscriminante() == 0) {
			raiz1 = (-b) / (2 * a);
			System.out.println("La solución es: " + raiz1);
		} else if (this.getDiscriminante() != -1) {
			raiz1 = ((-b) + Math.sqrt(this.getDiscriminante())) / (2 * a);
			raiz2 = ((-b) - Math.sqrt(this.getDiscriminante())) / (2 * a);
			System.out.println("La soluciones son: " + raiz1 + " " + raiz2);
		} else
			System.out.println("No tiene solución real");
	}

	public double getDiscriminante() {
		double discriminante = -1;
		if (tieneRaices())
			discriminante = (Math.pow(b, 2)) - (4 * a * c);
		else if (tieneRaiz())
			discriminante = 0;
		return discriminante;
	}

	public boolean tieneRaiz() {
		if ((Math.pow(b, 2)) - (4 * a * c) == 0)
			return true;
		else
			return false;
	}

	public boolean tieneRaices() {
		if ((Math.pow(b, 2)) - (4 * a * c) > 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el valor de a");
		int a = sc.nextInt();
		System.out.println("Dame el valor de b");
		int b = sc.nextInt();
		System.out.println("Dame el valor de c");
		int c = sc.nextInt();

		Raices01 r = new Raices01(a, b, c);
		r.obtenerRaices();
		sc.close();
	}
}