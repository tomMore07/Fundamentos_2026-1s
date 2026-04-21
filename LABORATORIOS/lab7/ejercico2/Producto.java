package productos;

public abstract class Producto {
	
	protected int codigo;
	protected String descripcion;
	protected double precio;
	
	Producto(int codigo, String descripcion, double precio) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public abstract double precioVenta();

	@Override
	public String toString() {
		return "Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Precio: " + this.precio;
	}
	

	
	
}

