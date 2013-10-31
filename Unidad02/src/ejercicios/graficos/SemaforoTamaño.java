package ejercicios.graficos;


import java.util.Scanner;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class SemaforoTamaño {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		int ancho,alto,centro_x,centro_y,radio_disco;
		
		//Inicializamos los valores de dibujo del semaforo
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Pixeles de ancho del semaforo?: ");
		ancho=teclado.nextInt();		
		
		alto=ancho*2;
		centro_x=ancho;
		centro_y=(int)(alto*0.66);
		radio_disco=ancho/2;

		caja = new Rectangle(centro_x-ancho/2, centro_y-alto/2, ancho, alto);
		caja.draw();

		palo = new Rectangle(centro_x-ancho/10, centro_y+alto/2, ancho/10*2,alto*1.5);
		palo.draw();

		palo.fill();

		verde = new Ellipse(centro_x-radio_disco/2, centro_y-radio_disco/2*3.5, radio_disco, radio_disco);
		verde.setColor(new Color(0, 200, 0));
		ambar = new Ellipse(centro_x-radio_disco/2, centro_y-radio_disco/2, radio_disco, radio_disco);
		ambar.setColor(new Color(225, 225, 20));
		rojo = new Ellipse(centro_x-radio_disco/2, centro_y+radio_disco/2*1.5, radio_disco, radio_disco);
		rojo.setColor(new Color(255, 0, 0));

		verde.fill();
		ambar.fill();
		rojo.fill();
	}
}
