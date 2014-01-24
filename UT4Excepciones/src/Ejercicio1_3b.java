import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1_3b {

	public static void main(String[] args) {
        double dividendo = 0;
        double divisor = 0;
        Scanner teclado = new Scanner(System.in);
        boolean hayerror;

        hayerror = false;

        do {
                try {
                        System.out.println("Introduzca un número entero:");
                        dividendo = teclado.nextDouble();
                        divisor = teclado.nextDouble();
                        hayerror = false;
                        System.out.println("Resultado: " + dividendo/divisor);
                } catch (InputMismatchException e) {
                        System.err.println("ERROR: El número introducido no es un número entero. El error es: "
                                                        + e.getMessage());
                        teclado.nextLine();
                        hayerror = true;
                }
        } while (hayerror == true);
        
        teclado.close();
	}

}
