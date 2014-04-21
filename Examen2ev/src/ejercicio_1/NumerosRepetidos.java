package ejercicio_1;

import java.util.Arrays;

public class NumerosRepetidos {

	public static int[] numRepetidos(int[] vector) {
		int[] repetidos,ordenado;
		
		ordenado=Arrays.copyOf(vector, vector.length);
		Arrays.sort(ordenado);
		
		repetidos=new int[ordenado.length];
	
		int numeroRepetidos=0;
		for(int i=1;i<ordenado.length;i++)
			if (ordenado[i]==ordenado[i-1]) {
				if (numeroRepetidos==0) 
					repetidos[numeroRepetidos++]=ordenado[i];
				else
					if (ordenado[i]!=repetidos[numeroRepetidos-1])
						repetidos[numeroRepetidos++]=ordenado[i];
			}
		
		repetidos=Arrays.copyOf(repetidos, numeroRepetidos);
		
		return repetidos;
	}
	
	public static void main(String[] args) {
		
		int[] vectorprueba={1,23,4,5,7,4,2,1,77,64,89,3,4},
			  vectorprueba2={1,2,3,4},
				repetidos;

		repetidos=numRepetidos(vectorprueba);
		
		System.out.println("Vector original: " + Arrays.toString(vectorprueba));
		System.out.println("Repetidos: " + Arrays.toString(repetidos));
		
		repetidos=numRepetidos(vectorprueba2);
		System.out.println("Vector original: " + Arrays.toString(vectorprueba2));
		System.out.println("Repetidos: " + Arrays.toString(repetidos));
	}

}
