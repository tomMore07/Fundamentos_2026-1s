package banco;

public class Persona {
	//Atributo de instancia
	private String nombre;

	/**
	 * @param nombre atributo local
	 */
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return " Nombre " + this.nombre;
	}
}
