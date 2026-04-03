package hospital;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Paciente> listaPacientes;
	
	public Sistema() {
		super();
		this.listaPacientes = new ArrayList<>();
	}

	public void registrarPacientes(Paciente paciente) {
		
			this.listaPacientes.add(paciente);
		}

	public Paciente buscarPaciente(String nombre) {
		for(Paciente paciente: listaPacientes) {
			if(paciente.getNombre() == nombre)
				return paciente;	
		}
		return null;
	}
	
	public void agregarExamenes(Paciente paciente, Paciente examen) {
		
		this.listaPacientes.add(examen);
	}
	
	public void agregarTratamientos(Paciente paciente, Tratamiento tratamientio) {
		this.listaPacientes.add(paciente);
	}
}
