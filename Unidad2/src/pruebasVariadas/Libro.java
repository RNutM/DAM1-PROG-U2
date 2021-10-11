package pruebasVariadas;

public class Libro {

	private String Titulo;
	private String ISBN;
	private String Autor;
	private int npaginas;

	/**
	 * Programa Libro con ISBN, Titulo, Autor y Número de páginas, creamos dos objetos
	 * con distintos valores, y los mostramos indicando cual de ellos tiene mayor número
	 * de páginas.
	 * 
	 * @author Robert G
	 */
	// Constructor con parámetros
	Libro(String ti, String is, String au, int np) {
		Titulo = ti;
		ISBN = is;
		Autor = au;
		npaginas = np;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getNpaginas() {
		return npaginas;
	}

	public void setNpaginas(int npaginas) {
		this.npaginas = npaginas;
	}

	@Override
	public String toString() {
		return "El libro " + Titulo + " con ISBN=" + ISBN + " creado por " + Autor + " tiene " + npaginas + " paginas";
	}

	public static void main(String[] args) {

		Libro l1 = new Libro("Titulo1", "978-2-12-345680-3", "Autor1", 315);
		Libro l2 = new Libro("Titulo2", "975-3-12-345687-4", "Autor2", 380);
		System.out.println(l1.toString());
		System.out.println("_______________________________________________________________________________");
		System.out.println(l2.toString());
		System.out.println("_______________________________________________________________________________");
		if (l1.npaginas > l2.npaginas) {
			System.out.println("El libro " + l1.Titulo + " tiene más páginas que el libro " + l2.Titulo);
		} else {
			System.out.println("El libro " + l2.Titulo + " tiene más páginas que el libro " + l1.Titulo);
		}
	}
}
