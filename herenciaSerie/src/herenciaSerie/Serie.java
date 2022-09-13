package herenciaSerie;

public class Serie implements Entregable{

	private String titulo = "";
	private int numeroTemporadas = 3;
	private boolean entregado = false;
	private String genero = "";
	private String creador = "";

	public Serie() {
		super();
	}

	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;

		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}


	public void entregar() {
		// TODO Auto-generated method stub

		entregado = true;
	}

	public void devolver() {
		// TODO Auto-generated method stub
		entregado = false;

	}

	public boolean isEntregado() {
		if(entregado){
			return true;
		}
		return false;
	}


	public String compareTo(Object a) {

		String mayor = "La serie " + titulo + " tiene mas temporadas!";

		String menor = "La serie " + ((Serie) a).getTitulo() + " tiene mas temporadas!";

		if (numeroTemporadas > ((Serie) a).getNumeroTemporadas()) {

			return menor;
		}
		else {

			return mayor;
		}
	}
}


