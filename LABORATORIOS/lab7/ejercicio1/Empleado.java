package ejercicio1;

public abstract class Empleado {
	protected String nombre;
	protected int id;
	protected int edad;
	protected int añosEnEmpresa;
	protected long salarioBasico;
	
	
	
	public Empleado(String nombre, int id, int edad, long salarioBasico, int añosEnEmpresa) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.añosEnEmpresa = añosEnEmpresa;
		this.salarioBasico = salarioBasico;
	}
	
	public abstract long pagoMensual();
	public abstract String toString();
	
	

}
