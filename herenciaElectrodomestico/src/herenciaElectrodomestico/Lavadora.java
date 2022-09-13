package herenciaElectrodomestico;

public class Lavadora extends Electrodomestico{

	private int carga = 5;

	
	public Lavadora(int carga) {
		super();
		this.carga = carga;
		
		
	}

	public int getCarga() {
		return carga;
	}


	public Lavadora(double precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
	}

	

	public Lavadora() {
		super();
	}


	
	@Override
	public double precioFinal(double precioBase, char consumoEnergetico, int peso) {
		// TODO Auto-generated method stub
		
		if (peso > 30) {
			precioBase = precioBase + 50;
		}
		
		//return precioBase;
		super.precioFinal(precioBase, consumoEnergetico, peso);
		//return super.precioFinal(precioBase, consumoEnergetico, peso);
		return precioBase;
	}
	
	
}
