package metodos;

import java.util.Scanner;

public class AdivinaNumero {
/*
 * Escriba un programa que simule el juego de adivinar un número. 
 * El ordenador debe generar un número entre 1 y 100 y el usuario 
 * tiene que intentar el adivinarlo. Para ello, cada vez que el 
 * usuario introduce un valor el ordenador debe decirle al usuario 
 * si el número a adivinar es mayor o menor que el introducido. 
 * Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla
 *  el número de veces que el usuario ha intentado adivinar dicho
 *  número. Estructura el programa con los métodos que estimes
 *  necesarios, teniendo en cuenta que debe ser lo más legible posible.
 */
	static Scanner teclado = new Scanner(System.in);
	
	public static int devolverAleatorio(int min, int max) {
		// (int)(Math.random() *((max - min) + 1)) + min;
		int aleatorio;
		
		aleatorio =(int)(Math.random() *((max - min) + 1)) + min;
		
		return aleatorio;
	}
	
	public static int leerEntero() {
		System.out.print("Escribe un número: ");
		
		int numero = teclado.nextInt();
		
		return numero;
	}
	
	public static void imprimeDiferencia(int leido, int oculto) {
		if (leido>oculto) 
			System.out.println("El número es menor");
		else if (leido<oculto)
			System.out.println("El número es mayor");
	}
	
	public static void main(String[] args) {

		System.out.println("Pensando un número entre 1 y 100...");
		int numero_oculto = devolverAleatorio(1,100);
		System.out.println("¡Ya! intenta adivinarlo...");
		
		int numero_leido,intentos=0;
		// bucle para pedir número y decir si es menor o mayor
		do {
			numero_leido=leerEntero();
			imprimeDiferencia(numero_leido,numero_oculto);
			intentos++;
		}while(numero_leido!=numero_oculto);
		
		System.out.println("¡Conseguido!, te ha llevado " + intentos + " intentos.");
	}

}
