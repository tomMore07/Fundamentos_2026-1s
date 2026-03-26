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

	public LocalDateTime getFechaYhora() {
		return fechaYhora;
	}


	public void setFechaYhora(LocalDateTime fechaYhora) {
		this.fechaYhora = fechaYhora;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Boolean getEstado() {
		return estado;
	}


	public void setEstado(Boolean estado) {
		this.estado = estado;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fecha y Hora: "+ fechaYhora + " Paciente: "+ paciente + " Medico: " 
				+ medico;
	}
}
