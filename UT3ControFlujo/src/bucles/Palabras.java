package bucles;
import java.util.Scanner;


public class Palabras {

	public static void main(String[] args) {
		String[] palabras={"uno","hola","tera","bit"};

		/*
		 palabras[0] = "uno"; 
		 palabras[1] = "hola";
		 */
		
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Dame una palabra: ");
		
		String intento;
		
		intento= teclado.next();
		boolean encontrado=false;
		
		for(int i=0; i<palabras.length && !encontrado;i++) {
			if (intento.equals(palabras[i])) encontrado=true;
		}
		
		if (encontrado) System.out.println("Encontrado");
	}

}
