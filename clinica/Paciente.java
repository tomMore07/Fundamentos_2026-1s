package clinica;

import java.util.Date;

public class Paciente {
	
	private int identificacion;
	private String nombre;
	private Date fechaNacimiento;
	private String direccion;
	private int telefono;
	
	
	public Paciente(int identificacion, String nombre, Date fechaNacimiento, String direccion, int telefono) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.telefono = telefono;
	}
}
