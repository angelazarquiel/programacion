package arrays1d;

import java.util.Scanner;

/**
 * Ejercicio 2 Crea un programa que almacene los meses del año
 * (los nombres de cada mes). Se pedirá al usuario el número de
 *  mes y se visualizará su nombre.
 *  
 * @author Angel
 *
 */
public class Dos {

	public static void main(String[] args) {
		String[] meses={"Enero",
				"Febrero",
				"Marzo",
				"Abril",
				"Mayo",
				"Junio",
				"Julio",
				"Agosto",
				"Septiembre",
				"Octubre",
				"Noviembre",
				"Diciembre"};

		System.out.println("Mes del año (número):");
		int numero = (new Scanner(System.in)).nextInt();
		
		System.out.println("El mes se llama: " + meses[numero-1]);
	}

}
