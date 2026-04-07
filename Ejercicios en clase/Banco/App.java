package banco;

public class App {

	public static void main(String[] args) {
		// Se crea un objeto de la clase banco
		Banco miBanco =new Banco();
		
		//Crear dos objeto de la clase Persona
		Persona titular1 =new Persona("Pachita");
		Persona titular2 =new Persona("Paris");
		
		//Crear dos objetos de la clasecuenta
		Cuenta cuenta1 =new Cuenta(102030,titular1);
		Cuenta cuenta2 =new Cuenta(102040,titular2);
		
		miBanco.agregarCuenta(cuenta1);
		miBanco.agregarCuenta(cuenta2);
		miBanco.mostrarCuentas();
		
		Cuenta cuentaEncontrada = miBanco.buscarCuenta(102030);
		
		if(cuentaEncontrada == null)
			System.out.println("Error Yuca Cuenta no Encontrada");
		else
			miBanco.realizarDeposito(1680450, cuentaEncontrada);
		
		miBanco.mostrarCuentas();
	}

}
