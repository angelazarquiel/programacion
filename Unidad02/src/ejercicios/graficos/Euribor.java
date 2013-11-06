package ejercicios.graficos;

import graphics.*;

public class Euribor {

	public static void main(String[] args) {
		
		double ratio_ancho,ratio_alto,base;
		
		ratio_ancho=500/1.7;
		ratio_alto=300/2;
		base=350;
		
		Line l1=new Line(0.1*ratio_ancho,base,1.6*ratio_ancho,base);
		l1.draw();

		Line l2=new Line(0.1*ratio_ancho,base,0.1*ratio_ancho,base-2*ratio_alto);
		l2.draw();

		Rectangle r1=new Rectangle(0.15*ratio_ancho,base-1.837*ratio_alto,0.1*ratio_ancho,1.837*ratio_alto);
		r1.setColor(Color.RED);
		r1.fill();
				
		Rectangle r2=new Rectangle(0.30*ratio_ancho,base-1.678*ratio_alto,0.1*ratio_ancho,1.678*ratio_alto);
		r2.setColor(Color.YELLOW);
		r2.fill();

		Rectangle r3=new Rectangle(0.45*ratio_ancho,base-1.499*ratio_alto,0.1*ratio_ancho,1.499*ratio_alto);
		r3.setColor(Color.MAGENTA);
		r3.fill();

		Rectangle r4=new Rectangle(0.6*ratio_ancho,base-1.368*ratio_alto,0.1*ratio_ancho,1.368*ratio_alto);
		r4.setColor(Color.GREEN);
		r4.fill();
		
		Rectangle r5=new Rectangle(0.75*ratio_ancho,base-1.266*ratio_alto,0.1*ratio_ancho,1.266*ratio_alto);
		r5.setColor(Color.PINK);
		r5.fill();

		Rectangle r6=new Rectangle(0.9*ratio_ancho,base-1.219*ratio_alto,0.1*ratio_ancho,1.219*ratio_alto);
		r6.setColor(Color.ORANGE);
		r6.fill();
		
		Rectangle r7=new Rectangle(1.05*ratio_ancho,base-1.061*ratio_alto,0.1*ratio_ancho,1.061*ratio_alto);
		r7.setColor(Color.BLUE);
		r7.fill();

		Rectangle r8=new Rectangle(1.2*ratio_ancho,base-0.877*ratio_alto,0.1*ratio_ancho,0.877*ratio_alto);
		r8.setColor(Color.LIGHT_GRAY);
		r8.fill();

		Rectangle r9=new Rectangle(1.35*ratio_ancho,base-0.74*ratio_alto,0.1*ratio_ancho,0.74*ratio_alto);
		r9.setColor(Color.GREEN);
		r9.fill();

		Rectangle r10=new Rectangle(1.5*ratio_ancho,base-0.65*ratio_alto,0.1*ratio_ancho,0.65*ratio_alto);
		r10.setColor(Color.BLACK);
		r10.fill();

		Text t=new Text(0.05*ratio_ancho,base-2.15*ratio_alto,"Euribor");
		t.draw();

		Text t2=new Text(1.5*ratio_ancho,base+0.05*ratio_alto,"Mes");
		t2.draw();

	}

}
