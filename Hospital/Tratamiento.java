package hospital;

public class Tratamiento {
	

		private String nombre;

		private String identificacion;

		private int diasDeDuracion;

		private String efectosSecundarios;

		

		

		public Tratamiento(String nombre, String identificacion, int diasDeDuracion, String efectosSecundarios) {

			super();

			this.nombre = nombre;

			this.identificacion = identificacion;

			this.diasDeDuracion = diasDeDuracion;

			this.efectosSecundarios = efectosSecundarios;

		}
		
		 public String getNombre() {
		        return nombre;
		    }

		    public String getIdentificacion() {
		        return identificacion;
		    }
		    

		    public void calcularEficacia(Paciente paciente) {
		    	
		        TipoCancer tipo = paciente.getTipocancer();
		        double porcentajeEficacia = 0.0;

		        if (tipo != null) {
		            switch (tipo) {
		                case Sarcoma:
		                    porcentajeEficacia = 70.0;
		                    break;
		                case Leucemia:
		                    porcentajeEficacia = 90.0;
		                    break;
		                case Linfoma:
		                    porcentajeEficacia = 85.5;
		                    break;
		                
		            }
		            System.out.println("El tratamiento '" + this.nombre + "' tiene una eficacia del " 
		                                + porcentajeEficacia + "% para el paciente " + paciente.getNombre());
		        } else {
		            System.out.println("No se puede calcular la eficacia: El paciente no tiene un tipo de cáncer asignado.");
		        }
		    }

		   
		   

		    public String toString() {
		        return "Tratamiento: " + nombre + " (ID: " + identificacion + "), Duración: " + diasDeDuracion + " días.";
		    }
		    
		}


