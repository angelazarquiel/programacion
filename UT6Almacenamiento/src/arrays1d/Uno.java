package arrays1d;

import java.util.Arrays;

/**
 * Ejercicio 1 Realiza un programa que calcule los 6 números para rellenar
 * una quiniela primitiva controlando que no se repita ninguno de ellos.
 * 
 * @author Angel
 * 
 *
 */

public class Uno {

	private static int random(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	
	/**
	 * Comprueba si un elemento está en un array
	 *   
	 * @param i Elemento buscado
	 * @param array Vector donde buscar
	 * @param size Número de elementos donde buscar
	 * @return true si se ha encontrado i
	 * 
	 */
	private static boolean is_in(int i,int[] array,int size) {
		for(int j=0;j<size;j++)
			if (array[j]==i) return true;
		return false;
	}
	
	public static void main(String[] args) {
		int[] numbers=new int[6];

		
		for(int i=0;i<6;) {
			int new_number = random(1,49);
			
			if (!is_in(new_number,numbers,i)) {
				numbers[i++]=new_number;
			}
		}
		
		System.out.println("Resultado:" + Arrays.toString(numbers));
	}
}
