package biblioteca;

import java.util.Scanner;

public class App {
	
	public static void main(String[] a) {
		// TODO Auto-generated method stub
		//Crear oibjeto para leer Scanner parar leer datos
		
		Scanner leer =new Scanner(System.in);
		
		//Crear objeto de la clase biblioteca para acceder a los atributos y los métodos
		Biblioteca biblioteca =new Biblioteca();
				
		//Se crean objetos d ela clase Libro
		Libro libro1 =new Libro(120,"Java","Pachita");
		Libro libro2 =new Libro(130,"UML","Pachito");
		Libro libro3 =new Libro(150,"Python","Albita");
		Libro libro4 =new Libro(140,"C++","Francisco");
		Libro libro5 =new Libro(170,"Php","Roberto");
		
		//Se adicionan los objetos a la lista de libros
		biblioteca.asignarLibro(libro1);
		biblioteca.asignarLibro(libro2);
		biblioteca.asignarLibro(libro3);
		biblioteca.asignarLibro(libro4);
		biblioteca.asignarLibro(libro5);
		
	
		
		System.out.println("Lista de Libros en la Biblioteca");
		biblioteca.mostrarLibros();
		
		//Prestar un libro
		
		System.out.print("Entre el ISBN del libro aprestar ");
		int isbn = leer.nextInt();
		
		Libro libroBuscado = biblioteca.buscarLibro(isbn);
		
		if(libroBuscado != null) {
			if(libroBuscado.isEstado()) {
			    libroBuscado.setEstado(false);
			    //Crear un objeto de la clase Prestamo
		        Prestamo prestamo =new Prestamo(4152,libroBuscado,new Estudiante("Lucila"));
		        //Se adiciona elemento o objeto a la lisat de prestamos
		        biblioteca.asignarPrestamo(prestamo);
		    }else
		    	System.out.println("Libro Prestado");
	    }else {
	    	System.out.println("Yuca Libro No Existe");
	    }
		
		System.out.println("Lista de Libros en la Biblioteca");
		biblioteca.mostrarLibros();
		System.out.println("Lista de Prestamos en la Biblioteca");
		biblioteca.mostrarPrestamo();
		
		System.out.print("Entre el ISBN del libro aprestar ");
		isbn = leer.nextInt();
		
		libroBuscado = biblioteca.buscarLibro(isbn);
		
		if(libroBuscado != null) 
			if(!libroBuscado.isEstado())
				System.out.println("Yuca Libro Prestado");
		
	}

}