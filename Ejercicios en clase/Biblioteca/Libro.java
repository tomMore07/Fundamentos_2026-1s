package biblioteca;

public class Libro {
	private int isbn;
	private String titulo;
	private String autor;
	private boolean estado;
	
	public Libro(int isbn, String titulo, String autor) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.estado = true;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	/**
	 * 
	 * @return
	 */
	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		
		String estadito = (this.estado)? "Disponible" : "Prestado";
		
		return " Isbn" + isbn + " Titulo " + titulo + " Autor" + autor +" "+ estadito;
	}
	
	
	

}
