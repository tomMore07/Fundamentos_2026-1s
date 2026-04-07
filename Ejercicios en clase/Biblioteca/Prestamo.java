package biblioteca;

import java.time.LocalDate;
import java.util.Locale;

public class Prestamo {
	private int numero;
	private LocalDate fechaPrestamo;
	private Libro liro;
	private Estudiante estudiante;
		
	
	public Prestamo(int numero, Libro liro, Estudiante estudiante) {
		super();
		this.numero = numero;
		this.liro = liro;
		this.estudiante = estudiante;
		this.fechaPrestamo = LocalDate.now();
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(LocalDate fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}
	public Libro getLiro() {
		return liro;
	}
	public void setLiro(Libro liro) {
		this.liro = liro;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}
	@Override
	public String toString() {
		return "Prestamo numero " + numero + " FechaPrestamo " + fechaPrestamo + " Liro" + liro + ", estudiante="
				+ estudiante;
	}
	
}