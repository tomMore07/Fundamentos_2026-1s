package productos;

public class ProductoPerecedero extends Producto {
	private int diasCaducar;

	ProductoPerecedero(int codigo, String descripcion, double precio, int diasCaducar) {
		super(codigo, descripcion, precio);
		this.diasCaducar = diasCaducar;
		// TODO Auto-generated constructor stub
	}
	
	

	public int getDiasCaducar() {
		return diasCaducar;
	}



	public void setDiasCaducar(int diasCaducar) {
		this.diasCaducar = diasCaducar;
	}



	@Override
	public double precioVenta() {
		// TODO Auto-generated method stub
		double precioFinal = this.precio;
		if(diasCaducar == 1) {
			
			precioFinal = precioFinal/4;
			
		} else if (diasCaducar == 2) {
			
			precioFinal = precioFinal/3;
			
		} else if (diasCaducar == 3) {
			
			precioFinal = precioFinal/2;
			
		} else {
			
			System.out.println("Aun falta pa que caduque NORMAL");
		}
		return (double) precioFinal;
	}

	@Override
	public String toString() {
		return "Perecederos "+ super.toString() + " Dias a caducar: " + this.diasCaducar;
	}
	
	

}
