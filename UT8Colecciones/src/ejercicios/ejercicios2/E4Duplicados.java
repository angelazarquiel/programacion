package ejercicios.ejercicios2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class E4Duplicados {

	public static boolean tiene_duplicados(List lista) {
		boolean respuesta = false;
		List aux = new ArrayList(lista);
		
		ListIterator iterador1 = aux.listIterator();
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

	public static boolean tiene_duplicados2(ArrayList lista) {
		Set lista2 = new HashSet();
		lista2.addAll(lista);

		if (lista.size() != lista2.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(3);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		
		System.out.println(tiene_duplicados(lista));
	}
}