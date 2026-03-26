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

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre Doctor: "+ this.nombre + " Especialidad:"+ this.especialidad + " Horario:" 
				+ inicioHorarioTrabajo+finHorarioTrabajo;
	}
	
	
	
}
