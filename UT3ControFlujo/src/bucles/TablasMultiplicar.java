package bucles;

import java.util.Scanner;

public class TablasMultiplicar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int numero = teclado.nextInt();
		int linea;
		
		linea=1;
	    while (linea<=10) {	
		   System.out.println(numero + " x " + linea + " = " + (numero*linea));
		   linea++;
	    }
	}

}
