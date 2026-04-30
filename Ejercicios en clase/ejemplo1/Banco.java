package ejemplo1;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cuenta> listCuentas;

	public Banco() {
		super();
		this.listCuentas = new ArrayList();
	}
	
	public Cuenta buscarCuenta(int numero) {
		for (Cuenta cuenta : listCuentas) {
			if(cuenta.getNumero() == numero)
				return cuenta;
		}
		
		return null;
	}
	
	public void deposito(Cuenta cuenta, long valor) {
		
	}
	
	public void retiro(Cuenta cuenta, long valor) {
		
	}
	
	

}
