package ejemplos;

public class EjemplosString {

	public static void main(String[] args) {
		String cadena="cadena";
		
		cadena=new String("otra cadena");
		
		cadena+=" hola cadena";
		
		if (cadena.equals("otra cadena hola cadena"))
			System.out.println("Cadenas iguales");
		
		System.out.println(cadena.toUpperCase());
		System.out.println(cadena);
		
		String nombre1="Angel",nombre2="Alberto";
		
		System.out.println(nombre1.compareTo(nombre2));
		System.out.println(nombre2.compareTo(nombre1));
		
		System.out.println("110".compareTo("116"));
		
		System.out.println(cadena.contains("cadena"));
		
		String numeroCadena=String.valueOf(0.7f);
		float f=Float.valueOf("2.45");
		System.out.println(numeroCadena);
		
		System.out.println(cadena.substring(12, 16));
		
		// Pedir el número de nombres, leerlos de teclado y mostrarlos
		// por orden alfabético
		
		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejará que el usuario inserte cinco subcadenas con el fin de informar
		// si la primera cadena empieza o termina por cada una de las cindo subcadenas

		// Escribe un programa que pida una cadena. Posteriormente, el programa
		// dejará que el usuario inserte cinco subcadenas con el fin de informar si
		// la primera tiene las subcadenas indicadas. Se debe indicar en que
		// posición se encontró y la última.
		
		// Escribe un programa que pida una cadena. Posteriormente, el programa dejará
		// que el usuario inserte varios caracteres hasta que inserte un asterisco, con
		// el fin de informar, para cada carácter, si la cadena lo contiene y en qué
		// posición está el primero.
	}
}

