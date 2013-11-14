package condicionales;

import java.util.Scanner;

public class Ejercicio7b {

	public static void main(String[] args) {

		int ordenador;
		String juego_ordenador;
		
		// ordenador elige su juego
		ordenador = (int) (Math.random() * 3 + 1);
		
		if (ordenador==1) juego_ordenador="piedra";
		else if (ordenador==2) juego_ordenador="papel";
		else juego_ordenador="tijera";
		
		// usuario elige su juego
		Scanner teclado = new Scanner (System.in);
        		
		System.out.println("-- Juego Piedra/Papel/Tijera --");
        System.out.println("¿Que sacas? [piedra, papel o tijera]");
        String juego_usuario;
        
        juego_usuario=teclado.next();
        juego_usuario=juego_usuario.toLowerCase();
        
        System.out.println("Mi elección: " + juego_ordenador);
        
        // comprobar quien gana
        if ( !(juego_usuario.equals("piedra") ||
        	juego_usuario.equals("papel") ||
        	juego_usuario.equals("tijera")) )
        	{
        		System.out.println("ERROR: no has escrito un juego correcto");
        	}
        else {
        	if (juego_usuario.equals(juego_ordenador)) {
        		System.out.println("¡¡EMPATE!!");
        	} else if (juego_usuario.equals("piedra") && juego_ordenador.equals("tijera") ||
        			   juego_usuario.equals("papel") && juego_ordenador.equals("piedra") ||
        			   juego_usuario.equals("tijera") && juego_ordenador.equals("papel")) {
        		System.out.println("¡¡GANASTE!!");
        	} else
        		System.out.println("¡¡PERDISTE!!");
        	
        }
        
        	
    	}
}
