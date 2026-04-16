package ejercicio2;

public class Camion extends Vehiculo{
	private int capacidadCarga;
	private int ejes;
	private TipoCamion tipoCamion;

	public Camion(String placa, String marca, int velMax, int capacidadCarga, int ejes, TipoCamion tipoCamion) {
		super(placa, marca, velMax);
		this.capacidadCarga = capacidadCarga;
		this.ejes = ejes;
		this.tipoCamion = tipoCamion;
		
		// TODO Auto-generated constructor stub
	}
	public void mover(){
		
	}
	public int calcularPeaje() {
		if (ejes == 2 && tipoCamion == (TipoCamion.F350)) {
			int peaje = 25000;
			return peaje;
		} 
		if(ejes == 2 && tipoCamion == (TipoCamion.F600)) {
			int peaje = 35000;
			return peaje;
		}
		if(ejes == 3 || ejes == 4) {
			int peaje = 60000;
			return peaje;
		}
		if(ejes >= 6) {
			int peaje = 110000;
			return peaje;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Camion: "+ super.toString()+ " Capacidad de Carga: "+ this.capacidadCarga + " Ejes: " + this.ejes;
	}

}
