package ejercicios.conversores;

/*
 * Ejercicio 3. Realiza una clase Finanzas que convierta d�lares a euros y viceversa. 
 * Codifica los m�todos dolaresToEuros y eurosToDolares.
 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y d�lares. La clase tiene que tener:

	Un constructor finanzas que establecer� el cambio D�lar-Euro en 1.36.
	Un constructor finanzas(double), el cual permitir� configurar el cambio D�lar-Euro.
 */
public class Finanzas {
	public double cambio;
	
	
	public Finanzas(){
		this.cambio=1.36;
	}
	
	public Finanzas(double cambio){
		this.cambio=cambio;
	}
	
	public double dolaresToEuros(double dolares){
	
		return (1/cambio)*dolares;
	}
	
public double eurosToDolares(double euros){
		
		return cambio*euros;
	}
}
