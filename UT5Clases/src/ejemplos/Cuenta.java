package ejemplos;

public class Cuenta {
	
	private double saldo=0;
	private long num_transacciones=0;
	
	public void ingresar(double cantidad) {
		saldo+=cantidad;
		num_transacciones++;
	}
	
	public void sacar(double cantidad) {
		saldo-=cantidad;
		if (saldo<0)
			System.out.println("¡La cuenta esta en números rojos!");
		num_transacciones++;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public long getTransacciones() {
		return num_transacciones;
	}
}
