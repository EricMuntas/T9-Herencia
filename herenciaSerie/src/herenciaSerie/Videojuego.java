package herenciaSerie;

public class Videojuego implements Entregable {

	private String titulo ="";
	private int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero = "";
	private String compania = "";



	public Videojuego() {
		super();
	}



	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}



	public String getTitulo() {
		return titulo;
	}



	public int getHorasEstimadas() {
		return horasEstimadas;
	}



	public String getGenero() {
		return genero;
	}



	public String getCompania() {
		return compania;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public void setCompania(String compania) {
		this.compania = compania;
	}



	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}



	public Videojuego(String titulo, int horasEstimadas) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
	}



	/////////////////////////////////////////////

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

		String mayor = "El videojuego " + titulo + " tiene mas horas!";

		String menor = "El videojuego " + ((Videojuego) a).getTitulo() + " tiene mas horas!";

		if (horasEstimadas > ((Videojuego) a).getHorasEstimadas()) {

			return menor;
		}
		else {

			return mayor;
		}
	}
}






