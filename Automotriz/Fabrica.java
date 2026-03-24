package automotriz;

	import java.util.ArrayList;
	import java.util.List;
	
public class Fabrica {
	
	private List<Auto> listaAutomoviles;

	public Fabrica() {
		super();
		this.listaAutomoviles = new ArrayList<>();
	}
	
	public void agregarAutomovil(Auto auto) {
		this.listaAutomoviles.add(auto);
		
	}
	
	public void mostrarAutos() {
		for(Auto auto : listaAutomoviles) {
			System.out.println(auto);

		}
	}
}