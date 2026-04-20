package abstracta;

public abstract class Figura {
	
	protected String color;
	
	Figura(String color){
		this.color =  color;
	}
	
	public abstract int calcularArea();
	public abstract int calcularPerimetro();
	
	public String toString() {
		// TODO auto-generated 
		return "Color" +this.color;
	}
	


}
