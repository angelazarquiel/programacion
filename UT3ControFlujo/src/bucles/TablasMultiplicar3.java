package bucles;

import java.util.Scanner;

public class TablasMultiplicar3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int numero = teclado.nextInt();
		int linea;
		
		linea=1;
	    do {	
		   System.out.println(numero + " x " + linea + " = " + (numero*linea));
		   linea++;
	    } while (linea<=10);
	    
	}

}
