package ej4;

public interface Postal {
	public double COSTE_MINIMO=2.30;
	public void enviar(String direcci�n);
	public boolean entregado();
	public double portes(); 
}
