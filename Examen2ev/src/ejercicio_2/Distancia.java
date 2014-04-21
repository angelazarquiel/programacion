package ejercicio_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Distancia {

	public static double distancia(double x1,double y1, double x2,double y2) {
		return Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y1-y2, 2));
	}
	
	public static double[] leerPunto() {
		double[] coordenadas={0,0};
		Scanner teclado=new Scanner(System.in);
		boolean terminado=false;
		
		while (!terminado) {
			System.out.print("Introduce las coordenadas del punto (dos números reales): ");
			try {
				coordenadas[0]=teclado.nextDouble();
				coordenadas[1]=teclado.nextDouble();
				terminado=true;
			} catch (InputMismatchException ime) {
				System.out.println("No has introducido dos números válidos, vuelve a intentarlo");
				teclado.next();
			}
		}
			
		return coordenadas;
	}
	
	public static void main(String[] args) {
		double[] punto1=null,punto2=null;

		
		try {
			punto1=leerPunto();
			punto2=leerPunto();
		} catch (Exception e) {// pueden generarse otras excepciones no tratadas en el interior del método leerPunto()
			System.out.println("Se ha producido un error al intentar leer desde teclado");
			System.exit(-1);
		}
		
		double d=distancia(punto1[0],punto1[1],punto2[0],punto2[1]);
		
		System.out.printf("La distancia entre los dos puntos es: %.2f", d);
		
	}

}
