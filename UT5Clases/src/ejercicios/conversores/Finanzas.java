package finales.conversores;

/*
 * Ejercicio 3. Realiza una clase Finanzas que convierta dólares a euros y viceversa. 
 * Codifica los métodos dolaresToEuros y eurosToDolares.
 * Prueba que dicha clase funciona correctamente haciendo conversiones entre euros y dólares. La clase tiene que tener:

	Un constructor finanzas que establecerá el cambio Dólar-Euro en 1.36.
	Un constructor finanzas(double), el cual permitirá configurar el cambio Dólar-Euro.
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
