package ejercicios;

public class Temperatura {
	// Atributos
	private float grados;

	// Metodos para obtener la temperatura en ºC y para cambiar su valor en ºC.
	public float getCelsius() {
		return this.grados;
	}

	public void setCelsius(float grados) {
		this.grados = grados;
	}

	// Metodos para obtener la temperatura o cambiar su valor en Fahrenheit.
	public float getFahrenheit() {
		float fah = (float) ((grados * 1.8) + 32);
		//fah=celsiusToFarenheit(grados);
		return fah;
	}

	public void setFahrenheit(float grados) {
		this.grados = (float) ((grados - 32) / 1.8);
		// this.grados = farenheitToCelsius(grados);
	}

	public static float celsiusToFarenheit(float temp) {
		return (float) ((temp * 1.8) + 32);
	}

	public static float farenheitToCelsius(float temp) {
		return (float) ((temp - 32) / 1.8);
	}
}