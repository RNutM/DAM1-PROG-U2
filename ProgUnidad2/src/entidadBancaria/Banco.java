package entidadBancaria;

public class Banco {
	/**
	 * Programa de banco para hacer pruebas de ingresos y reintegros de dinero de un
	 * banco, donde creamos 3 objetos de tipo Cliente con un dni, nombre y saldo inicial,
	 * para hacer pruebas posteriores. He creado un método operar(ingresos/reintegros) y
	 * otro método para mostrar nombre y saldo de los clientes y también el saldo final
	 * total del banco.
	 * 
	 * @author Robert G
	 */

	// He creado variables de tipo cliente para poder acceder a sus métodos
	private Cliente c1, c2, c3;

	public Banco() {
		c1 = new Cliente("75489652S", "Ana", 10000);
		c2 = new Cliente("63254178G", "Jose", 200);
		c3 = new Cliente("52634178T", "Sara", 600);
	}

	public void operar() {
		c1.ingresar(-5);
		c2.ingresar(500);
		c3.ingresar(40);
		c1.extraer(60);
		c2.extraer(850);
		c3.extraer(300);
	}

	public void saldoFinal() {
		// Saldo de cada cliente y su nombre
		System.out.println("*************************");
		System.out.println("Cliente 1: " + c1.getNombre());
		System.out.println("  " + c1.getSaldo());
		System.out.println("Cliente 2: " + c2.getNombre());
		System.out.println("  " + c2.getSaldo());
		System.out.println("Cliente 3: " + c3.getNombre());
		System.out.println("  " + c3.getSaldo());
		System.out.println("*************************");
		// Saldo final del banco=suma de los saldos de los clientes
		double saldofinal = c1.getSaldo() + c2.getSaldo() + c3.getSaldo();
		System.out.println("El saldo final del banco es: " + saldofinal);
	}

	public static void main(String[] args) {
		// Creo b que tiene 3 clientes
		Banco b = new Banco();
		b.operar();
		b.saldoFinal();
	}
}