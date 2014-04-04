package simulacro2ev;

import java.util.Scanner;

public class Uno {

	public static String clave() throws ClaveNoSegura {
		Scanner teclado=new Scanner(System.in);
		
		String cadena;
		
		cadena=teclado.next();
		
		if (cadena.length()<6)
			throw new ClaveNoSegura();
		
		return cadena;
	}
	
	public static void main(String[] args) {
		
		String miclave;
		
		try {
			miclave=clave();
		}catch (ClaveNoSegura cns) {
			System.out.println("Clave demasiado corta");
		}

	}

}
