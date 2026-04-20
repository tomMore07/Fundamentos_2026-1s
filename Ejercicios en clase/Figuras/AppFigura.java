package abstracta;

import java.util.ArrayList;
import java.util.List;

public class AppFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figura> listaFiguras = new ArrayList();
		
		Cuadrado cuadrado1 = new Cuadrado("Magenta", 10, 10);
		
		Triangulo triangulo = new Triangulo("Rojo", 20, 60);
		
		Circulo circulo1 = new Circulo("Verde", 100);
		
		listaFiguras.add(circulo1);
		listaFiguras.add(triangulo);
		listaFiguras.add(circulo1);
		
		System.out.println(listaFiguras.get(1).calcularArea());
		

	}

}
