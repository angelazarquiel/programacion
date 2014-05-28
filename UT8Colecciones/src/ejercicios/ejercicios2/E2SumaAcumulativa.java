package ejercicios.ejercicios2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class E2SumaAcumulativa {
	
	public static ArrayList<Integer> sumaAcumulativa(List<Integer> numeros) {

		ArrayList<Integer> resultado=new ArrayList<Integer>();
		
		resultado.add(numeros.get(0));
		for(int i=1;i<numeros.size();i++){
			resultado.add(resultado.get(i-1) + numeros.get(i));
		}
		
		return resultado;
	}

	public static ArrayList<Integer> sumaAcumulativaIterador(List<Integer> numeros) {

		ArrayList<Integer> resultado=new ArrayList<Integer>();
		int suma=0;
		
		for(Integer i:numeros) {
			suma+=i;
			resultado.add(suma);
		}
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		ArrayList<Integer> suma;
		int tamaño=10;
		
		for(int i=0;i<tamaño;i++){
			numeros.add(i, i+1);
		}
		
		System.out.print("Lista: ");
		System.out.println(numeros);

		suma = sumaAcumulativa(numeros); 
		
		System.out.print("Acumulativa: ");
		System.out.println(suma);
	}
	
}
