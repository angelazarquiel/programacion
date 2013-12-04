package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Distintos {

	public static void main(String[] args) {
		Scanner teclado;
		int[] numeros;
		int tam_numeros;
        
        teclado = new Scanner(System.in);

        numeros=new int[10];
        tam_numeros=0;
        
        System.out.println("Dime número (max 10): ");
        
        boolean cero=false;
        int i=0;
        while (i<10 && !cero) {
        	//leer
        	int numero = teclado.nextInt();
        	
        	if (numero==0) {
        		cero=true;
        	}
        	else {
              	//insertar si no está
        		boolean encontrado=false;
        		
        		for(int j=0;j<tam_numeros;j++) 
        			if (numero==numeros[j]) encontrado=true;
        		
        		if (!encontrado) {
        			numeros[tam_numeros]=numero;
        			tam_numeros++;
        		}
        			
        	}
        	
        	i++;
        }
        
        System.out.println("Número de distintos " + tam_numeros);
        System.out.println(Arrays.toString(numeros));
	}
	
	
	
	

}
