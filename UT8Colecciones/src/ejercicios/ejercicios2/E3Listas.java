package ejercicios.ejercicios2;

import java.util.ArrayList;
import java.util.List;

public class E3Listas {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static ArrayList CrearLista(){
		ArrayList lista = new ArrayList();
		lista.add("Pepe");
		lista.add("Juan");
		lista.add(1);
		lista.add(4);
		lista.add("Jose");
		lista.add("Javier");
		
		return lista;
	}
	
	@SuppressWarnings({ "rawtypes" })
	public static void corta(List lista){
		lista.remove(0);
		lista.remove(lista.size()-1);
		//System.out.println(lista);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static List centro(List lista){
		ArrayList lista2 = new ArrayList();
		lista2.addAll(lista);
		lista2.remove(0);
		lista2.remove(lista2.size()-1);
		return lista2;
		//System.out.println(lista2);
	}
	
	public static void main(String[] args) {
		List lista = CrearLista();
		List resultado;
		
		System.out.println(lista);
		corta(lista);
		System.out.println(lista);
		resultado=centro(lista);
		System.out.println(resultado);
	}
}

