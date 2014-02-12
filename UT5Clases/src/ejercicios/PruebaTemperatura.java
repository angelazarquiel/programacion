package ejercicios;

public class PruebaTemperatura {

	public static void main(String[] args) {
		// Genera objeto de la clase temperatura
		Temperatura termometro1 = new Temperatura();
		// Prueba de los metodos, 20ºC = 68 F
		termometro1.setCelsius(20);
		System.out.println("getCelsius = " + termometro1.getCelsius());
		System.out.println("getFahrenheit = " + termometro1.getFahrenheit());
		termometro1.setFahrenheit(20);
		System.out.println("getCelsius(20F) = " + termometro1.getCelsius());
		System.out.println("getFahrenheit(20F) = "
				+ termometro1.getFahrenheit());
		// prueba métodos estáticos
		System.out.println("100º celsius son:"
				+ Temperatura.celsiusToFarenheit(100) + " grados Farenheit");
	}
}
