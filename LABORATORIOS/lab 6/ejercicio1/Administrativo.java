package ejercicio1;

public class Administrativo extends Persona{
	private String cargo;
	private String dependencia;
	private int salario;

	public Administrativo(int id, String nombre, int edad, String cargo, String dependencia, int salario) {
		super(id,nombre,edad);
		this.cargo = cargo;
		this.dependencia = dependencia;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Administrativo: "+ super.toString()+ " Cargo: "+ this.cargo+ " Dependencia: "+this.dependencia+ " Salario: "+this.salario;
	}
	
	public int calcularSalario() {
		int valorApagar = salario -(salario*12/100);
		return valorApagar;
	}
}
