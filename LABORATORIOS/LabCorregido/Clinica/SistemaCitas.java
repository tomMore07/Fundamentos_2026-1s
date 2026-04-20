package clinica;

	import java.util.List;
	import java.time.LocalDateTime;
	import java.util.ArrayList;

public class SistemaCitas {
	
		private List<Paciente> listaPaciente;
		private List<Medico> listaMedico;
		private List<Cita> listaCita;	
		
		public SistemaCitas(List<Paciente> listaPaciente, List<Medico> listaMedicos, List<Cita> listaCita) {
			super();
			this.listaPaciente = new ArrayList<>();
			this.listaMedico = new ArrayList<>();
			this.listaCita = new ArrayList<>();
		}
	

		public void agregarMedico(Medico medico) {
			this.listaMedico.add(medico);
			
		}
		public void agregarPaciente(Paciente paciente) {
			this.listaPaciente.add(paciente);
			
		}

		public void registrarCita(Cita cita) {
	        if (cita != null) {
	            this.listaCita.add(cita);
	            System.out.println("Cita registrada correctamente.");
	        }
	    }
		public void cancelarCita(Cita cita) {
		        if (cita != null) {
		            cita.setEstado(false);
		            System.out.println("Cita cancelada con éxito.");
		        }	        
		    }
		
		
		public List<Cita> buscarPorPaciente (String nombreBuscado) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCita) {
			    	if(cita.getPaciente().getNombre() == nombreBuscado) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
			
		public List<Cita> buscarPorMedico (String nombreBuscado) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCita) {
			    	if(cita.getMedico().getNombre() == nombreBuscado) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
			
		public List<Cita> buscarPorFecha (LocalDateTime fechaBuscada) {
			    List<Cita> resultado = new ArrayList<>();
			    
			    for(Cita cita : listaCita) {
			    	if(cita.getFechaYhora() == fechaBuscada) {
			    		resultado.add(cita);
			    	
			    	}
				
			    } return resultado;
			
			}
		
		public void solicitarCitaPorMedico(Medico medico, Paciente paciente, LocalDateTime fecha) {
	        Cita cita = new Cita(fecha, paciente, medico);
	        registrarCita(cita);
	    }
		
		public List<Cita> medicoBuscaCita (String nombreBuscado, LocalDateTime fechaBuscada) {
				List<Cita> resultado = new ArrayList<>();
				
				for (Cita cita : listaCita) {
					if(cita.getMedico().getNombre() == nombreBuscado) {
					}else if(cita.getFechaYhora()== fechaBuscada) {
						resultado.add(cita);
					
					}
				}
			return resultado;
			
		}
		
}
