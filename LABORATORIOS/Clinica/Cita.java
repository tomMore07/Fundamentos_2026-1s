package clinica;

import java.time.LocalDateTime;

public class Cita {

	private LocalDateTime fechaYhora;
	private Paciente paciente;
	private Medico medico;
	private boolean estado;
	
	
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



	public Paciente getPaciente() {
		return paciente;
	}



	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}



	public Medico getMedico() {
		return medico;
	}



	public void setMedico(Medico medico) {
		this.medico = medico;
	}



	public boolean getEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	@Override
	public String toString() {
		String estadito = (this.estado)? "Disponible":"No disponible";
		// TODO Auto-generated method stub
		return "Fecha y Hora: "+ fechaYhora + " Paciente: "+ paciente + " Medico: " 
				+ medico + " " + estadito;
	}
}