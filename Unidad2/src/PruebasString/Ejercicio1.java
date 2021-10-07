package PruebasString;

public class Ejercicio1 {
	/**
	 * Realizar programa en el cual se defina una cadena de caracteres y mostrar esa
	 * cadena por pantalla con la primera letra en mayúsculas y las demás en minúsculas.
	 * 
	 * @author Robert G
	 */
	public static void main(String[] args) {

		String cad1 = "hOla ComO EstaS";
		System.out.println(cad1.substring(0, 1).toUpperCase() + cad1.substring(1).toLowerCase());

	}
}