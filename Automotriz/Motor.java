package automotriz;

public class Motor {
	
	private String tipo;
	
	//constructor
	public Motor(String tipo) {
		super();
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return " Tipo " + this.tipo;
	}
}
