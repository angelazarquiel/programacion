package bucles;


import graphics.Color;
import graphics.Ellipse;
import graphics.Rectangle;


public class EjemploGraficos {

	public static void main(String[] args) throws InterruptedException {
		Ellipse pelota;
		Rectangle tablero;
		Color color;
		int movimiento_x,movimiento_y;
		
		pelota = new Ellipse(200,200,40,40);
		color =  new Color((int)(Math.random()*256),
				(int)(Math.random()*256),
				(int)(Math.random()*256));
		
		tablero= new Rectangle(0,0,400,400);
		tablero.draw();
		
		pelota.setColor(color);
		pelota.fill();
		// (int)(Math.random() * (max-min+1)) + min
		movimiento_x=(int)(Math.random() * (5-(-5)+1) ) -5;
		movimiento_y=(int)(Math.random() * 11) -5;
		if (movimiento_x==0) movimiento_x++; 
		if (movimiento_y==0) movimiento_y++;
		while(true)
		{
			pelota.translate(movimiento_x, movimiento_y);
			if ((pelota.getX()+40)>400 || pelota.getX()<0) movimiento_x=-movimiento_x;
			if ((pelota.getY()+40)>400 || pelota.getY()<0) movimiento_y=-movimiento_y;
			Thread.sleep(20);
		}
	}
}



