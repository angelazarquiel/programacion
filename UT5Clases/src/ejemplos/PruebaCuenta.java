package ejemplos;

public class PruebaCuenta {
	
	public static void main(String[] args){
		Cuenta mi_cuenta,otra_cuenta;
		
		mi_cuenta= new Cuenta("3456789012");
		otra_cuenta = new Cuenta("2222222222",200.00);
		
		mi_cuenta.ingresar(250);
		
		System.out.println("Saldo inicial: " + mi_cuenta.getSaldo());
		
		mi_cuenta.sacar(200);
		if (!mi_cuenta.sacar(100)) System.out.println("Operación no permitida");
		mi_cuenta.ingresar(100);
		
		System.out.println("Saldo actual: " + mi_cuenta.getSaldo());
		System.out.println("Número de movimientos: " + mi_cuenta.getTransacciones());
		
		
		// mejoras a la cuenta: no admite descubiertos
		// Guarda también su número de cuenta, un número de 10 cifras
		// Menú para gestionar una cuenta (pide al usuario cuentas y ingresa/saca)
		// Constructores de la cuenta (nº cuenta, saldo inicial)
	}
}






