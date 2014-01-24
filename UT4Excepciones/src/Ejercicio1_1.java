import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1_1 {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner teclado=new Scanner(System.in);
		
		try {
			
			System.out.print("¿Dos números?: ");
			dividendo=teclado.nextInt();
			divisor=teclado.nextInt();
			System.out.println("Resultado: " + (dividendo/divisor));
			
		}
		catch (ArithmeticException e) {
			System.out.println("Error, división por cero.");
		}
		catch (InputMismatchException  e) {
			System.out.println("Error, no es un número.");
		}
		
		System.out.println("Adiós");

	}

}
