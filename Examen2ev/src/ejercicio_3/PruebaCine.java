package ejercicio_3;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaCine {

	private static String pedirCadena(String msg) {
		Scanner scn=new Scanner(System.in);
		
		System.out.print(msg+": ");
		return scn.nextLine();
		
	}
	
	private static void añadirPelicula(Cine c) {
		Pelicula p2;
		String genero="-";
		
		p2=new Pelicula(pedirCadena("Nombre de la película"));
		while(!genero.equals("*")) {
			genero=pedirCadena("¿A qué género pertenece ('*' para terminar)?");
			if (!genero.equals("*")) p2.setGenero(genero);
		}
		c.addPelicula(p2);
	}
	
	public static void main(String[] args) {
		
		Menu menu;
		String[] opciones={"Añadir pelicula","Borrar pelicula","Listar peliculas","Salir"};
		int respuesta;
		Cine cine=new Cine("Pepito",6);
		
		menu=new Menu(opciones,opciones.length);
		System.out.println("==== BIENVENIDO A CINES PEPITO ====");
		
		do{
			System.out.print("\n\n\n");
			respuesta=menu.imprimirYPreguntar();
			switch (respuesta) {
				case 1:
					añadirPelicula(cine);
					break;
				case 2:
					cine.delPelicula(pedirCadena("¿Película a borrar?"));
					break;
				case 3:
					System.out.println(Arrays.toString(cine.getPeliculas()));
					break;
			}
			
		}while (respuesta<opciones.length);

	}

}
