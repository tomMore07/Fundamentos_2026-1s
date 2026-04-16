package ejercicio2;

public class Moto extends Vehiculo {

	private String tipo;
	
	public Moto(String placa, String marca, int velMax, String tipo) {
		super(placa, marca, velMax);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	public void mover(){
		System.out.println("Se mueve mediante un motor de combustión interna que quema combustible, moviendo pistones y girando un cigüeñal. Esta rotación se transfiere a la rueda trasera a través del embrague y una caja de cambios, multiplicando la fuerza para mover el vehículo.");
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
