package ahorcado;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Ahorcado {

	private static int MAX_INTENTOS = 6;

	public static void main(String[] args) throws IOException {
		System.out.println("El gran juego del ahorcado");
		System.out.println("--------------------------");
		System.out.print("\n...obteniendo palabra aleatoria");
		PalabraOculta palabra;
		palabra = new PalabraOculta();
		System.out.println(".[hecho]");
		Scanner teclado = new Scanner(System.in);

		int intentos = MAX_INTENTOS;
		System.out.println("\ten total tienes " + intentos + " vidas");
		System.out.println(palabra);
		// repetir mientras no tenga huecos y no gaste intentos
		while (palabra.getHuecos() > 0 && intentos > 0) {
			if (palabra.test(teclado.next().charAt(0))) {
				System.out.println("\t¡Encontrada! ");
			} else {
				intentos--;
				System.out.println("\tFallo, te quedan " + intentos
						+ " vidas");
			}
			System.out.println(palabra);
		}

		if (palabra.getHuecos() == 0)
			System.out.println("\t¡Enhorabuena!, lo has conseguido");
		else
			System.out.println("\testás muerto, la palabra que buscabas:"
					+ palabra.getPalabra());
	}
	
}
