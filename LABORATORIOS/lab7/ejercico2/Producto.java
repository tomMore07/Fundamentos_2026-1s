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

	public abstract double precioVenta();

	@Override
	public String toString() {
		return "Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Precio: " + this.precio;
	}
	

	
	
}
