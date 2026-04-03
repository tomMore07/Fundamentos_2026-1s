package hospital;

import java.util.List;

public class Paciente {
	

	private int identificacion;
	private String nombre;
	private int edad;
	private String genero;
	private TipoCancer tipocancer;
	private int etapa;
	private String estadoActual;
	private List<Examen> listaExamenes;
	private List<Tratamiento> listaTratamientos;
	
	public Paciente(int identificacion, String nombre, int edad, String genero, TipoCancer tipocancer, int etapa,
			String estadoActual) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.edad = edad;
		this.genero = genero;
		this.tipocancer = tipocancer;
		this.etapa = etapa;
		this.estadoActual = estadoActual;
		this.listaExamenes = listaExamenes;
		this.listaTratamientos = listaTratamientos;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public TipoCancer getTipocancer() {
		return tipocancer;
	}

	public void setTipocancer(TipoCancer tipocancer) {
		this.tipocancer = tipocancer;
	}

	public int getEtapa() {
		return etapa;
	}

	public void setEtapa(int etapa) {
		this.etapa = etapa;
	}

	public String getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(String estadoActual) {
		this.estadoActual = estadoActual;
	}

	@Override
	public String toString() {
		return "Paciente = " + nombre + " Genero = " + genero + " EstadoActual = " + estadoActual + "";
	}
	
	
	
	
}
