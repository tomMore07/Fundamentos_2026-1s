package automotriz;

public class Cliente {
	
	//Atributo del cliente
	
	private String nombre;

	//constructor
	public Cliente(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	//Metodo
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cliente: " + this.nombre;
	}
 
}
