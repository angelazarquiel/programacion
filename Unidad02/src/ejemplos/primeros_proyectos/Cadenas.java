package ejemplos.primeros_proyectos;

import java.util.Scanner;

public class Cadenas {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre;
		
		nombre=teclado.nextLine();

		System.out.print("Hola "+nombre);
	}

}
