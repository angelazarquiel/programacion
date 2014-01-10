package metodos;

import java.util.Scanner;

public class AdivinaNumero {

	public static int devolverAleatorio(int min, int max) {
		// (int)(Math.random() *((max - min) + 1)) + min;
		int aleatorio;
		
		aleatorio =(int)(Math.random() *((max - min) + 1)) + min;
		
		return aleatorio;
	}
	
	public static int leerEntero() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Escribe un número: ");
		
		int numero = teclado.nextInt();
		
		teclado.close();
		
		return numero;
	}
	
	public static void main(String[] args) {
		
		int numero_oculto = devolverAleatorio(1,100);
		
		// bucle para pedir número y decir si es menor o mayor
		int numero=leerEntero();
		
	}

}
