package arrays1d;

import java.util.Scanner;

/**
 * Ejercicio 3 Mediante el uso de arrays pide al usuario un número
 * y muestra por pantalla si este es palíndromo o no. Debes pedir
 * el número completo, no digito a digito.
 * 
 * @author Angel
 *
 */
public class Tres {

	private static boolean palindromo(int[] numero) {
		
		for(int i=0;i<numero.length/2;i++)
			if (numero[i]!=numero[numero.length-i-1]) return false;
		
		return true;
	}
	
	private static int[] a_array(int numero) {
		int []vector;
		
		// Solución usando una cadena
		/*
		final String cadena=String.valueOf(numero);
		vector=new int[cadena.length()];
		for(int i=0;i<cadena.length();i++) vector[i]=(int)Integer.valueOf(cadena.substring(i,i+1));
		*/
	
		// Solución usando únicamente arrays
		int tam=1,tmpNum=numero;
		
		for(int i=0;((int)(tmpNum/10))>0;i++) {
			tmpNum=tmpNum/10;
			tam++;
		}
		vector=new int[tam];
		for(int i=0;i<tam;i++) {
			vector[tam-i-1]=numero%10;
			numero=numero/10;
		}
		
		return vector;
	}
	
	public static void main(String[] args) {
		int[] cifras;
		
		System.out.println("Escribe el número para ver si es palíndromo:");
		int numero = (new Scanner(System.in)).nextInt();
		
		cifras=a_array(numero);
		
		if (palindromo(cifras)) 
			System.out.println(numero + " ES palíndromo");
		else
			System.out.println(numero + " NO es palíndromo");
		
	}

}
