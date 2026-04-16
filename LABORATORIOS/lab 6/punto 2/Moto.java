package ejercicio2;

public class Moto extends Vehiculo {

	private String tipo;
	
	public Moto(String placa, String marca, int velMax, String tipo) {
		super(placa, marca, velMax);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	public void mover(){
		
	}
	
	
	public int calcularPeaje() {
		int peaje = 0;
		return peaje;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Moto: "+ super.toString()+ " Tipo: "+ this.tipo;
	}

}
