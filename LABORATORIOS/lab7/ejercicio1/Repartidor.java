package ejercicio1;

public class Repartidor extends Empleado{
	private char zona;
	private int repartosAcumulados;
		
	public Repartidor(String nombre, int id, int edad, long salarioBasico, int añosEnEmpresa, char zona,
			int repartosAcumulados) {
		super(nombre, id, edad, salarioBasico, añosEnEmpresa);
		this.comprobarZona(zona);
		this.repartosAcumulados = repartosAcumulados;
	}
	
	private void comprobarZona (char zonaIngresada) {
		if (zonaIngresada == 'A' || zonaIngresada == 'B' || 
	            zonaIngresada == 'C' || zonaIngresada == 'D') {
	            this.zona = zonaIngresada;
	        } else {
	            this.zona = 'C';
	        }
	}
	
	public int valorRepartos() {
		return this.repartosAcumulados*10000;
	}
	
	public long prestaciones() {
		return this.salarioBasico*10/100;
	}
	
	public long pagoMensual() {
		long base = salarioBasico + valorRepartos() - prestaciones();
		int antiguedad = 2026 - this.añosEnEmpresa;
		
		if(antiguedad == 5 && zona == 'C') {
	
			return base+500;
		} else {
			return base;
		}
	}
	public String toString() {
		return "Repartidor:"+this.nombre+ " ID:"+ this.id+
		" Año de ingreso:"+this.añosEnEmpresa+" Salario básico:"
		+this.salarioBasico+" Numero de repartos:"+this.repartosAcumulados+
		" Valor pagos por repartos:"+ this.valorRepartos()+" Descuentos:"+
		this.prestaciones()+" Neto pagado:"+ this.pagoMensual(); 
	}
}
