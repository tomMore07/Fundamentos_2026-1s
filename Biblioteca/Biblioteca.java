package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Libro> listaLibro;
	private List<Prestamo> listaPrestamo;
	/**
	 * 
	 */
	public Biblioteca() {
		super();
		//Relación de Composición
		this.listaLibro =new ArrayList();
		this.listaPrestamo =new ArrayList();
	}
	/**
	 * Método permite agregar un objeto libro a la lista de libros
	 * @param libro
	 */
	public void asignarLibro(Libro libro) {
		this.listaLibro.add(libro);
	}
	/**
	 * 
	 * @param prestamo
	 */
	public void asignarPrestamo(Prestamo prestamo) {
		this.listaPrestamo.add(prestamo);
	}
	/**
	 * 
	 * @param isbn
	 * @return
	 */
	public Libro buscarLibro(int isbn) {
		for (Libro libro : listaLibro) {
			if(libro.getIsbn() == isbn)
				return libro;
		}
		return null;
	}
	/**
	 * Muestar en la consla los libros y su estado
	 */
	public void mostrarLibros() {
		for (Libro libro : listaLibro) {
			System.out.println(libro);
		}
	}
	/**
	 * Muestar en la consola los prestamo
	 */
	public void mostrarPrestamo() {
		for (Prestamo prestamo : listaPrestamo) {
			System.out.println(prestamo);
		}
	}

	
 
}