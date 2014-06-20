package dados;

public class DosDados {

	private Dado dado1, dado2;

	public DosDados() {
		dado1 = new Dado();
		dado2 = new Dado();
	}

	public void tirar() {
		dado1.tirar();
		dado2.tirar();
	}

	public int getValor() {
		return dado1.getValor() + dado1.getValor();
	}

	@Override
	public String toString() {
		return dado1 + "+" + dado2 + "=" + this.getValor();
	}

	public static void main(String[] args) {
		// bucle para conseguir 1+1
	}
}
