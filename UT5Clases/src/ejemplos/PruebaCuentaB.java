package ejemplos;

public class PruebaCuentaB {
	
	public static void main(String[] args){
		CuentaB mi_cuenta;
		
		mi_cuenta= new CuentaB();
		
		mi_cuenta.ingresar(250);
		
		System.out.println("Saldo inicial: " + mi_cuenta.getSaldo());
		
		try {
		  mi_cuenta.sacar(200);
		} catch (SaldoInsuficiente si) {
			System.out.println("Operación no permitida");
		}
		
		try {
			mi_cuenta.sacar(100);
		} catch (SaldoInsuficiente si) {
			System.out.println("Operación no permitida");
		}
		
		mi_cuenta.ingresar(100);
		
		System.out.println("Saldo actual: " + mi_cuenta.getSaldo());
		System.out.println("Número de movimientos: " + mi_cuenta.getTransacciones());
		
		
		// mejoras a la cuenta: no admite descubiertos
		// Guarda también su número de cuenta, un número de 10 cifras
		// Menú para gestionar una cuenta (pide al usuario cuentas y ingresa/saca)
		// Constructores de la cuenta (nº cuenta, saldo inicial)
	}
}






