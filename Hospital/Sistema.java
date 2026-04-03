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
	
	public int pacientesTipoCancer(List<Paciente> list, Enum<?> TipoCancer) {
		int cantidad = 0;
		for (Paciente paciente : listaPacientes) {
			if(paciente.getTipocancer() == TipoCancer) {
				cantidad++;
			}
		}
		return cantidad;
	}
	public String porcentajePorEstado(List<Paciente> list) {
		if(list == null || list.isEmpty()) {
			return "No hay pacientes registradps para calcular porcentajes.";
		}
		
		int total = list.size();
		
		int estables = 0;
		int criticos = 0;
		int enTratamiento = 0;
		
		for (Paciente paciente : list) {
			String estado = paciente.getEstadoActual();
			
		if(estado != null) {
			if(estado == "Estable") {
				estables++;
			} else if (estado == "Critico") {
				criticos ++;
			} else if (estado == "En tratamiento") {
				enTratamiento++;
			}
			
			}
		}
		double porcEstable = (estables * 100.0) / total;
	    double porcCritico = (criticos * 100.0) / total;
	    double porcTratamiento = (enTratamiento * 100.0) / total;


	    return "--- Reporte de Estados ---\n" +
	           "Estables: " + porcEstable + "%\n" +
	           "Críticos: " + porcCritico + "%\n" +
	           "En Tratamiento: " + porcTratamiento + "%\n" +
	           "Total de pacientes: " + total;
	}
}
