package PruebasString;

public class Ejercicio2 {
	/**
	 * Crea un programa Java que defina una cadena de caracteres y los muestre con la
	 * posición de sus caracteres invertida.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		String cad1 = "Empieza a trabajar como programador Java\n";
		String cad2 = "avaJ rodamargorp omoc rajabart a azeipmE\n";

		for (int i = cad1.length() - 1; i >= 0; i--) {
			System.out.print(cad1.charAt(i));
		}

		for (int i = cad2.length() - 1; i >= 0; i--) {
			System.out.print(cad2.charAt(i));
		}
	}
}