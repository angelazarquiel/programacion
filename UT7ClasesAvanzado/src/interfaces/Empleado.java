package interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empleado implements Persona {
	//Atributos
	private String nombre;
	private double sueldo;
	
	@Override
	public void pedirDatos() {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Dame el nombre:");
		this.nombre=entrada.nextLine();
		do {
			try {
				System.out.println("Dame el sueldo:");
				this.sueldo=entrada.nextDouble();
			}
			catch (InputMismatchException e) {
				entrada.next();
				sueldo=0;
			}
		} while (sueldo<=0);
	}
	
	@Override
	public void visualizarDatos() {
		System.out.println("Cliente de " + dato);
		System.out.println("Nombre: "+this.nombre+" "+"Sueldo: "+this.sueldo);
	}
}
