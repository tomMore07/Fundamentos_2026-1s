package abstracta;

public class Cuadrado extends Figura {
	private int lado1;
	private int lado2;
	
	public Cuadrado(String color, int lado1, int lado2) {
		super(color);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public int calcularArea() {
		// TODO Auto-generated method stub
		return (this.lado1 * this.lado2);
	}

	@Override
	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return (this.lado1*2 + this.lado2 *2);
	}
	
	
	
}
