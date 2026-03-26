package clinica;

import java.time.LocalDateTime;

public class Cita {

	private LocalDateTime fechaYhora;
	private Paciente paciente;
	private Medico medico;
	private Boolean estado;
	
	
	public Cita(LocalDateTime fechaYhora, Paciente paciente, Medico medico) {
		super();
		this.fechaYhora = fechaYhora;
		this.paciente = paciente;
		this.medico = medico;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha y Hora: "+ fechaYhora + " Paciente: "+ paciente + " Medico: " 
				+ medico;
	}
}
