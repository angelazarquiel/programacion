package ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaUnNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int max, min;
		int numero=0;
		int intentos=0;
		Oculto juego;
		
		
		System.out.println("Escribe los números entre los que estará el número oculto: ");
		try {
			min = entrada.nextInt();
			max = entrada.nextInt();
			juego = new Oculto(min, max);
		} catch (InputMismatchException im)
		{
			System.out.println("No se han podido leer los números, se usará  [1..100]");
			entrada.nextLine();
			juego = new Oculto();
		}
		
		//System.out.println(juego1.getOculto());
		
		do{
			boolean numero_valido=false;
			do  {
				System.out.println("Intenta adivinarlo: ");
				try {
					numero = entrada.nextInt();
					numero_valido=true;
				} catch (InputMismatchException im) {
						System.out.println("Error, eso no es un número");
						entrada.nextLine();
				}
			} while (!numero_valido);
			
			if (juego.pruebaNumero(numero)==-1){
				System.out.println("Mi número es menor");
			}else if(juego.pruebaNumero(numero)==1){
				System.out.println("Mi número es mayor");
				
			}else{
				System.out.println("¡¡¡Ganaste!!! Ese era mi número.");
				break;
			}
			
			intentos++;
		}while(intentos<=5);
		
		if (intentos==6){
			System.out.println("¡¡¡Perdiste!!! Mi número era el "+juego.getOculto());
		}
		
		entrada.close();
	}

}
