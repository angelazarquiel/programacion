package ejemplos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Listas1 {

	public static void main(String[] args) {
		List<String> c=new ArrayList<String>();
		String cadena="Asir";
		
		c.add("Daw");
		c.add("Dam");
		c.add(cadena);
		
		c.add(2, "Inserción");
		c.set(0, "Cadena distinta");
		//c.set(5, "Excepción");
		c.add(c.size(), "Inserción al final");
		//c.add("Inserción");
		
		System.out.println(c);

	}

}
