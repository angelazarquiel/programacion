package ejemplos.graficos;

import graphics.Canvas;
import graphics.Color;
import graphics.Rectangle;



public class Graficos1 {

	public static void main(String[] args) throws InterruptedException {
		Canvas lienzo;
		Rectangle rectangulo;
		
		lienzo = Canvas.getInstance();
		
		rectangulo =  new Rectangle(10,10,50,100);
		
		rectangulo.draw();
		
		Thread.sleep(500);
		
		rectangulo.translate(250, 0);
		
		rectangulo.setColor(Color.ORANGE);
		rectangulo.fill();
		
		Thread.sleep(1000);
		
		Color gris;
		
		gris=new Color(200,200,200);
		rectangulo.setColor(gris);
		
		rectangulo = null;
		System.gc();
		lienzo.repaint();
		
	}

}
