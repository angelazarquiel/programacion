package interfaces;


public class Cuenta implements Remunerada{
	//Atributos
	private String nombre, cuenta;
	private double saldo, tipo;
	//Accesadores - Getters & Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	//Constructores
	public Cuenta(String nombre, String cuenta) {
		this.nombre = nombre;
		this.cuenta = cuenta;
		this.saldo = 0;
		this.tipo = 0;
	}
	//Métodos
	public double estado() {
		return saldo;
	}
	
	public void ingreso(double cantidad) {
		saldo += cantidad;
	}
	public void reintegro(double cantidad) {
		saldo -= cantidad;
	}
	@Override
	public void asignarTipoInteres(double tipo) {
		this.tipo = tipo;
	}
	@Override
	public double obtenerTipoInteres() {
		return tipo;
	}
	@Override
	public double intereses(int dias) {
		return ((saldo*(tipo/100))/365)*(double)dias;
	}
	
}