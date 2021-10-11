package pruebasVariadas;

import java.util.Scanner;

public class Empleado {
	/**
	 * Realizar una clase llamada Empleado que pide nombre, DNI y sueldo al usuario y
	 * dependiendo del sueldo el programa dice si pagara impuesto o no.
	 * 
	 * @author Robert G
	 */
	private String nombre;
	private String DNI;
	private double sueldo;

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public Empleado() {
		nombre = " ";
		setDNI(" ");
		sueldo = 0;
	}

	public Empleado(String n, String D, double s) {
		nombre = n;
		setDNI(D);
		sueldo = s;
	}

	public void inicializar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre");
		nombre = sc.next();
		System.out.println("DNI");
		setDNI(sc.next());
		System.out.println("Sueldo");
		sueldo = sc.nextDouble();
		sc.close();
	}

	public boolean PagarImpuestos() {
		if (sueldo >= 3000)
			return true;
		else
			return false;
	}

	public void PagarImpuestos2() {
		if (sueldo >= 3000)
			System.out.println("El empleado " + nombre + " paga impuestos");
		else
			System.out.println("El empleado " + nombre + " no paga impuestos");
	}

	public static void main(String[] args) {
		//Empleado e1 = new Empleado();
		Empleado e2 = new Empleado("Ana", "35423565X", 3500);
		Empleado e3 = new Empleado();
		// e1.inicializar();
		e3.inicializar();
		// Determinar si pagan impuestos
		/*
		 * if(e1.PagarImpuestos())
		 * System.out.println("El empleado "+e1.nombre+" paga impuestos");
		 * if(e2.PagarImpuestos())
		 * System.out.println("El empleado "+e2.nombre+" paga impuestos");
		 * if(e3.PagarImpuestos())
		 * System.out.println("El empleado "+e3.nombre+" paga impuestos");
		 */

		// e1.PagarImpuestos2();
		e2.PagarImpuestos2();
		e3.PagarImpuestos2();
	}
}