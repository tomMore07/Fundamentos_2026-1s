package clinica;

import java.time.LocalTime;

public class Medico {

	private int identificacion;
	private String nombre;
	private String especialidad;
	private LocalTime inicioHorarioTrabajo;
	private LocalTime finHorarioTrabajo;
	
	public Medico(int identificacion, String nombre, String especialidad, LocalTime inicioHorarioTrabajo,
			LocalTime finHorarioTrabajo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.inicioHorarioTrabajo = inicioHorarioTrabajo;
		this.finHorarioTrabajo = finHorarioTrabajo;
	}
	
	
	public int getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	public LocalTime getInicioHorarioTrabajo() {
		return inicioHorarioTrabajo;
	}


	public void setInicioHorarioTrabajo(LocalTime inicioHorarioTrabajo) {
		this.inicioHorarioTrabajo = inicioHorarioTrabajo;
	}


	public LocalTime getFinHorarioTrabajo() {
		return finHorarioTrabajo;
	}


	public void setFinHorarioTrabajo(LocalTime finHorarioTrabajo) {
		this.finHorarioTrabajo = finHorarioTrabajo;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre Doctor: "+ nombre + " Especialidad:"+ especialidad + " Horario:" 
				+ inicioHorarioTrabajo+finHorarioTrabajo;
	}
	
	
	
}
