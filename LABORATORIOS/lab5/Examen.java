package hospital;

import java.time.LocalDate;


public class Examen {
	
		private String id;

		private LocalDate fecha;

		private String tipo;

		

		

		public Examen(String id, LocalDate fecha, String tipo) {

			super();

			this.id = id;

			this.fecha = fecha;

			this.tipo = tipo;

		}

		

		@Override

		public String toString() {

			

			return "Identificador del exámen: "+ this.id + "Fecha del exámen" 

			+ this.fecha+ " Tipo del exámen" + this.tipo  ;

		}

		

	}
