package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cuenta> listaCuentas;

	/**
	 * 
	 */
	public Banco() {
		super();
		this.listaCuentas =new ArrayList();
	}
	/**
	 * Recibe como parámetro una referencia a un objeto Cuenta y 
	 * permite adicionar un objeto cuenta a la lista de cuentas. 
	 * @param cuenta
	 */
	public void agregarCuenta(Cuenta cuenta) {
		this.listaCuentas.add(cuenta);
	}
	/**
	 * Recibe como parámetros un long valor a depositar y una 
     * referencia a un objeto de la clase Cuenta. Suma el valor del 
     *monto al atributo saldo en el objeto referenciado.
	 * @param monto
	 * @param cuenta
	 */
	public void realizarDeposito(long monto, Cuenta cuenta) {
		cuenta.deposito(monto);
	}
	/**
	 *Recibe como parámetros un long valor a depositar y una 
	 *referencia a un objeto de la clase Cuenta. Resta el valor del 
	 *monto al atributo saldo en el objeto referenciado. 
	 * @param monto
	 * @param cuenta
	 */
	public void realizarRetiro(long monto, Cuenta cuenta) {
		cuenta.retiro(monto);
	} 
	/**
	 * Recibe como parámetro un entero numero de la cuenta a buscar. 
	 *Busca la cuenta en la lista de cuentas. Si la encuentra retorna 
     *una referencia al objeto de la cuenta encontrada. Si no la 
     *encuentra retorna null. 
	 * @param numero
	 * @return
	 */
	public Cuenta buscarCuenta(int numero) {
		for (Cuenta cuenta : listaCuentas) {
			if(cuenta.getNumero() == numero)
				return cuenta;
		}
		 return null;
	}
	/**
	 * Muestra la información de todas las cuentas del banco
	 */
	public void mostrarCuentas() {
		for (Cuenta cuenta : listaCuentas) {
			System.out.println(cuenta);
		}
	}
}
