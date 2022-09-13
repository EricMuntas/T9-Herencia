package herenciaElectrodomestico;

public class Television extends Electrodomestico {

	private double resolucion = 20;
	private boolean sintonizadorTDT = false;
	
	

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(double precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
	}

	public Television(double precioBase, String color, char consumoEnergetico, int peso) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	public double precioFinal(double resolucion, boolean sintonizadorTDT) {
		double precioAniadido = super.precioFinal(resolucion, getConsumoEnergetico(), getConsumoEnergetico());
		
		if (resolucion>40) {
			precioAniadido+=getPrecioBase()*0.3;
			
		}
		if(sintonizadorTDT) {
			precioAniadido+=50;
		}
		return precioAniadido;
	}
	

	
	
	
	
	
	
	
	
	
}
