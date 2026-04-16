package ejercicio2;

public class Vehiculo {
	protected String placa;
	protected String marca;
	protected int velMax;
	
	
	public Vehiculo(String placa, String marca, int velMax) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.velMax = velMax;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Placa: "+ this.placa+ " Marca: "+this.marca+" Velocidad máxima: "+ this.velMax;
		
	}
	
	public void mover() {
		
	}
	
	public int calcularPeaje() {
		return 0;
	}

}
