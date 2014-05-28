package ejercicios.ejercicios1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

/*------- ECHO POR RAUL WITH <3 FOR DAW ----
* 3.Crea una coleccion con los primeros x 
* numeros de la serie de Fibonacci, donde X 
* es un numero que pediras al usuario. Despues
*  pregunta numeros y di si esta o no en la coleccion.
* El programa terminara cuando el usuario introduzca un 0.
*/
public class E3Fibonacci {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Sucesión de Fibonacci.");
		System.out.print("Tamaño de la sucesión: ");
		int tamaño=teclado.nextInt();
		ArrayList<Integer> fibonacci=new ArrayList<Integer>(); 
		
		fibonacci.add(1);
		fibonacci.add(1);
		for(int i=2;i<tamaño;i++){
			fibonacci.add(fibonacci.get(i-1)+fibonacci.get(i-2));
		}
		//System.out.println("Sucesión generada:" + fibonacci);
		
		int numero;
		boolean correcto=false;
		do{
			System.out.print("Esta el numero: ");
			numero=teclado.nextInt();
			long time1= System.nanoTime();
			if(fibonacci.contains(numero)) System.out.println("El número SI está en la sucesión.");
			else System.out.println("El número NO está en la sucesión");
			long time2= System.nanoTime();
			long tiempo=time2-time1;
			System.out.println("Tiempo consumido: " + tiempo/1E6 + " ms");
		}while(numero!=0);
	}
}
