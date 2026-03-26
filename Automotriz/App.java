package automotriz;

import banco.Cuenta;

public class Appa {

	public static void main(String[] args) {
		// Se crea un objeto de la clase 
		Fabrica miFabrica =new Fabrica ();
		
		// objetos cliente
		Cliente cliente1 =new Cliente("Ernesto");
		Cliente cliente2 =new Cliente("Juan");
		
		// objeto automovil
		Auto auto1 =new Auto("Porsche", 2021, cliente1);
		Auto auto2 =new Auto("Audi", 2019, cliente2);
		
		// agregar objeto llanta
		Llanta llanta1 =new Llanta("Michelin");
		Llanta llanta2 =new Llanta("Michelin");
		Llanta llanta3 =new Llanta("Michelin");
		Llanta llanta4 =new Llanta("Michelin");
				
		auto1.agregarLlanta(llanta1);
		auto1.agregarLlanta(llanta2);
		auto1.agregarLlanta(llanta3);
		auto1.agregarLlanta(llanta4);
		
		
		
		// objeto motor
		Motor motor1 =new Motor("Gasolina");
		Motor motor2 =new Motor("Electrico");
		
		miFabrica.agregarAutomovil(auto1);
		miFabrica.agregarAutomovil(auto2);
		miFabrica.mostrarAutos();
		
	}
}

