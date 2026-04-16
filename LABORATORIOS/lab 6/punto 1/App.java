package ejercicio1;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante uno =new Estudiante(1029198,"Pepe",18,39982873);
		System.out.println(uno);
		
		Administrativo admin =new Administrativo(983771, "Carlota", 54,"contadora", "contaduria", 238668760);
		System.out.println(admin);
		System.out.println("Salario mensual: "+ admin.calcularSalario());
		
		Docente profe =new Docente(127367, "Pablo", 43, "IA", 60, 80000);
		System.out.println(profe);
		System.out.println("Salario mensual: "+ profe.calcularSalario());
	}

}
