package ejerciciosinicial;

import java.util.Scanner;

public class NumeroMayor2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.print("Dame dos numeros: ");
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		
		if (numero1 >= numero2) {
			System.out.print("El número mayor es:"+numero1);
		}
		else {
			System.out.print("El número mayor es:"+numero2);
		}
		/*
		if (numero1 > numero2) {
			System.out.print("El número mayor es:"+numero1);
		}
		else if (numero1 == numero2) {
			System.out.print("Los numeros son iguales");
		}
		else
		{
			System.out.print("El número mayor es:"+numero2);
		}
		*/
	}

}
