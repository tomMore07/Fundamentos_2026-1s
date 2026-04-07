package banco;

public class Cuenta {
	private int numero;
	private Persona titular;
	private long saldo;
	/**
	 * @param numero
	 * @param titular
	 * Asociación
	 */
	public Cuenta(int numero, Persona titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Persona getTitular() {
		return titular;
	}
	public void setTitular(Persona titular) {
		this.titular = titular;
	}
	public long getSaldo() {
		return saldo;
	}
	public void setSaldo(long saldo) {
		this.saldo = saldo;
	}
	/**
	 * Recibe como parámetro un dato de tipo long y permite sumar el valor al 
	 *atributo saldo del objeto cuenta. 
	 * @param monto
	 */
	public void deposito(long monto) {
		this.saldo += monto;
	}
	/**
	 * Recibe como parámetro un dato de tipo long y permite restar el valor al 
	 *atributo saldo del objeto cuenta. 
	 */
	public void retiro(long monto) {
		if(monto > this.saldo)
			System.out.println("Error Yuca saldo insuficiente");
		else  
			this.saldo -= monto;
	}
	@Override
	public String toString() {
		return "Numero " + this.numero + " Titular " + this.titular + " Saldo " + this.saldo;
	}
	
	
}
