package ejercicios.graficos;

import graphics.Color;
import graphics.Line;
import graphics.Canvas;
import graphics.Rectangle;
import graphics.Text;

public class Euribor1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Canvas pantalla;
		Rectangle barra1;	//Barras de cada mes
		Rectangle barra2;
		Rectangle barra3;
		Rectangle barra4;
		Rectangle barra5;
		Rectangle barra6;
		Rectangle barra7;
		Rectangle barra8;
		Rectangle barra9;
		Rectangle barra10;
		Rectangle barra11;
		Rectangle barra12;
		Line ejex; 			//lineas eje x y eje y	
		Line ejey;
		Text texto1; 		//numeros y meses del año
		Text texto2;
		Text texto3;
		Text texto4;
		Text enero;
		Text marzo;
		Text junio;
		Text agosto;
		Text octubre;
		Text diciembre;
		Text Euribor;
		
		
		Canvas.getInstance();		//para que aparezca la pantalla
		
		Euribor = new Text(500,25,"EURIBOR 2012");
		Euribor.draw();
		Euribor.setColor(Color.BLUE);
		
		ejex = new Line(80,400,1050,400);
		ejex.draw();
		ejey = new Line(80,400,80,0);
		ejey.draw();
		
		texto1 = new Text(40,20,"2.0");
		texto1.draw();
		
		texto2 = new Text(40,120,"1.5");
		texto2.draw();
		
		texto3 = new Text(40,220,"1.0");
		texto3.draw();
		
		texto4 = new Text(40,320,"0.5");
		texto4.draw();
	 
		enero = new Text(105,400,"Enero");
		enero.draw();
		
		marzo = new Text(270,400,"Marzo");
		marzo.draw();
		
		junio = new Text(430,400,"Mayo");
		junio.draw();
		
		agosto = new Text(590,400,"Julio");
		agosto.draw();
		
		octubre = new Text(735,400,"Septiembre");
		octubre.draw();
		
		octubre = new Text(895,400,"Noviembre");
		octubre.draw();
		
		barra1 = new Rectangle (100,50,50,350);
		Thread.sleep(100);
		barra1.draw();
		barra1.setColor(Color.BLUE);
		barra1.fill();
	
		barra2 = new Rectangle (180,100,50,300);
		Thread.sleep(100);
		barra2.draw();
		barra2.setColor(Color.BLUE);
		barra2.fill();
		
		barra3 = new Rectangle (260,130,50,270);
		Thread.sleep(100);
		barra3.draw();
		barra3.setColor(Color.BLUE);
		barra3.fill();
		
		barra4 = new Rectangle (340,150,50,250);
		Thread.sleep(100);
		barra4.draw();
		barra4.setColor(Color.BLUE);
		barra4.fill();
		
		barra5 = new Rectangle (420,170,50,230);
		Thread.sleep(100);
		barra5.draw();
		barra5.setColor(Color.BLUE);
		barra5.fill();
		
		barra6 = new Rectangle (500,180,50,220);
		Thread.sleep(100);
		barra6.draw();
		barra6.setColor(Color.BLUE);
		barra6.fill();
		
		barra7 = new Rectangle (580,240,50,160);
		Thread.sleep(100);
		barra7.draw();
		barra7.setColor(Color.BLUE);
		barra7.fill();
		
		barra8 = new Rectangle (660,250,50,150);
		Thread.sleep(100);
		barra8.draw();
		barra8.setColor(Color.BLUE);
		barra8.fill();
		
		barra9 = new Rectangle (740,260,50,140);
		Thread.sleep(100);
		barra9.draw();
		barra9.setColor(Color.BLUE);
		barra9.fill();
		
		barra10 = new Rectangle (820,270,50,130);
		Thread.sleep(100);
		barra10.draw();
		barra10.setColor(Color.BLUE);
		barra10.fill();

		barra11 = new Rectangle (900,330,50,70);
		Thread.sleep(100);
		barra11.draw();
		barra11.setColor(Color.BLUE);
		barra11.fill();
		
		barra12 = new Rectangle (980,340,50,60);
		Thread.sleep(100);
		barra12.draw();
		barra12.setColor(Color.BLUE);
		barra12.fill();
	}
}