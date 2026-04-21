package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Empleado> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(new Vendedor("Ana Silva",1728318, 30,2500000, 2003, 500000));
		listaEmpleados.add(new Vendedor("José Perez",589282, 50, 5500000,1989, 1000000));
		listaEmpleados.add(new Vendedor("Mariana Lopez",74821, 23, 1500000, 2025, 200000));
		
		listaEmpleados.add(new Repartidor("David Rodriguez",6324792, 20,2000000, 2023,'J',34));
		listaEmpleados.add(new Repartidor("Julian Montes",283122, 25,2000000,2022, 'A',27));
		listaEmpleados.add(new Repartidor("karen peña",1232131, 29,2000000, 2020, 'D',40));
		
		
		
		for (Empleado empleado : listaEmpleados) {
		    System.out.println(empleado); 
		}
	}

}

