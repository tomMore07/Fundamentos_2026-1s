package ejercicio2;

public class Carro extends Vehiculo {
	private int numeroPuertas;

	public Carro(String placa, String marca, int velMax, int numeroPuertas) {
		super(placa, marca, velMax);
		this.numeroPuertas = numeroPuertas;
	}

	public void mover() {
		System.out.println("Transforma la energía del combustible en movimiento mecánico. El motor genera fuerza, que se transmite a través de la caja de cambios y el diferencial para hacer girar las ruedas, creando el movimiento.");
	}
	
	public int calcularPeaje() {
		int peaje = 23800;
		return peaje;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Carro: "+ super.toString()+ " Numero de puertas: "+ this.numeroPuertas;
	}
	
}

