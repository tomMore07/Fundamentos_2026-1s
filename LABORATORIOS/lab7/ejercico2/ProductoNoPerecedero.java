package productos;

public class ProductoNoPerecedero extends Producto {
	
	private char tipo;

	ProductoNoPerecedero(int codigo, String descripcion, double precio, char tipo) {
        super(codigo, descripcion, precio);
        // Validamos el tipo antes de asignarlo
        this.tipo = validarTipo(tipo); 
    }

    // Método de validación interna
    private char validarTipo(char tipoIngresado) {
        if (tipoIngresado == 'A' || tipoIngresado == 'B' || tipoIngresado == 'C') {
            return tipoIngresado;
        } else {
            return 'B'; // Asignación automática por defecto
        }
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = validarTipo(tipo); // También validamos aquí por seguridad
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
			
			System.out.println("Tipo no permitido");
			
		}
		return (double)precioFinal;
	}
	

	@Override
	public String toString() {
		return "No Perecedero: " + super.toString() + " Tipo: " + this.tipo;
	}
	
	

}
