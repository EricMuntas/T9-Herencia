package herenciaLibros;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro1 = new Libro(34343, "Por quién doblan las campanas", "Ernest Hemingway", 629);
		
		Libro libro2 = new Libro(89798, "Don Quijote de la Mancha", "Miguel de Cervantes", 232);
		
		if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println("El libro con más paginas es:");
			System.out.println(libro1.toString());
		}
		else {
			System.out.println("El libro con más paginas es:");
			System.out.println(libro2.toString());
		}
		
		
	}

}
