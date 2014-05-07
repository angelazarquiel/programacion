package cadenas;

public class Rotar {

	static String rotar(String cadena, int pos) {

		String cadenaAux;
		
		pos=pos%cadena.length();

		cadenaAux = cadena.substring(cadena.length() - pos, cadena.length());
		cadena = cadena.substring(0, cadena.length() - pos);

		cadena = (cadenaAux + cadena);
		
		//StringBuilder aux2;
		
		//aux2=new StringBuilder(cadena.substring(cadena.length() - pos, cadena.length()));
		//aux2.append(cadena.substring(0, cadena.length() - pos));
		
		return cadena;

	}

	
	static String rotar2(String cadena, int pos) {

		StringBuilder cadenaAux=new StringBuilder(cadena);
		
		//pos=pos%cadena.length();

		for(int i=0;i<pos;i++) {
			cadenaAux.insert(0, cadenaAux.charAt(cadenaAux.length()-1));
			cadenaAux.deleteCharAt(cadenaAux.length()-1);
		}
		
		return cadenaAux.toString();

	}
	
	public static void main(String[] args) {

		System.out.println(rotar("Cadena de ejemplo", 5));
		System.out.println(rotar("Cadena de ejemplo segunda", 27));
		
		System.out.println(rotar2("Cadena de ejemplo segunda", 27));

	}

}
