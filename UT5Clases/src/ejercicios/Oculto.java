package ejercicios;

public class Oculto {
	// Atributos
	public int oculto;

	// Constructores
	public Oculto() {
		this.oculto = (int) (Math.random() * 100 + 1);
	}

	public Oculto(int min, int max) {
		this.oculto = (int) (Math.random() * (max - min + 1) + min);
	}

	// Métodos
	public int pruebaNumero(int n) {
		int respuesta = 0;
		
		if (n < this.oculto) {
			respuesta = +1;
		} else if (n > this.oculto) {
			respuesta = -1;
		}
		return respuesta;
	}

	public int getOculto() {
		return oculto;
	}
}
