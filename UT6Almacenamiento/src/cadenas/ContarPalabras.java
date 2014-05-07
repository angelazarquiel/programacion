package cadenas;

import java.util.StringTokenizer;

public class ContarPalabras {

	public static int contarPalabrasP(String frase) {

		StringTokenizer contar = new StringTokenizer(frase);

		return contar.countTokens();

	}

	public static int contarPalabrasR(String frase) {

		int contador = 0;

		frase = frase.replaceAll("[.|,]", " ");
		System.out.println(frase);
		frase = frase.replaceAll("( )+", " ");
		System.out.println(frase);

		String[] palabras = frase.split(" ");

		return palabras.length;
	}

	public static int contarPalabrasM(String frase) {

		int cuentaPalabras = 0;

		for (int i = 1; i < frase.length(); ++i) {
			if ((frase.charAt(i) == ' ' || frase.charAt(i) == '.' || frase
					.charAt(i) == ',')
					&& !(frase.charAt(i - 1) == ' '
							|| frase.charAt(i - 1) == '.' || frase
							.charAt(i - 1) == ',')) {
				cuentaPalabras++;
			}
		}

		if (frase.length() > 0
				&& Character.isLetterOrDigit(frase.charAt(frase.length() - 1)))
			cuentaPalabras++;

		return cuentaPalabras;
	}

	public static void main(String[] args) {
		String pruebas = "Hola cadena para probar, palabras. Fin.";

		System.out.println(contarPalabrasP(pruebas));
		System.out.println(contarPalabrasR(pruebas));
		System.out.println(contarPalabrasM(pruebas));
	}

}
