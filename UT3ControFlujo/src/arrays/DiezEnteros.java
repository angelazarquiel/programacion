package arrays;

import java.util.Arrays;

public class DiezEnteros {

	public static void main(String[] args) {
		int[] enteros;
	
		enteros=new int[10];	
		
		for(int i=0;i<10;i++)
			enteros[i]=i;

		for(int i=0;i<10;i++)
			System.out.print(enteros[i]);
		
		System.out.println();
		System.out.print(Arrays.toString(enteros));
	}
}
