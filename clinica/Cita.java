package clinica;

import java.time.LocalDateTime;

public class Cita {

	private LocalDateTime fechaYhora;
	private Paciente paciente;
	private Medico medico;
	
	
	public Cita(LocalDateTime fechaYhora, Paciente paciente, Medico medico) {
		super();
		this.fechaYhora = fechaYhora;
		this.paciente = paciente;
		this.medico = medico;
	}
}
