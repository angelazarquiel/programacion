package ejercicios.ejercicios2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class E5Cumpleaños {
		
		private static boolean tiene_duplicados(List<Integer> lista) {
			boolean respuesta = false;
			List<Integer> aux = new ArrayList<Integer>(lista);
			
			ListIterator<Integer> iterador1 = aux.listIterator();
			while(iterador1.hasNext()){
				Object elemento = iterador1.next();
				iterador1.remove();
				if(aux.contains(elemento)){
					respuesta = true;
					break;
				}
			}
			return respuesta;
		}
		
		private static List<Integer> cumples(int numero){
			List<Integer> dias = new ArrayList<Integer>();
			
			for(int i=0; i<numero; ++i){
				dias.add((int)((365*Math.random())+1));
			}
			
			return dias;
		}
		
		public static double media(int numero){
			int coincidencias=0;
			double porcentaje;
			int samples=10000;
			
			for(int i=0; i<samples; ++i){
				List<Integer> control;
				control = cumples(numero);
				if(tiene_duplicados(control)){
					++coincidencias;
				}
			}
			porcentaje = (coincidencias/(double)samples)*100;
			return porcentaje;
		}
		
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);
			int respuesta=0;
			boolean hayError = true;
			boolean esCero = false;
			
			do{
				try{
					esCero = false;
					System.out.println("Indícame el número de sujetos sobre los que calcular:");
					respuesta = entrada.nextInt();
					if (respuesta <= 0){
						esCero = true;
						throw new InputMismatchException();
					}
					hayError=false;
				}catch (InputMismatchException ex){
					System.out.println("Eso no es un número o es un número no válido");
					if(!esCero){
						entrada.next();
					}
				}
			}while(hayError);
			
			System.out.printf("La probabilidad entre %d sujetos \nde que dos de ellos cumplan años el mismo día es del %.2f%%", respuesta, media(respuesta));
		}

	}