package ej2;

import java.util.ArrayList;
import java.util.List;

public class JuegoBingo {
	private static Bingo bingo;
	private static List<Cartón> cartones;
	
	public static void main(String[] args) {
		bingo=new Bingo();
		cartones=new ArrayList<Cartón>();
		boolean hanCantado=false;
		
		for(int i=1;i<=3;i++){
			Cartón c=new Cartón();
			c.rellenaAleatorio();
			cartones.add(c);
		}
		
		while (bingo.quedanBolas() && !hanCantado) {
			int bola=bingo.saca();
			for(int i=0;i<3;i++) {
				cartones.get(i).marca(bola);
				if (cartones.get(i).esBingo()) {	
				   System.out.println("Han cantado Bingo!!");
				   System.out.println("\tel cartón ganador en el "+(i+1));
				   hanCantado=true;
				}
			}
		}
		for(int j=0;j<3;j++)System.out.println(cartones.get(j));
	}
}
