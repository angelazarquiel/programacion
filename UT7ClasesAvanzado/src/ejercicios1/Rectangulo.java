package ejercicios1;

import java.util.Scanner;

public class Rectangulo extends Cuadrado {

	private int largo;
	

	public Rectangulo(int ancho, int largo) {
		super(ancho);

		if (largo > 0) {
			this.largo = largo;
		} else {
			this.largo = LADO_PREDEFINIDO;
		}
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int perimetro() {
		// P = 2· a + 2· b
		int perimetro;
		return perimetro = (2 * getAncho()) + (2 * largo);
	}

	public int area() {
		// A= a · b
		int area;
		return area = getAncho() * largo;
	}

	public void horizontalVertical() {

		if (getAncho() > largo) {
			System.out.println("El rectángulo es horizontal");
		} else {
			System.out.println("El rectángulo es vertical");
		}
	}
	
	public boolean esHorizontal() {

		if (getAncho() > largo) {
			return true;
		} else {
			return false;
		}
	}

	public void dibujar() {
		dibujar(getAncho(),largo);
	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.println("\nPor favor introduzca el ancho y largo: ");
		Rectangulo r1 = new Rectangulo(entrada.nextInt(), entrada.nextInt());

		r1.dibujar();

	}

}
