package pruebasVariadas;

import java.util.Scanner;

public class Persona02 {
	/**
	 * Programa persona con (nombre, edad, nif, sexo, peso y altura) constructor sin, con
	 * algunos parámetros y con todos los parámetros. Métodos para pedir datos al
	 * usuario, comprobar si es mayor o menor de edad, comprobar su IMC dependiendo del
	 * (peso, edad y altura), imprimir esos datos.
	 * 
	 * @author Robert G
	 */
	private String nombre;
	private int edad;
	private String nif;
	private String sexo;
	private double peso;
	private double altura;

	// Constructor sin parametros, si no ponemos nada es public
	public Persona02() {
		nombre = "";
		edad = 0;
		nif = "";
		sexo = "H";
		peso = 0;
		altura = 0;
	}

	// Constructor con algunos parametros
	public Persona02(String n, int e, String s) {
		nombre = n;
		edad = e;
		sexo = s;
	}

	// Constructor con todos los parametros
	public Persona02(String n, int e, String ni, String s, double p, double a) {
		nombre = n;
		edad = e;
		nif = ni;
		sexo = s;
		peso = p;
		altura = a;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Metodo calcular IMC
	public int calcularIMC() {
		Scanner sc = new Scanner(System.in);
		/*
		 * System.out.println(peso/(altura*altura)); Para mostrar con valor numérico double
		 * valorimc=sc.nextDouble();
		 */
		double valorimc = peso / (Math.pow(altura, 2));
		int funcion1 = 0;
		if (valorimc < 20) {
			funcion1 = -1;
		}
		if (valorimc >= 20 && valorimc <= 25) {
			funcion1 = 0;
		}
		if (valorimc > 25) {
			funcion1 = 1;
		}
		sc.close();
		return funcion1;
	}

	// Metodo calcular si es mayor de edad
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18)
			mayor = true;
		return mayor;
		// en una sola linea sería así return (edad>=18);
	}

	// Metodo comprobar sexo
	public void comprobarSexo(String s) {
		if (!s.equals("h") || !s.equals("H") || !s.equals("m") || !s.equals("M"))
			sexo = "H";
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", nif=" + nif + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el nombre");
		String n = sc.next();
		System.out.println("Dame la edad");
		int e = sc.nextInt();
		System.out.println("Dame el DNI");
		String ni = sc.next();
		System.out.println("Hombre o mujer");
		String s = sc.next();
		System.out.println("Dame el peso");
		double p = sc.nextDouble();
		System.out.println("Dame la altura");
		double a = sc.nextDouble();

		Persona02 per1 = new Persona02(n, e, ni, s, p, a);
		System.out.println(per1.toString());
		Persona02 per2 = new Persona02();
		System.out.println(per2.toString());
		Persona02 per3 = new Persona02("Juan", 56, "H");
		System.out.println(per3.toString());

		if (per1.esMayorDeEdad())
			System.out.println(per1.nombre + " es mayor de edad");
		else
			System.out.println(per1.nombre + " no es mayor de edad");

		per1.comprobarSexo(s);
		System.out.println(per1.getNombre() + " es " + per1.getSexo());

		switch (per1.calcularIMC()) {
		case -1:
			System.out.println("El peso esta por debajo de lo normal");
			break;
		case 0:
			System.out.println("El peso es normal");
			break;
		case 1:
			System.out.println("El peso esta por encima de lo normal");
			break;
		}
		sc.close();
	}
}