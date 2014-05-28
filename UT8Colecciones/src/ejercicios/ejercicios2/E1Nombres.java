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
public class E1Nombres {

	public boolean continuar(){
		return true;
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		String nombre,pregunta;
		boolean continuar = true;
		ArrayList<String> cadenaNombres=new ArrayList<String>();
		ListIterator<String> ite = cadenaNombres.listIterator();
		
		do{
			System.out.println("Introduce el nombre: ");
			nombre=teclado.next();
			ite.add(nombre);
			
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
			
		System.out.println("Orden: ");
		System.out.println(ite.previousIndex()+1+" NOMBRES.");
		while(ite.hasPrevious()){
			System.out.println(ite.previous());
		}
		
		System.out.println();
		System.out.println("Contrario: ");
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
			
			

	}

}
