package pruebasString;

import java.util.Scanner;

public class Adivina2 {
	/**
	 * Programa para adivinar la palabra secreta del constructor y después
	 * dispone de 5 intentos, obteniendo como pista solo las consonantes.
	 * 
	 * @author Robert G
	 */
	String secreta;
	String aux = "";

	Adivina2() {
		secreta = "Robert";
	}

	Adivina2(String cadena) {
		secreta = cadena;
	}

	public String imprimirsinvocales() {

		for (int i = 0; i < secreta.length(); i++) {
			if (secreta.charAt(i) == 'a' || secreta.charAt(i) == 'u' || secreta.charAt(i) == 'e'
					|| secreta.charAt(i) == 'i' || secreta.charAt(i) == 'o')
				aux = aux + "_";
			else
				aux = aux + secreta.charAt(i);
		}
		return aux;
	}

	public String getAux() {
		return aux;
	}

	public void setAux(String aux) {
		this.aux = aux;
	}

	public boolean vocalencontrada(String v) {
		return secreta.contains(v);
	}

	public String getSecreta() {
		return secreta;
	}

	public void setSecreta(String secreta) {
		this.secreta = secreta;
	}

	public String imprimir(String vocal) {
		char vprint = vocal.charAt(0);
		// System.out.println("Vocal en el metodo "+vocal);
		for (int i = 0; i < secreta.length(); i++) {
			if (secreta.charAt(i) == vprint) {
				// System.out.println("Vocal en la posicion "+i);
				aux = aux.substring(0, i) + vocal + aux.substring(i + 1);
			}
			// else
			// aux=aux+secreta.charAt(i);
		}
		System.out.println("Muy bien:  " + aux);
		return aux;
	}

	public static void main(String[] args) {
		Adivina2 a = new Adivina2();
		Scanner sc = new Scanner(System.in);
		int intentos = 5;
		String vocal, cad;
		cad = a.imprimirsinvocales();
		a.setAux(cad);

		System.out.println("LA PALABRA QUE TIENES QUE ADIVINAR ES: " + a.getAux());
		do {
			System.out.println("Dame una vocal");
			vocal = sc.next();
			if (a.vocalencontrada(vocal)) {
				// System.out.println(vocal+" está en la palabra");
				a.setAux(a.imprimir(vocal));
			}
			intentos--;
			if (a.getAux().equals(a.getSecreta()))
				break;
		} while (intentos > 0);

		if (intentos == 0)
			if (a.getAux().equals(a.getSecreta()))
				System.out.println("Has ganado!!");
			else
				System.out.println("Has perdido!!");
		else
			System.out.println("Has ganado!!!");
		sc.close();
	}
}