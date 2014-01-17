package metodos;

import java.util.Arrays;

public class Suma {
/*
 * Escribe un método que tome un vector de números y devuelva la suma acumulativa; esto es,
 *  un nuevo vector en el que cada elemento contiene la suma de todos los elementos
 *  anteriores. Por ejemplo, la suma acumulativa de [1, 2, 3] es [1, 3, 6].
 */
	public static int[] suma_acumulativa(int[] entrada) {
	
		if (entrada.length<2) return entrada.clone();
		
		int[] resultado = new int[entrada.length];
		
		resultado[0]=entrada[0];
		for(int i=1;i<entrada.length;i++)
			resultado[i]=resultado[i-1]+entrada[i];
		
		return resultado;
	}
	
	public static void main(String[] args) {
		int[] prueba={1,2,3};
		
		System.out.println(Arrays.toString(prueba));
		System.out.println(Arrays.toString(suma_acumulativa(prueba)));

	}

}
