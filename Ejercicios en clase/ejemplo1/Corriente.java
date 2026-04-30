package ejemplo1;

public class Corriente extends Cuenta implements IRetirable, IDepositable{
	
	private long sobreGiro;

	public Corriente(int numero, String titular) {
		super(numero, titular);
		this.sobreGiro = sobreGiro;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if(valor > this.saldo) 
			this.sobreGiro -= valor;
		else
			this.saldo -= valor;
	}

	@Override
	public void deposito(long valor) {
		// TODO Auto-generated method stub
		this.saldo += valor;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Saldo Sobre Giro" + this.sobreGiro;
	}
	
	
	
	
	
