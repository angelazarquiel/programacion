package metodos;

public class Ordenado {
/*
 * Escribe un método llamado ordenado, que tome un vector de enteros 
 * como parámetro y devuelva true si el vector (todos sus elementos) 
 * está ordenado ascendentemente, o false en caso contrario.
 */
	public static boolean ordenado(int[] vector) {
		
		for(int i=1;i<vector.length;i++)
			if (vector[i-1]>vector[i])
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		int[] vectorA={1,2,3,4,5,6,7},
			  vectorB={1,2,3,3,5,45,123},
			  vectorC={1,2,3,5,7,3};

		System.out.println(ordenado(vectorA));
		System.out.println(ordenado(vectorB));
		System.out.println(ordenado(vectorC));
		
	}

}
