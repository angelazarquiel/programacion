package ejercicios;

import ejercicios.conversores.Finanzas;

public class Ejercicio2_3Conversiones {

	public static void main(String[] args) {
		
		Finanzas conversion,conversion2;
		conversion=new Finanzas();
		
		System.out.println("500 Dolares a euros: "+conversion.dolaresToEuros(500)+" �.");
		System.out.println("500 Euros a dolares: "+conversion.eurosToDolares(500)+" $.");
		
		conversion2=new Finanzas(1.5);
		System.out.println("500 Dolares a euros: "+conversion2.dolaresToEuros(500)+" �.");
		System.out.println("500 Euros a dolares: "+conversion2.eurosToDolares(500)+" $.");

	}

}
