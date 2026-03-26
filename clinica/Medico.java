package clinica;

import java.time.LocalTime;

public class Medico {

	private int identificacion;
	private String nombre;
	private String especialidad;
	private LocalTime inicioHorarioTrabajo;
	private LocalTime FinHorarioTrabajo;
	
	
	public Medico(int identificacion, String nombre, String especialidad, LocalTime inicioHoratioTrabajo,
			LocalTime finHorarioTrabajo) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.inicioHorarioTrabajo = inicioHoratioTrabajo;
		FinHorarioTrabajo = finHorarioTrabajo;
		
		
	}

}
