package automotriz;

//no se como descargar esta libreria y no me sirvio jeje
//import java.util.ArayList;


import java.util.List;

public class Auto {
	private String marca;
	private int modelo;
	private Motor motor;
	private Cliente cliente;
	private List<Llanta> listaLlantas;
	
	
	public Auto(String marca, int modelo, Cliente cliente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cliente = cliente;
	}
	
	public void agregarLlanta(Llanta llanta) {
		this.listaLlantas.add(llanta);
	}

	@Override
	public String toString() {
		return "Propietario del Vehiculo " + this.cliente + " Marca del auto: " + this.marca + "  Modelo: " + this.modelo 
				+ "  Motor: " + this.motor + " Referencia de Llantas: " + this.listaLlantas;
	}
	
}
