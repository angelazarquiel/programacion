package ejemplos;

public class PruebaCuenta {
	
	public static void main(String[] args){
		Cuenta mi_cuenta;
		
		mi_cuenta= new Cuenta();
		
		mi_cuenta.ingresar(1000);
		
		System.out.println("Saldo inicial: " + mi_cuenta.getSaldo());
		
		mi_cuenta.sacar(200);
		mi_cuenta.sacar(100);
		mi_cuenta.ingresar(100);
		
		System.out.println("Saldo actual: " + mi_cuenta.getSaldo());
		System.out.println("Número de movimientos: " + mi_cuenta.getTransacciones());
	}
}
