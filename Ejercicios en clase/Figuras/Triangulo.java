package abstracta;

public class Triangulo extends Figura {
	private int base;
	private int altura;
	
	public Triangulo(String color, int base, int altura) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularArea() {
		// TODO Auto-generated method stub
		return (this.base * this.altura/2);
	}

	@Override
	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return ();
	}
	
	

}
