package herenciaSerie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Serie listaSeries[] = new Serie[5];

		listaSeries[0] = new Serie("Breaking Bad", 5, "Drama criminal", "Vince Gilligan" );

		listaSeries[1] = new Serie("Better Call Saul", 6, "Drama criminal", "Vince Gilligan");

		listaSeries[2] = new Serie("The Simpsons", 33, "Humor", "Matt Groening");

		listaSeries[3] = new Serie();

		listaSeries[4] = new Serie();

		Videojuego listaVideojuegos[] = new Videojuego[5];

		listaVideojuegos[0] = new Videojuego("Minecraft", 10, "Survival", "Mojang");

		listaVideojuegos[1] = new Videojuego("Terraria", 10, "Survival", "Re-Logic");

		listaVideojuegos[2] = new Videojuego("League Of Legends", 0, "MOBA", "Riot Games");

		listaVideojuegos[3] = new Videojuego("Valorant", 0, "FPS", "Riot Games");

		listaVideojuegos[4] = new Videojuego("Portal 2", 10, "Puzzles", "Valve");

		listaSeries[0].entregar();
		listaVideojuegos[0].entregar();

		int entregados = 0;

		for(int i=0; i<listaSeries.length; i++){

			if(listaSeries[i].isEntregado()){

				entregados+=1;

				listaSeries[i].devolver();

			}

			if (listaVideojuegos[i].isEntregado()){

				entregados+=1;

				listaVideojuegos[i].devolver();
			}
		}

		System.out.println("Se han entregado " + entregados);




	}


}
