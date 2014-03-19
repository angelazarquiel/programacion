package arrays1d;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Ejerciccio 4 Realiza un programa que pida al usuario la introducción de un carácter
 * hasta que este pulse el carácter @. El programa debe mostrar las veces que se ha
 * escrito cada carácter. Recordad que los caracteres tienen asociado un número (código)
 * que comienza por cero. Ten en cuenta que se pueden hacer cosas como esta:
 *   int c;
 *   String qp="qp";
 *   c=qp.charAt(0);
 *   System.out.println(c);
 *   
 *   Este programa imprimiría "113", el código de q. Si quisiera imprimir un número también puedo hacerlo así:
 *   
 *   System.out.println((char)65);
 *   
 *   Utiliza arrays para hacer el ejercicio.
 *   
 * @author Angel
 *
 */
public class Cuatro {

	public static void main(String[] args) {
		int[] contador;
		Scanner teclado = new Scanner(System.in);
		
		contador=new int[256];
		
		Arrays.fill(contador, 0);
				
		char c;
		do {
			System.out.print("Teclea un caracter: ");
			c=teclado.next().charAt(0);
			contador[c]++;
		}while(c!='@');
		
		System.out.println("Frecuencias de cada caracter: ");
		
		for(int i=0;i<contador.length;i++) {
			if (contador[i]>0)
				System.out.printf("\t%s : %d\n",Character.toString((char)i),contador[i]);
		}
		
		
		
	}

}
