package bucles;

import java.util.Scanner;

public class TablasMultiplicar2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Tabla del: ");
		int numero = teclado.nextInt();
		int linea,multiplicacion;
		
		linea=1;
		multiplicacion=numero;
	    while (linea<=10) {	
		   System.out.println(numero + " x " + linea + " = " + (multiplicacion));
		   linea++;
		   multiplicacion+=numero; //multiplicacion=multiplicacion+numero;
	    }
	}

}
