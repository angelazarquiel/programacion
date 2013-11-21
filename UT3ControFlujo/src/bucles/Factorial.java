package bucles;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int numero=-1;
		String respuesta;
		Scanner teclado;
		double factorial;
		
		teclado= new Scanner(System.in);
		
		System.out.println("Cálculo de factoriales");
		
		do{
		
			do {
     			// pedir numero
				System.out.print("\nDame un número positivo: ");
				numero=teclado.nextInt();
			} while (numero<0);
			
			// calcular factorial de numero
			factorial=1.0;
			if (numero!=0) {
				for(int i=1;i<=numero;i++)
					factorial=factorial*i;
			}
			
			System.out.println("El factorial de " + numero + " es " + factorial);
				
			do {
			  System.out.println("\n¿Quiere insetar otro número [s/n]?");
			  respuesta=teclado.next();
			} while (!respuesta.equals("s") && !respuesta.equals("n"));
			
		} while (respuesta.equals("s"));
	}

}
