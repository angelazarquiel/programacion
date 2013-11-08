package ejerciciosinicial;

import java.util.Scanner;

public class Menor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2,numero3;
		
		System.out.print("Dame tres numeros: ");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		numero3 = teclado.nextInt();

		if (numero1<=numero2 && numero1<=numero3){
			System.out.println("Número meno: " + numero1);
		} else if (numero2<numero3) {
			System.out.println("Número meno: " + numero2);
		} else
			System.out.println("Número meno: " + numero3);
		
		
		if (numero1<=numero2) {
			if (numero1 <= numero3)
				System.out.println("Número meno: " + numero1);
			else
				System.out.println("Número meno: " + numero3);
		} else
		{
			if (numero2<=numero3)
				System.out.println("Número meno: " + numero2);
			else
				System.out.println("Número meno: " + numero3);
		}
		
		
	}

}
