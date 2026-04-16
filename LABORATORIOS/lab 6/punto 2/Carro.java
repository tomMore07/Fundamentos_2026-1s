package ejercicio2;

public class Carro extends Vehiculo {
	private int numeroPuertas;

	public Carro(String placa, String marca, int velMax, int numeroPuertas) {
		super(placa, marca, velMax);
		this.numeroPuertas = numeroPuertas;
	}

	public void mover() {
		
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

