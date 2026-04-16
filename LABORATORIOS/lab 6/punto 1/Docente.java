package ejercicio1;

public class Docente extends Persona {
	private String especialidad;
	private int horasDeCatedra;
	private int valorHora;
	private int salario;
	
	public Docente(int id, String nombre, int edad, String especialidad, int horasDeCatedra, int valorHora) {
		super(id,nombre,edad);
		this.especialidad = especialidad;
		this.horasDeCatedra = horasDeCatedra;
		this.valorHora = valorHora;
		
	}
	
	public int calcularSalario() {
		int suma = horasDeCatedra*valorHora;
		int salario= suma-(suma*12/100);
		return salario;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Docente: " + super.toString()+ " Especialidad: "+ this.especialidad+ "Salario: "+ salario;
	}

	
}
