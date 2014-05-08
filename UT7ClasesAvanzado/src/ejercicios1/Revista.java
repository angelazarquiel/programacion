package ejercicios1;

public class Revista extends Publicacion {
	private int numeros;

	public int getNumeros() {
		return numeros;
	}

	public void setNumeros(int numeros) {
		this.numeros = numeros;
	}
	
	public String toString() {
		return super.toString() + " " + this.numeros + " numeros por año"; 
	}
	
}
