package ejercicios.graficos;

import graphics.*;

public class Coche2 {

	public static void main(String[] args) throws InterruptedException {
		//Creo los elementos del coche
		//Techo
		Rectangle techo,cuerpo;
		Ellipse rueda1,rueda2;
		Line carretera;
		Text texto;
		
		techo=new Rectangle(70,155,130-70,180-155);
		techo.setColor(Color.GRAY);
		techo.fill();
		
		//Cuerpo
		cuerpo=new Rectangle(40,180,170-40,210-180);
		cuerpo.setColor(Color.BLUE);
		cuerpo.fill();

		//Ruedas
		rueda1=new Ellipse(60,210,15,15);
		rueda1.setColor(Color.BLACK);
		rueda1.fill();

		rueda2=new Ellipse(145,210,15,15);
		rueda2.setColor(Color.BLACK);
		rueda2.fill();

		//Carretera
		carretera=new Line(0,222,750,222);
		carretera.draw();
		
		texto=new Text(200,50,"El famoso coche que pidió Angel en el DAW");
		texto.grow(50, 10);
		texto.draw();

		//Muevo el coche
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
		Thread.sleep(1000);
		techo.translate(10, 0);
		cuerpo.translate(10, 0);
		rueda1.translate(10, 0);
		rueda2.translate(10, 0);
	}

}
