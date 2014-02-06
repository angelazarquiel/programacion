package ejemplos;

public class CuentaB {
	
	private double saldo=0;
	private long num_transacciones=0;
	
	public void ingresar(double cantidad) {
		saldo+=cantidad;
		num_transacciones++;
	}
	
	public boolean sacar(double cantidad) {
		if (saldo<cantidad) {
			System.out.println("¡No permitido sacar más dinero del disponible!");
			return false;
		}else{
			saldo-=cantidad;
			num_transacciones++;
			return true;
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public long getTransacciones() {
		return num_transacciones;
	}
}
