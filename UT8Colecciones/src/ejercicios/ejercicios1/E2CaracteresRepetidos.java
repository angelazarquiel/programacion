package ejercicios.ejercicios1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class E2CaracteresRepetidos {

	public static void main(String[] args) {
		ArrayList<Character> caracteres = new ArrayList<Character>();
		
		Scanner teclado = new Scanner(System.in);
		char leido;
		boolean repetidos=false;
		
		leido=teclado.next().charAt(0);
		while(leido!='*') {
			caracteres.add(leido);
			leido=teclado.next().charAt(0);
		}

		//HashSet<Character> unicos = new HashSet<Character>(caracteres);
		//repetidos=unicos.size()<caracteres.size();
		
		Collections.sort(caracteres); 
		for(int i=1;i<caracteres.size() && !repetidos;i++)
			if (caracteres.get(i-1).equals(caracteres.get(i)))
				repetidos=true;
		
		
		if (repetidos) System.out.println("Se introdujeron caracteres repetidos");
		
		System.out.println(caracteres);
	}
	
	public static void main2(String[] args) {
		HashSet<Character> caracteres = new HashSet<Character>();
		
		Scanner teclado = new Scanner(System.in);
		char leido;
		boolean repetidos=false;
		
		leido=teclado.next().charAt(0);
		while(leido!='*') {
			if (caracteres.contains(leido)) repetidos=true;
			caracteres.add(leido);
			leido=teclado.next().charAt(0);
		}

		if (repetidos) System.out.println("Se introdujeron caracteres repetidos");
		
		System.out.println(caracteres);
	}

}
