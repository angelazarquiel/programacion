package metodos;
import java.util.Scanner;


public class Ejemplo143 {

	public static double redondea(double a_redondear) {
		return Math.floor(a_redondear +0.5);
	}
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double numero;
		
		do {
		
			System.out.println("Dame un numero real: ");
		
			numero= teclado.nextDouble();
		
			System.out.println(numero +
					" redondeado es: " + redondea(numero));
			
			
		} while (numero != 0.0);

	}

}

		
