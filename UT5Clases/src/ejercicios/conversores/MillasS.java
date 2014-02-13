package ejercicios.conversores;


/*
 * Ejercicio 1. Crea una clase con un método estático millasAMetros que toma como parámetro de entrada un valor en millas marinas y las convierte a metros.
Una vez tengas este método escribe otro millasAKilometros que realice la misma conversión, pero esta vez exprese el resultado en kilómetros.
          Nota:1 milla marina equivale a 1852 metros.               
 * 
 */
public class MillasS {
	 private static final double metrosXmilla=1852;
	 	 
	 public static double millasAMetros(double millas) {
		 return millas*metrosXmilla;
	 }
	 
	 public static double millasAKilometros(double millas) {
		 return millas*metrosXmilla/1000.0;
	 }
}
