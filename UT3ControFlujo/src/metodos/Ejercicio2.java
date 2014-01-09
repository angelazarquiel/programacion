package metodos;

import java.util.Scanner;

public class Ejercicio2 {

	public static double farenheitCelsius(double faren) {
		double celsius;
		celsius = ((faren - 32) * 5) / 9;
		return celsius;
	}

	public static void main(String[] args) {

		double farenheit;
		Scanner teclado = new Scanner(System.in);

		do {

			farenheit = teclado.nextDouble();
			if (farenheit != 999)
				System.out.println("En grados Cº = "
						+ farenheitCelsius(farenheit));
			else
				break;

		} while (true);
	}

}
