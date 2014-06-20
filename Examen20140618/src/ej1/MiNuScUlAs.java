package ej1;

import java.util.Scanner;

public class MiNuScUlAs {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String cadena;
	
		System.out.println("Entra la cadena a analizar: ");
		cadena=scn.nextLine();
		
		System.out.println("Resultado: \n\t" + pasarMiniMax(cadena));
		System.out.println("Resultado: \n\t" + pasarMiniMax2(cadena));

	}

	private static String pasarMiniMax(String cadena) {
		StringBuffer minimax=new StringBuffer();
		int posicion=0;
		boolean max=true;
		
		while (posicion<cadena.length()) {
			char caracter=cadena.charAt(posicion);
			if (Character.isLetter(caracter)) {
				caracter=max?Character.toUpperCase(caracter):Character.toLowerCase(caracter);
				max=!max;
			} else
				max=true;
			minimax.append(caracter);
			posicion++;
		}	
		return minimax.toString();
	}
	
	private static String pasarMiniMax2(String cadena) {
		StringBuffer minimax=new StringBuffer(cadena);
		String mayusculas=cadena.toUpperCase();
		String minusculas=cadena.toLowerCase();
		boolean max=true;
		
		minimax.setCharAt(0,mayusculas.charAt(0));
		for(int i=1;i<cadena.length();i++) {
			if (mayusculas.charAt(i-1) != minusculas.charAt(i-1)
					&& minimax.charAt(i-1) == mayusculas.charAt(i-1)) {
				minimax.setCharAt(i, minusculas.charAt(i));
			} else
				minimax.setCharAt(i, mayusculas.charAt(i));
		}	
		return minimax.toString();
	}
}
