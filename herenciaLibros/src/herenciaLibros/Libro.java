package herenciaLibros;

public class Libro {

	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	
	
	
	public Libro(int iSBN, String titulo, String autor, int numeroPaginas) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}
	@Override
	public String toString() {
		return "El libro " + titulo + " con ISBN " + ISBN + " creado por el autor " + autor + " tiene " + numeroPaginas + " páginas.";
	}
	public int getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	
	
	
	
}
