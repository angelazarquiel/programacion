package ejemplos;

public class CuentaB {
	
	private double saldo=0;
	private long num_transacciones=0;
	
	public void ingresar(double cantidad) {
		saldo+=cantidad;
		num_transacciones++;
	}
	
	public void sacar(double cantidad) throws SaldoInsuficiente {
		if (saldo<cantidad) {
			throw new SaldoInsuficiente();
		}else{
			saldo-=cantidad;
			num_transacciones++;
		}
	}

	public double getSaldo() {
		return saldo;
	}
	
	public long getTransacciones() {
		return num_transacciones;
	}
}
