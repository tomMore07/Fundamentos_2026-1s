package productos;

public class ProductoNoPerecedero extends Producto {
	
	private char tipo;

	ProductoNoPerecedero(int codigo, String descripcion, double precio, char tipo) {
		super(codigo, descripcion, precio);
		this.tipo = tipo;
		// TODO Auto-generated constructor stub
	}
	
	

	public char getTipo() {
		return tipo;
	}



	public void setTipo(char tipo) {
		this.tipo = tipo;
	}



	@Override
	public double precioVenta() {
		// TODO Auto-generated method stub
		double precioFinal = this.precio;
		if(tipo == 'A') {
			
			precioFinal = precioFinal * 0.03;
			
		} else if(tipo == 'B') {
			
			precioFinal = precioFinal * 0.02;
			
		} else if(tipo == 'C') {
			
			precioFinal = precioFinal * 0.015;
			
		} else {
			
			System.out.println("No esta permitido yucaaaaa");
			
		}
		return (double)precioFinal;
	}
	
	public void asignacionTipoProducto() {
		if(tipo != 'A' || tipo != 'B' || tipo != 'C' ) {
			tipo = 'B';
		}
	}

	@Override
	public String toString() {
		return "No Perecedero: " + super.toString() + " Tipo: " + this.tipo;
	}
	
	

}

