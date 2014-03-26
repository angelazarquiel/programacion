package arrays2d;

import java.util.Arrays;
import java.util.Scanner;

public class Cinco {
	/*
	 * Ejercicio 5. Escribe un programa que pida 8 notas. El programa debe
	 * visualizar cuál es la nota más alta, luego la siguiente, y así
	 * sucesivamente. Si hay alguna nota repetida, se visualizará solo una vez.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int tamañoInicial = 8;
		int tamañoFinal = tamañoInicial;
		int vector[] = new int[tamañoInicial];

		System.out.println("Inserte las notas que desea ordenar (desc).");
		for (int i = 0; i < tamañoInicial; i++) {
			vector[i] = teclado.nextInt();
		}

		teclado.close();


		int ordenado[]=Arrays.copyOf(vector,vector.length);
		Arrays.sort(ordenado);
		
		int anterior=ordenado[ordenado.length-1];
		System.out.print(ordenado[ordenado.length-1]+" ");
		for(int i=ordenado.length-2;i>=0;i--) {
			if (anterior!=ordenado[i]) { 
				System.out.print(ordenado[i]+ " ");
				anterior=ordenado[i];
			}			
		}
	}

}
