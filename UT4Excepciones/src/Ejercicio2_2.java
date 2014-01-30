	import java.util.InputMismatchException;
	import java.util.Scanner;

	public class Ejercicio2_2 {

		/*
		 * Escribe un programa que pida un double y un float. Si al pedir un número,
		 * el usuario inserta letras, se pedirá de nuevo ese dato. Una vez
		 * insertados, se visualizará el número más alto de los dos. Si son iguales
		 * se visualizará cualquiera de ellos. Se usará un método que pida un dato
		 * de tipo float. Dicho método controlará el error que se podría producir si
		 * se insertan letras, visualizando en este caso un mensaje de error. El
		 * main será el que se encargue de llamar de neuvo a este método si se
		 * insertan letras. De la misma forma se hará a la hora de pedir un dato de
		 * tipo double.
		 */
		static Scanner teclado;

		public static double numeroDouble() {
			double numeroD = 0;

			try {
				System.out
						.println("Inserte un número real con un máximo de 8 bytes: (tipo double)");
				numeroD = teclado.nextDouble();
			} catch (InputMismatchException e) {
				teclado.nextLine();
				System.out.println("Se ha producido un Error");
				throw e;
			}

			return numeroD;
		}

		public static float numeroFloat() {
			float numeroF = 0;
			try {
				System.out
						.println("Inserte un número real con un máximo de 4 bytes: (tipo float)");
				numeroF = teclado.nextFloat();
			} catch (InputMismatchException e) {
				System.out.println("Se ha producido un Error");
				teclado.nextLine();
				throw e;
			}

			return numeroF;
		}

		public static void main(String[] args) {

			teclado = new Scanner(System.in);

			double nD;
			float nF;
			double numeroMayor;
			boolean leidos;

			do {
				try {
					leidos=true;
					nD = numeroDouble();
					nF = numeroFloat();
					numeroMayor = Math.max(nD, nF);
					System.out.println("El número mayor de los introducidos es: "
							+ numeroMayor);
				} catch (InputMismatchException e) {
					leidos=false;
				}
			} while (!leidos);
		}

	}

