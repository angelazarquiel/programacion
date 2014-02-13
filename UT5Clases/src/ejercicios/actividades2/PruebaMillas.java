package ejercicios.actividades2;

import ejercicios.conversores.*;

public class PruebaMillas {

	public static void main(String[] args) {
		
		Millas conversor;
		
		conversor=new Millas();
		
		System.out.println("200 millas son:" +
				conversor.millasAMetros(200));

	}

}
