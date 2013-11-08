package ejerciciosinicial;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		//Leer temperatura Fahrenheit
		Scanner teclado = new Scanner(System.in);
		double temperatura;

		System.out.print("Dime la temperatura (ºF):");
		temperatura = teclado.nextDouble();
		
		//Pasar a ºC
		temperatura = (temperatura-32)/1.8;
		
		//Si tª<0
		if (temperatura<=0) {	
			System.out.println("Temperatura: " + temperatura + "ºC");
			System.out.println("AVISO: temperatura de congelación.");
		}
		else {
			System.out.println("No hay riesgo de congelación.");
		}
		
		
	}
}
