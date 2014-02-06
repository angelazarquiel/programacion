package ejemplos;

public class Contador {
	private long acumulador=1;
	
	public long getContador() {
		return acumulador;
	}
	
	public void setContador(int acumulador) {
		this.acumulador=acumulador;
	}
	
	public void incrementar() {
		this.acumulador++;
	}
}
