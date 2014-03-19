package arrays1d;

import java.util.Scanner;

/**
 * Ejercicio 5 Realiza un programa que encripte una cadena de caracteres 
 * (solo podemos usar caracteres en minúsculas o números). La enciptación consiste en:
 * 
 *  Dada una cadena de caracteres, en la cadena encriptada cada carácter será igual a
 *  él mismo más el carácter que se encuentra a continuación. Si nos encontramos en
 *  el último valor le sumaremos 4.
 *  
 *  Una vez realizada la operación anterior sumaremos 3 a cada carácter obteniendo
 *  finalmente la cadena encriptada definitiva.
 *  
 *  Puedes utilizar los métodos de cadenas toCharArray y el constructor
 *  String(char[] value) para convertir/crear una cadena a/partiendo de un array de
 *  caracteres.
 *  
 * @author Angel
 *
 */
public class Cinco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Teclea la cadena a encriptar: ");
		String cadena=teclado.nextLine();
		
		for(int i=0;i<cadena.length();i++) {
			if (!(Character.isDigit(cadena.charAt(i)) ||
				Character.isLowerCase(cadena.charAt(i)))) {
				System.out.println("Caracteres no válidos en la entrada");
				System.exit(0);
			}
		}
		
		char[] vector = cadena.toCharArray();
		
		for(int i=0;i<vector.length-1;i++)
			vector[i]+=vector[i+1]+3;
		
		vector[vector.length-1]+=4+3;

		cadena=new String(vector);
		System.out.print("Cadena encriptada: " + cadena);

	}

}
