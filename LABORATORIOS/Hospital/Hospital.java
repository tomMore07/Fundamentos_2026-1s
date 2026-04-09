package hospital;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sistema sanRafael = new Sistema();
	
		Paciente Jose = new Paciente(1111, "Jose", 45, "masculino", TipoCancer.Leucemia , 3, "remision");
		Paciente Maria = new Paciente(1112, "María", 12, "femenino", TipoCancer.Linfoma , 1, "en tratamiento" );
		Paciente Pedro = new Paciente(1113, "Pedro", 32, "masculino", TipoCancer.Sarcoma , 3, "fallecido" );
		Paciente Miguel = new Paciente(1114, "Miguel", 76, "masculino", TipoCancer.Sarcoma , 2, "en tratamiento" );
		Paciente Clara = new Paciente(1115, "Clara", 24, "femenino", TipoCancer.Sarcoma , 2, "remision" );
		Paciente Carmen = new Paciente(1116, "Carmen", 8, "femenino", TipoCancer.Leucemia , 1, "en tratamiento" );
		
		
		
		Examen examen1 = new Examen("A0H878",LocalDate.now(), "Resonancia");
		Examen examen2 = new Examen("A0B62",LocalDate.now(), "Biopsia");
		
		sanRafael.agregarExamenes(Carmen, examen2);
		sanRafael.agregarExamenes(Carmen, examen1);
		
		
		Examen examen3 = new Examen("A56JB",LocalDate.now(), "Resonancia");
		Examen examen4 = new Examen("A6J78",LocalDate.now(), "Tomografía");
		
		sanRafael.agregarExamenes(Miguel, examen4);
		sanRafael.agregarExamenes(Miguel, examen3);
		
		Examen examen5 = new Examen("AK8Y8",LocalDate.now(), "Biopsia");
		Examen examen6 = new Examen("AP7H6",LocalDate.now(), "Tomografía");
		
		sanRafael.agregarExamenes(Maria, examen6);
		sanRafael.agregarExamenes(Maria, examen5);
		
		
		Tratamiento tra1 = new Tratamiento("Quimioterapia", "C78J0", 60, "Vomito");
		Tratamiento tra2 = new Tratamiento("Cirugia", "CH890", 1, "Infecciones");

		sanRafael.agregarTratamientos(Clara, tra2);
		sanRafael.agregarTratamientos(Clara, tra1);
		
		
		Tratamiento tra3 = new Tratamiento("Inmunoterapia", "CK89H", 456, "Fatiga");
		Tratamiento tra4 = new Tratamiento("Cirugia", "CH899", 1, "Infecciones");
		
		sanRafael.agregarTratamientos(Jose, tra4);
		sanRafael.agregarTratamientos(Jose, tra3);
		
		
		Tratamiento tra5 = new Tratamiento("Inmunoterapia", "CK89H", 230, "Fatiga");
		Tratamiento tra6 = new Tratamiento("Quimioterapia", "C23J1", 355, "Pérdida de cabello");
		
		sanRafael.agregarTratamientos(Pedro, tra6);
		sanRafael.agregarTratamientos(Pedro, tra5);
		
	    sanRafael.pacientesTipoCancer(); // Punto 27 del taller
	    
	    String reporteEstados = sanRafael.PorcentajePorEstado(); // Punto 28 del taller
	    System.out.println(reporteEstados);

		
		
		
		
		
	}
}
