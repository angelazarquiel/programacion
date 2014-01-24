import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Divide {

	public static void main(String[] args) {
		int dividendo=0,divisor=0;
		Scanner teclado=new Scanner(System.in);
		
		try {
			dividendo=teclado.nextInt();
			divisor=teclado.nextInt();
		}
		catch (NoSuchElementException|IllegalStateException e){
			System.out.println("Error");
			System.exit(0);
		}
		
			
		try {
			System.out.println("Resultado: " + (dividendo/divisor));
		}
		catch (ArithmeticException error) {
			System.out.println("Error, división por cero.");
			System.out.println(error.getMessage());
		}
		catch (Exception e) {
			System.out.println("Error, inesperado.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("Adiós");

	}

}
