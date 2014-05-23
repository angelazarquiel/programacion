package ejercicios.ejercicios1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class E1Numeros {

	public static void imprimeCantidades(List<Integer> vector) {
		int positivos=0,negativos=0;
		for(int i=0;i<10;i++) {
			if (vector.get(i)>0) positivos++;
			else if (vector.get(i)<0) negativos++;
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + (10-positivos-negativos));
	}
	
	public static void numeros() {
		LinkedList<Integer> numeros = new LinkedList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			numeros.add(teclado.nextInt());
		}
		
		imprimeCantidades(numeros);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0;i<10;i++) {
			numeros.add(teclado.nextInt());
		}
		
		int positivos=0,negativos=0;
		for(int i=0;i<10;i++) {
			if (numeros.get(i)>0) positivos++;
			else if (numeros.get(i)<0) negativos++;
		}
		
		System.out.println("Positivos: " + positivos);
		System.out.println("Negativos: " + negativos);
		System.out.println("Ceros: " + (10-positivos-negativos));
	}

}
