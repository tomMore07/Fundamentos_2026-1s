package ejercicio1;

public class Vendedor extends Empleado{
	private long ventasMensuales;

	public Vendedor(String nombre, int id, int edad, long salarioBasico, 
					int añosEnEmpresa, long ventasMensuales) {
		
		super(nombre, id, edad, salarioBasico, añosEnEmpresa);
		this.ventasMensuales = ventasMensuales;
	}
	
	
	public long comision() {
		return this.ventasMensuales*15/100;
	}
	public long prestaciones() {
		return (this.salarioBasico + comision())*10/100;
	}
	public long pagoMensual() {	
		long subtotal = this.salarioBasico+comision()-prestaciones();
		int antiguedad = 2026 - this.añosEnEmpresa;
		if(antiguedad>20) { 
			return subtotal+100000;		
		}else {
			return subtotal;			
		}
	}
	
	public String toString() {
		return "Vendedor:"+this.nombre+ " ID:"+ this.id+
		" Año de ingreso:"+this.añosEnEmpresa+" Salario básico:"
		+this.salarioBasico+" Total ventas:"+this.ventasMensuales+
		" Valor comision:"+ this.comision()+" Descuentos:"+
		this.prestaciones()+" Neto pagado:"+ this.pagoMensual(); 
	}
	

}
