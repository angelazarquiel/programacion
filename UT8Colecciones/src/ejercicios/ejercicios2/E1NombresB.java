package ejercicios.ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

/*
 * Crear un programa que pida una serie de 
 * nombres. Después de cada nombre 
deberá preguntarse si quiere o no insertar
 otro nombre. Finalmente se imprimirán 
los nombres en el mismo orden en el que se 
introdujeron y también en oden inverso. Nota: 
prueba a realizarlo usando ListIterator, que 
tiene los métodos previousIndex() y previous().
 */
public class E1NombresB {

	public boolean continuar(){
		return true;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre,pregunta;
		boolean continuar = true;
		ArrayList<String> cadenaNombres=new ArrayList<String>();
		
		do{
			System.out.println("Introduce el nombre: ");
			nombre=teclado.next();
			cadenaNombres.add(nombre);
			
			do{
				System.out.println("¿Quiere insertar otro nombre?(n|s)");
				pregunta=teclado.next();
				if(pregunta.equals("n"))
					continuar=false;
				else 
					if(pregunta.equals("s"))
						continuar=true;
			}while(!pregunta.equals("s")&&!pregunta.equals("n"));
				
		}while(continuar);
			
		
		ListIterator<String> ite = cadenaNombres.listIterator();
		System.out.println("Orden introducidos: ");
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
		
		System.out.println();
		System.out.println("Contrario: ");
		while(ite.hasPrevious()){
			System.out.println(ite.previous());
		}
			
			

	}

}
