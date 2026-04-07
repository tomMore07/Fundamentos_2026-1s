package automotriz;

import java.util.ArrayList;
import java.util.List;

public class Auto {
	
	private String marca;
	private int modelo;
	private Motor motor;
	private List<Llanta> llantas;
	
	
	
	
	public Auto(String marca, int modelo, Cliente cliente, String tipoMotor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		//Agregacion
		this.cliente = cliente;	
		//Composicion
		this.motor = new Motor(tipoMotor);
		//Composicion
		this.llantas = new ArrayList<Llanta>();
	}
	
	public void agregarLlanta(Llanta llanta) {
		this.llantas.add(llanta);
	}
	

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Llanta> getLlantas() {
		return llantas;
	}

	public void setLlantas(List<Llanta> llantas) {
		this.llantas = llantas;
	}

	@Override
	public String toString() {
		return "Propietario del Vehiculo: " + cliente + "| Marca del auto: " + marca + "| Modelo: " + modelo 
				+ "| Motor: " + motor + "| Referencia de Llantas: " + llantas;
	}
	
	
	
}

