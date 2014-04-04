package simulacro2ev;

public class ElementoMatriz {
	private int fila,columna;
	private double valor;
	
	public ElementoMatriz(int columna, int fila, double valor) {
		this.fila=fila;
		this.columna=columna;
		this.valor=valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	@Override
	public String toString() {
		return "(" + columna + ", " + fila + ", " + valor + ")";
	}
	
}
