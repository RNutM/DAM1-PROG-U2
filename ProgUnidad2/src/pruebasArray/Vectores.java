package pruebasArray;

public class Vectores {
	/**
	 * Programa donde rellenamos dos arrays, uno de pares y otro de impares y después
	 * halla la media de cada array.
	 * 
	 * @author Robert G
	 */

	static void mostrarVector(int datos[]) {
		System.out.print("[ ");
		for (int i = 0; i < datos.length; i++)
			System.out.print(datos[i] + " ");
		System.out.println("]");
	}

	static float media(int datos[]) {
		int suma = 0;
		float media = 0;
		for (int i = 0; i < datos.length; i++)
			suma = suma + datos[i];
		media = suma / datos.length;

		return media;
	}

	public static void main(String[] args) {

		int pares[] = { 2, 4, 6, 8, 10 };
		int impares[] = { 1, 3, 5, 7, 9 };

		mostrarVector(pares);
		System.out.println("La media es " + media(pares));

		mostrarVector(impares);
		System.out.println("La media es " + media(impares));
	}
}
