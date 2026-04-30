package ejemplo1;

public class Ahorro extends Cuenta implements IDepositable{
	private long interesAcumulado;
	
	public Ahorro(int numero, String titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
		this.interesAcumulado += (this.saldo * (3/100));
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ "Interes Acumulado " + this.interesAcumulado;
	}
	
	

}
