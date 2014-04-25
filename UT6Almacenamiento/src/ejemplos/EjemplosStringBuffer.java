package ejemplos;

import java.util.Scanner;

public class EjemplosStringBuffer {

	public static void main(String[] args) {
		StringBuilder nombre;
		
		nombre=new StringBuilder("Angel");

		nombre.append(" Cañadas");
		
		nombre.insert(5, " Martínez");
		
		System.out.println(nombre);
		
		nombre.delete(nombre.indexOf(" C"),nombre.length());
		
		System.out.println(nombre);
		
		String aux=new String(nombre);
		
		Scanner scn=new Scanner(System.in);
		
		StringBuilder auxSB=new StringBuilder(scn.nextLine());
	}

}
