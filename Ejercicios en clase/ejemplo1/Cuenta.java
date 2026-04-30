package ejemplo1;

public class Cuenta {
	protected int numero;
	protected long saldo;
	protected String titular;
	
	public Cuenta(int numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Numero=" + numero + " Titular=" + titular + " Saldo =" + saldo;
	}

	
	
	

}
