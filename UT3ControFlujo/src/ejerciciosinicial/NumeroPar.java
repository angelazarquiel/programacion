package ejerciciosinicial;

import java.util.Scanner;

public class NumeroPar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dame un numero: ");
		int numero=teclado.nextInt();
		
		if (numero%2 == 0) {
			System.out.printf("El número %d es par",numero);
			//System.out.print("El número " + numero + " es par");
		}
		else {
			System.out.printf("El número %d es impar",numero);
		}
		
	}

}
