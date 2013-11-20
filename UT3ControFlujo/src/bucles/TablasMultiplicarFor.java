package bucles;

import java.util.Scanner;

public class TablasMultiplicarFor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int numero = teclado.nextInt();
		//int linea;
				
	    for (int linea=1;linea<=10;linea++) {	
		   System.out.println(numero +
				   " x " + linea + " = " + (numero*linea));
	    }
	}
}
