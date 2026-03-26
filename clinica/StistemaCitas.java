package clinica;

	import java.util.List;
	import java.util.ArrayList;

public class SistenmaCitas {
	
		private List<Paciente> listaPaciente;
		private List<Medico> listaMedico;
		private List<Cita> listaCita;	
		
		public SistemaCitas(List<Paciente> listaPaciente, List<Medico> listaMedico, List<Cita> listaCita) {
			super();
			this.listaPaciente = new ArrayList<>();
			this.listaMedico = new ArrayList<>();
			this.listaCita = new ArrayList<>();
		}
	

		public void agregarCita(Cita cita) {
			this.listaCita.add(cita);
			
		}
		public void agregarMedico(Medico medico) {
			this.listaMedico.add(medico);
			
		}
		public void agregarPaciente(Paciente paciente) {
			this.listaPaciente.add(paciente);
			
		}
		
		
		public List<Cita> buscarPorPaciente (String nombreBuscado) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCitas) {
			    	if(cita.getPaciente().getNombre() == nombreBuscado) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
			
			public List<Cita> buscarPorMedico (String nombreBuscado) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCitas) {
			    	if(cita.getMedico().getNombre() == nombreBuscado) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
			
			public List<Cita> buscarPorEcha (LocalDateTime fechaBuscada) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCitas) {
			    	if(cita.getFechaYhora() == fechaBuscada) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
		
}

