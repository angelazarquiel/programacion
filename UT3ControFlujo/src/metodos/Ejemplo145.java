package metodos;

public class Ejemplo145 {

	public static String nombre; 
	
	public static void imprime(int[] vector) {
		System.out.print("[");
		for(int i=0;i<vector.length-1;i++) {
			System.out.print(vector[i] + ", ");
		}
		System.out.print(vector[vector.length-1] + "]");

	}
	
	public static String a�adePunto(String frase) {
		if (frase.charAt(frase.length()-1)!='.') {
			return frase+".";
		}
		else {	
		    return frase;
		}
	}
	
	public static void main(String[] args) {
		int[] prueba={1,2,3,4,5};

		imprime(prueba);
		
		String fraseMain;
		
		fraseMain="Hola cadena";
		
		fraseMain=a�adePunto(fraseMain);
		
		System.out.println(fraseMain);
		
	}

}
