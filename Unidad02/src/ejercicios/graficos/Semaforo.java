package ejercicios.graficos;

import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;

public class Semaforo {

	public static void main(String[] args) {
		Rectangle caja, palo;
		Ellipse verde, ambar, rojo;
		int ancho,alto,centro_x,centro_y,radio_disco;
		
		//Inicializamos los valores de dibujo del semaforo
		ancho=150;
		alto=300;
		centro_x=300;
		centro_y=300;
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
