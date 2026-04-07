
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
			//System.out.println("Marca " + auto.getMarca()
				//				+"Modelo " + auto.getModelo()
				//				+"Propietario " +auto.getCliente().getNombre()
				//				+"Motor " +auto.getMotor().getTipo()
				//				+"Llantas " +auto.getLlantas().toString());
			System.out.println(auto);
			

		}
	}
}
