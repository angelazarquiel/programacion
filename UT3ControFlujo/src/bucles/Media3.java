package bucles;

import java.util.Scanner;

public class Media3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		System.out.println("Dame tres numeros: ");
		int suma=0;
		
		for(int i=0;i<=2;i++) {
			suma+=teclado.nextInt();
		}
		
		for(int i=3;i>0;i--) {
			suma+=teclado.nextInt();
		}
		
		System.out.println("Media: " + suma/3);
	}

}
