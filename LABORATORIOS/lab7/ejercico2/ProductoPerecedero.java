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
	public int precioVenta() {
		// TODO Auto-generated method stub
		if(diasCaducar == 1) {
			precio = 0;
			precio = precio/4;
		}
		
		if (diasCaducar == 2) {
			precio = 0;
			precio = precio/3;
		}
		
		if (diasCaducar == 3) {
			precio = 0;
			precio = precio/2;
		}
		else {
			System.out.println("Nokas, no esta permitido");
		}
		return (int) precio;
	}

	@Override
	public String toString() {
		return "Perecederos "+ super.toString() + " Dias a caducar: " + this.diasCaducar + "Precio de venta" + precio;
	}
	
	

}
