package ahorcado;

import java.util.ArrayList;
import java.util.HashSet;

public class PalabraOculta {
	private ArrayList<Character> palabra;
	private HashSet<Character> letras;
	private HashSet<Character> conocidas;
	
	public PalabraOculta(){
		String palabraAleatoria = "";
		
		palabraAleatoria=obtenerYLimpiar();
		//System.err.println(palabraAleatoria);
		
		this.palabra=new ArrayList<Character>();
		for(Character c:palabraAleatoria.toCharArray())
			palabra.add(c);
		
		letras=new HashSet<Character>(palabra);
		conocidas=new HashSet<Character>();
	}
	
	private String obtenerYLimpiar() {
		String limpia = null;
		String palabra = null;
		boolean aceptable=false;
		String acentos = "ÁÉÍÓÚ";
	    String vocales = "AEIOU";
		
		while(!aceptable) {
			try {
				palabra=Palabras.palabra();
			} catch (Exception e) {
				System.out.println("No se ha podido obtener palabra aleatoria");
				System.exit(-1);
			}
			limpia=palabra.toUpperCase();
		    for (int i = 0; i < acentos.length(); i++)
		       limpia = limpia.replace(acentos.charAt(i), vocales.charAt(i));
			if (limpia.matches("[ Ç.,-]") || limpia.length()<6)
				aceptable=false;
			else
				aceptable=true;
		}
		return limpia;
	}
	
	public String toString() {
		StringBuilder cadena=new StringBuilder();
		
		for(Character c:palabra) {
			if (!conocidas.contains(c))
				cadena.append("_ ");
			else
				cadena.append(c+" ");
		}
		
		return cadena.toString();
	}
	
	public boolean test(char c) {
		
		Character ch=Character.toUpperCase(c);
		
		if (letras.contains(ch) && !conocidas.contains(ch)) {
			conocidas.add(ch);
			return true;
		}
		
		return false;
	}
	
	public int getHuecos() {
		return this.letras.size()-this.conocidas.size();
	}
	
	public String getPalabra() {
		StringBuilder sb=new StringBuilder();
		for(Character c:this.palabra) sb.append(c);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		PalabraOculta p;
		
		p=new PalabraOculta();
		
		p.test('o');
		
		System.out.println(p);
	}
}
