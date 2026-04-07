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
	
	public void agregarExamenes(Paciente paciente, Examen examen) {
		
		this.listaPacientes.add(paciente);
	}
	
	public void agregarTratamientos(Paciente paciente, Tratamiento tratamientio) {
		this.listaPacientes.add(paciente);
	}
	
	public void pacientesTipoCancer() {
	    int sarcoma = 0;
	    int lecuemia = 0;
	    int linfoma = 0;

	    for (Paciente p : listaPacientes) {
	        // Usamos el getter que creaste
	        TipoCancer tipo = p.getTipocancer();
	        
	        if (tipo == TipoCancer.Sarcoma) {
	            sarcoma++;
	        } else if (tipo == TipoCancer.Leucemia) {
	            lecuemia++;
	        } else if (tipo == TipoCancer.Linfoma) {
	            linfoma++;
	        }
	    }

	    System.out.println("--- Pacientes por Tipo de Cáncer ---");
	    System.out.println("Sarcoma: " + sarcoma);
	    System.out.println("Leucemia: " + lecuemia);
	    System.out.println("Linfoma: " + linfoma);
	}
	
	
	public String PorcentajePorEstado() {
	    if (listaPacientes.isEmpty()) return "No hay pacientes registrados.";

	    double total = listaPacientes.size();
	    int tratamiento = 0;
	    int remision = 0;
	    int fallecido = 0;

	    for (Paciente p : listaPacientes) {
	        String estado = p.getEstadoActual().toLowerCase(); // Para evitar errores de mayúsculas
	        if (estado.contains("tratamiento")) {
	            tratamiento++;
	        } else if (estado.contains("remisión") || estado.contains("remision")) {
	            remision++;
	        } else if (estado.contains("fallecido")) {
	            fallecido++;
	        }
	    }

	    // Calculamos los porcentajes
	    double porcTratamiento = (tratamiento / total) * 100;
	    double porcRemision = (remision / total) * 100;
	    double porcFallecido = (fallecido / total) * 100;

	    return "--- Porcentajes por Estado ---\n" +
	           "En tratamiento: " + porcTratamiento + "%\n" +
	           "En remisión: " + porcRemision + "%\n" +
	           "Fallecido: " + porcFallecido + "%";
	}
}