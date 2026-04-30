package ejemplo1;

public class Nomina extends Cuenta implements IRetirable{

	public Nomina(int numero, String titular) {
		super(numero, titular);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void retirar(long valor) {
		// TODO Auto-generated method stub
		if(valor <= this.saldo)
			this.saldo -= valor;
		else
			System.out.println("Saldo Insuficiente");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	

}
