package automotriz;

public class Llanta {

	private String marca;
	
	//constructor
	public Llanta(String marca) {
		super();
		this.marca = marca;
		// TODO Auto-generated constructor stub
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return " Marca " + this.marca;
	}
}
