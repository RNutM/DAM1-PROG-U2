package entidadBancaria;

public class Cliente {
	/**
	 * Clase Cliente con atributos y métodos ingresar y extraer personalizados.
	 * 
	 * @author Robert G
	 */
	private String DNI;
	private String nombre;
	private int edad;
	private String direccion;
	private String correo;
	private int telefono;
	private double saldo;

	public Cliente() {
		DNI = "";
		nombre = "";
		edad = 0;
		direccion = "";
		correo = "";
		telefono = 0;
		saldo = 0.0;
	}

	public Cliente(String DNI, String nombre, int edad, String direccion, String correoe, int telefono, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.correo = correoe;
		this.telefono = telefono;
		this.saldo = saldo;
	}

	public Cliente(String DNI, String nombre, double saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
		edad = 0;
		direccion = "";
		correo = "";
		telefono = 0;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreoe() {
		return correo;
	}

	public void setCorreoe(String correoe) {
		this.correo = correoe;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Has intentado ingresar una cantidad negativa");
		else
			saldo = saldo + cantidad;
	}

	public void extraer(double cantidad) {
		if (cantidad > saldo)
			System.out.println("\n"+this.getNombre() + "    NO HAY SALDO SUFICIENTE");
		else
			saldo = saldo - cantidad;
	}
}