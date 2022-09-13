package herenciaElectrodomestico;

public class Electrodomestico {

	// Se podrán heredar.
	private double precioBase = 100;
	private String color = "blanco";
	private char consumoEnergetico = 'F';
	private int peso = 5;
	
	// Por defecto
	public Electrodomestico() {

	}

	// Peso y precio
	public Electrodomestico(double precioBase, int peso) {

		this.precioBase = precioBase;
		this.peso = peso;
	}

	// Todo
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, int peso) {
		super();
		//this.precioBase = precioBase;
		//this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		comprobarColor(color);
		comprobarConsumoEnergetico(consumoEnergetico);
		precioFinal(precioBase, consumoEnergetico, peso);
		
		
		
		/*
		// Solo estos colores
		if ((color.equalsIgnoreCase("blanco") 
				||color.equalsIgnoreCase("negro") 
				||color.equalsIgnoreCase("rojo") 
				||color.equalsIgnoreCase("azul") 
				||color.equalsIgnoreCase("gris"))) {

			this.color = color;


		}

		 */



	}
	/**
	 * toString
	 * 
	 */
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}





	public char comprobarConsumoEnergetico(char consumoEnergetico) {
		// Solo estas letras
		if (consumoEnergetico == 'A' || consumoEnergetico == 'a'
				|| consumoEnergetico == 'B' || consumoEnergetico == 'b'
				|| consumoEnergetico == 'C' || consumoEnergetico == 'c'
				|| consumoEnergetico == 'D' || consumoEnergetico == 'd'
				|| consumoEnergetico == 'E' || consumoEnergetico == 'e'
				|| consumoEnergetico == 'F' || consumoEnergetico == 'f') { 


			this.consumoEnergetico = consumoEnergetico;

		}
		return this.consumoEnergetico;
	}


	public double precioFinal(double precioBase, char consumoEnergetico, int peso) {

		if (consumoEnergetico == 'A' || consumoEnergetico == 'a'){

			precioBase = precioBase + 100;

		}

		else if (consumoEnergetico == 'B' || consumoEnergetico == 'b'){

			precioBase = precioBase + 80;

		}

		else if (consumoEnergetico == 'C' || consumoEnergetico == 'c'){

			precioBase = precioBase + 60;

		}

		else if (consumoEnergetico == 'D' || consumoEnergetico == 'd'){

			precioBase = precioBase + 50;

		}

		else if (consumoEnergetico == 'E' || consumoEnergetico == 'e'){

			precioBase = precioBase + 30;

		}

		else if (consumoEnergetico == 'F' || consumoEnergetico == 'f'){

			precioBase = precioBase + 10;


		}
		
		if (peso > 0 && peso < 19) {

			precioBase = precioBase + 10;

		}

		else if (peso > 20 && peso < 49) {

			precioBase = precioBase + 50;

		}

		else if (peso > 50 && peso < 79) {

			precioBase = precioBase + 80;

		}
		
		else if (peso > 80) {

			precioBase = precioBase + 100;
			
		}
		
		this.precioBase = this.precioBase + precioBase;
		return precioBase;
	}



	/**
	 *  Comprobar color
	 * @param color
	 * @return
	 */
	public String comprobarColor(String color) {

		// Solo estos colores
		if ((color.equalsIgnoreCase("blanco") 
				||color.equalsIgnoreCase("negro") 
				||color.equalsIgnoreCase("rojo") 
				||color.equalsIgnoreCase("azul") 
				||color.equalsIgnoreCase("gris"))) {

			this.color = color;



		}
		return this.color;
	}



	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}


}
