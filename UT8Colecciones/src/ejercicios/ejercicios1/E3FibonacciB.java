package ejercicios.ejercicios1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class E3FibonacciB {
	
	public static void crearFibonacci(List<Integer> lista, int tamaño) {
		lista.add(1);
		lista.add(1);
		for(int i=2;i<tamaño;i++){
			lista.add(lista.get(i-1)+lista.get(i-2));
		}
	}
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("Sucesión de Fibonacci.");
		System.out.print("Tamaño de la sucesión: ");
		int tamaño=teclado.nextInt();
		ArrayList<Integer> fibonacci=new ArrayList<Integer>(); 
	
		crearFibonacci(fibonacci,tamaño);
		//System.out.println("Sucesión generada:" + fibonacci);
	
		int numero;
		boolean correcto=false;
		HashSet<Integer> conjuntoFibonacci=new HashSet<Integer>(fibonacci); 
		do{
			System.out.print("Esta el numero: ");
			numero=teclado.nextInt();
			long time1= System.nanoTime();
			if(conjuntoFibonacci.contains(numero)) System.out.println("El número SI está en la sucesión.");
			else System.out.println("El número NO está en la sucesión");
			long time2= System.nanoTime();
			long tiempo=time2-time1;
			System.out.println("Tiempo consumido: " + tiempo/1E6 + " ms");
		}while(numero!=0);
}
}
