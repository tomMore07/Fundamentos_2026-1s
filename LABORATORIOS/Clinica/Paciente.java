package clinica;

import java.util.Date;

public class Paciente {
	
	private int identificacion;
	private String nombre;
	private Date fechaNacimiento;
	private String direccion;
	private int telefono;
	
	
	public Paciente(int identificacion, String nombre) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
	}


	public int getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre del paciente:" + this.nombre + " Identificación: "+ this.identificacion;
	}

}
