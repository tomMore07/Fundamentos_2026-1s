package hospital;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private List<Paciente> listaPacientes;
	
	public Sistema() {
		super();
		this.listaPacientes = new ArrayList<>();
	}
	
	public void agregarTratamientos(Paciente paciente, Tratamiento tratamientio) {
		this.listaPacientes.add(paciente);
	}
}
