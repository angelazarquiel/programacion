package ejemplos;

public class Cuenta {
	private double saldo=0;
	
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void sacar(double cantidad) {
		saldo-=cantidad;
		if (saldo<0)
			System.out.println("La cuenta esta en rojo");
	}

	public double getSaldo() {
		return saldo;
	}
}
