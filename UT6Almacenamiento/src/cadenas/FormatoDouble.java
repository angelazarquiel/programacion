package cadenas;

public class FormatoDouble {

	private static StringBuilder cadenaComas(double numero) {

		StringBuilder cadena;
		int pos;

		cadena = new StringBuilder(Double.toString(numero).replace(".", ","));

		pos = cadena.indexOf(",") - 3;

		while (pos>0) {
				cadena.insert(pos, ".");
				pos = pos - 3; 
		}
		return cadena;
	}

	public static void main(String[] args) {

		double numero = 1234592.20103;

		System.out.printf("%,.5f\n", numero);
		
		System.out.println(cadenaComas(numero));

	}
}
