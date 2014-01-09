package metodos;

import java.util.Scanner;

public class Ejercicio3 {

	// Crea un m�todo que nos diga si un n�mero es capic�a (devuelve true en el
	// caso de que lo sea y false si no lo es).
	public static void main(String[] args) {
		long numero = 0;
		String respuesta;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out
					.println("Inserte un n�mero para comprobar si es o no capic�a");

			numero = teclado.nextLong();

			if (capicua((int)numero))
				System.out.println("El n�mero " + numero + ", S� es capicua.");
			else
				System.out.println("El n�mero " + numero + ", NO es capicua.");
			do {
				System.out
						.println("�Desea introducir otro numero para comprobar si es capicua? [s/n] ");
				respuesta = teclado.next();
			} while (!respuesta.equals("s") && !respuesta.equals("n"));

		} while (respuesta.equals("s"));
		System.out.println("********FIN DE PROGRAMA********");
		teclado.close();
	}

	public static boolean esCapicua(long numero) {
		long numeroRestante;
		long numeroInvertido;
		long resto;

		numeroRestante = numero;
		numeroInvertido = 0;
		resto = 0;
		while (numeroRestante != 0) {
			resto = numeroRestante % 10;
			numeroInvertido = numeroInvertido * 10 + resto;
			numeroRestante = numeroRestante / 10;
		}
		if (numeroInvertido == numero) {
			return true;
		} else {
			return false;
		}

	}
	
    private static boolean capicua(int num) {
        boolean capicua = true;
        String numero = (new Integer(num)).toString();
        //int[] n = new int[numero.length()];
        
        for(int i=0; i<(numero.length() / 2); i++)
            if(numero.charAt(i) != numero.charAt(numero.length()-i-1)) {
            	capicua = false;
            	break;
            }
        
        /* Pasamos el n�mero a un
        for(int i=0; i<n.length; i++)
                n[i] = numero.charAt(i) - 48;
        
        for(int i=0; i<(n.length / 2); i++)
                if(n[i] != n[n.length-i-1]) capicua = false;
		*/
        return capicua;
    }
}