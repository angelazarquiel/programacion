package ejercicios;

import java.util.Scanner;

/*
 * Ejercicio 1.
 * Escribir un programa que pregunte al usuario
 * su nombre, y luego lo salude.
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		String nombre;
		String mensaje;
		Scanner input;
		
		input = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		
		nombre = input.nextLine();
		mensaje = "Hola, "+nombre;
		System.out.println(mensaje);
		input.close();
	}

}
