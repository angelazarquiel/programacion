package metodos;

import java.util.Scanner;

public class EurosADolares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dime los euros: ");
		double euros = teclado.nextDouble();
		System.out.println(euros + " € son " + aDolares(euros) + " $");

	}

	
	public static double aDolares(double euros) {
		final double cotizacion=1.34;
		
		double dolares= euros*cotizacion;
		
		return dolares;
	}
}
