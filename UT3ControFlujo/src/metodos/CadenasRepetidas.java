package metodos;

public class CadenasRepetidas {
/*
 * Escribe una funci�n tiene_duplicados(vector)
 *  que tome un vector de cadenas y devuelva verdadero 
 *  si alg�n elemento aparece m�s de una vez. La funci�n 
 *  no modificar� el vector.
 */
	public static boolean tiene_duplicados(String [] cadenas) {
		
		for(int i=0;i<cadenas.length;i++)
			for(int j=i+1;j<cadenas.length;j++)
				if (cadenas[i].equals(cadenas[j]))
					return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		String[] prueba1={"Hola","Mundo"},
				prueba2={"Hola","Mundo","Hola"},
				prueba3={},
				prueba4={"Gato","Perro","Tortuga","Tortuga"};
		
		System.out.println(tiene_duplicados(prueba1));
		System.out.println(tiene_duplicados(prueba2));
		System.out.println(tiene_duplicados(prueba3));
		System.out.println(tiene_duplicados(prueba4));
		
	}

}
