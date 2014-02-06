package ejemplos;

public class Cuenta {
	
	private double saldo;
	private long num_transacciones;
	private String numero_cuenta;
	
	public Cuenta(String num_cuenta) {
		this.numero_cuenta=num_cuenta;
		this.saldo=0;
		this.num_transacciones=0;
	}
	
	public Cuenta(String num_cuenta, double saldo_inicial) {
		this.numero_cuenta=num_cuenta;
		this.saldo=saldo_inicial;
		this.num_transacciones=1;
	}
	
	public String getNumeroCuenta() {
		return numero_cuenta;
	}

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
