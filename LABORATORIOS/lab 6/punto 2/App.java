package ejercicio2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro =new Carro("placa","marca", 280, 2);
		System.out.println(carro);
		System.out.println("peaje: $"+ carro.calcularPeaje());
		
		Moto moto = new Moto("placa","marca", 190,"tipo");
		System.out.println(moto);
		System.out.println("peaje:$"+moto.calcularPeaje());
		
		Camion camion =new Camion("AGY878","marca", 100, 89, 9, TipoCamion.F350);
		System.out.println(camion);
		System.out.println("peaje: $"+ camion.calcularPeaje());
	}

}

