package ejemplos;

import java.util.HashSet;

import java.util.Iterator;

public class Conjuntos1 {

	public static void main(String[] args) {
		HashSet<String> miscadenas=new HashSet<String>();

		miscadenas.add("Daw");
		miscadenas.add("Asir");
		
		System.out.println(miscadenas);
		
		if (miscadenas.contains("Daw"))
			System.out.println("Daw es un ciclo");
		
		miscadenas.add("Daw");
		System.out.println(miscadenas);
		
		Iterator<String> i=miscadenas.iterator();
		while (i.hasNext()) {
			String dato=i.next();
		}
		
		miscadenas.remove("Daw");
		System.out.println(miscadenas);
	}

}
