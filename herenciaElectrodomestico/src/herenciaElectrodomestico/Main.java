package herenciaElectrodomestico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// si precio -> 0 = 100
		// A = 100
		// F = 10
		// peso 0 = 10

		Electrodomestico electrodo = new Electrodomestico(0, "verde", 'A', 100);

		System.out.println("ELECTRODOMESTICO: " + electrodo.toString());

		System.out.println();


		//

		Lavadora lava = new Lavadora(0, "blanco", 'F', 31);

		System.out.println("LAVADORA: " + lava.toString());

		System.out.println();




		Television tele = new Television(0, "verde", 'A', 100);

		
		System.out.println("TELEVISION: " + tele.toString());

		System.out.println();
	}

}
