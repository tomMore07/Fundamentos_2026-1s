package biblioteca;

public class Estudiante {
	private String nombre;
	private int id;

	/**
	 * Constructor de la clase
	 * @param nombre
	 */
	public Estudiante(String nombre) {
		super();
		this.nombre = nombre;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Nombre " + nombre;
	}
	
	
	
	
	
}