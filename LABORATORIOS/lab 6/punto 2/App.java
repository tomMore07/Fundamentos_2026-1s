package ejercicio2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro =new Carro("YN09V","Porsche", 280, 2);
		System.out.println(carro);
		System.out.println("peaje:$"+ carro.calcularPeaje());
		carro.mover();
		
		Moto moto = new Moto("89BKU9","Royal Enfield", 190,"deportiva");
		System.out.println(moto);
		System.out.println("peaje:$"+moto.calcularPeaje());
		moto.mover();
		
		Camion camion =new Camion("AGY878","marca", 100, 89, 9, TipoCamion.F350);
		System.out.println(camion);
		System.out.println("peaje:$"+ camion.calcularPeaje());
		camion.mover();
	}

}

