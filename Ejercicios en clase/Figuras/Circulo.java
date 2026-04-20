package abstracta;

public class Circulo extends Figura{
	private int radio;

	Circulo(String color) {
		super(color);
		this.radio = radio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int calcularArea() {
		// TODO Auto-generated method stub
		return (int) (Math.PI* Math.pow(radio, 2));
	}

	@Override
	public int calcularPerimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

}
