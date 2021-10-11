package pruebasVariadas;

import java.util.Scanner;

public class Raices02 {
	/**
	 * Programa raices para resolver ecuaciones de 2º grado, donde pedimos al usuario que
	 * introduzca el valor de a, b y c. Después mostramos si tiene dos soluciones
	 * diferentes, dos soluciones iguales que es lo mismo que tener una sola solución o
	 * si no tiene solución. Ecuación de segundo grado: ax^2+bx+c = 0 Fórmula →
	 * x=(-b±√(b^2-4ac))/2a
	 * 
	 * @author Robert G
	 */
	private static int a, b, c, discriminante, op = 0;
	private float x1, x2, raiz = 0;

	public Raices02(int a2, int b2, int c2) {
	}

	public void inicializar() {
		Scanner s = new Scanner(System.in);
		System.out.println("Ejemplos para probar los 3 metodos");
		System.out.println("**********************************");
		System.out.println("0 Soluciones --> (ax²=1)+(bx=2)+(c=3)=0");
		System.out.println("1 Solución --> (ax²=1)+(bx=-4)+(c=4)=0");
		System.out.println("2 Soluciones --> (ax²=1)+(bx=-5)+(c=4)=0");
		System.out.println("**********************************");
		System.out.println("Introduce el valor para X²");
		a = s.nextInt();
		System.out.println("Introduce el valor para X");
		b = s.nextInt();
		System.out.println("Introduce el término independiente");
		c = s.nextInt();
		s.close();
	}

	/**
	 * Simbolo Δ -> Delta (mayúscula Δ, minúscula δ) es la cuarta letra del alfabeto
	 * griego. En griego antiguo tenía la pronunciación de una oclusiva alveolar sonora
	 * [d] u oclusiva dental sonora, en griego moderno se pronuncia como fricativa dental
	 * sonora [ð].
	 * 
	 */
	public double discriminante() {
		return discriminante = (b * b) - (4 * a * c);
	}

	public void obtenerRaices() {
		op = (2 * a);
		raiz = (float) Math.sqrt(discriminante);

		x1 = (float) (-b - (raiz));
		x2 = (float) (-b + (raiz));
		double r1 = (x1 / op);
		if (Double.isNaN(r1)) {
			System.out.println("x1 no tiene solución");
		}
		double r2 = (x2 / op);
		if (Double.isNaN(r2)) {
			System.out.println("x2 no tiene solución");
		} else {
			System.out.println("El resultado x1 es:" + r1);
			System.out.println("El resultado x2 es:" + r2);
		}
	}

	public boolean tieneRaices() {
		System.out.println("Tiene dos soluciones ya que el resultado del Δ es: " + discriminante);
		return true;
	}

	public boolean tieneRaiz() {
		System.out.println("Tiene una solución única ya que el resultado del Δ es: " + discriminante);
		return true;
	}

	public boolean notieneRaiz() {
		System.out.println("No tiene solución ya que el resultado del Δ es: " + discriminante);
		return false;
	}

	public static void main(String[] args) {
		Raices02 r = new Raices02(a, a, a);
		r.inicializar();
		r.discriminante();
		if (discriminante > 0) {// Tiene dos soluciones
			r.tieneRaices(); // 1 -5 4
			r.obtenerRaices();
		}
		if (discriminante == 0) {// Tiene dos soluciones iguales con lo que es una sola solución
			r.tieneRaiz(); // 1 -4 4
			r.obtenerRaices();
		}
		if (discriminante < 0) {// No tiene solución - 1 2 3
			r.notieneRaiz();
			r.obtenerRaices();
		}
	}
}