package bucles;

import java.util.Scanner;

public class NumerosImpares2 {

	public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        System.out.println("Elige un numero: ");
        String cadena="";
        int numero;
        
        do {
        	numero=teclado.nextInt();
        	if (numero%2!=0) {
        	   cadena=cadena+numero+" ";
               System.out.println("Elige un numero: ");
        	}        	
        } while(numero%2!=0);  
        
        System.out.println("Impares: " + cadena);
	}
}
