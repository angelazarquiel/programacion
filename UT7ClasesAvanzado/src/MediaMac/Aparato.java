package MediaMac;

public class Aparato {

	//Almacena el n�mero de producto y n�mero de serie del aparato (cadenas de texto), 
	//su nombre, sistema operativo (�Android 4.1�, �iOS 6�, �Windows Phone 8�, etc) y precio base.
	
	private String numProducto;
	private String numSerie;
	private String nombre;
	private String SO;
	private double precioBase;
	
	public Aparato(String numProducto, String numSerie, String nombre, String so, double precioBase) {
		this.numProducto = numProducto;
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.SO = so;
		this.precioBase=precioBase;
	}
	public String getNumProducto() {
		return numProducto;
	}

	public void setNumProducto(String numProducto) {
		this.numProducto = numProducto;
	}

	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSO() {
		return SO;
	}
	
	public void setSO(String sO) {
		SO = sO;
	}
	
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	@Override
	public String toString() {
		return "Aparato: "
				+ "\nNombre-->	" + nombre 
				+ "\nSistema Operativo-->	" + SO 
				+ "\nNúmero de serie-->	" + numSerie
				+ "\nNúmero de Producto-->	" + numProducto
				+ "\nPrecio Base-->  " + String.format("%.2f",precioBase);
				
	}
	/*
	 Como el precio puede variar, la clase Aparato tendr� definir� los m�todos siguientes:
		precioPVP(). Devuelve el precio del art�culo, sum�ndole un 10% de m�rgen despu�s a�adiendo el IVA.
		precioPVPRebajado(double rebaja). Se le pasa una rebaja, en tanto por ciento y devolver� el precio 
		final rebajado.
	 */
	public  double precioPVP(){
		double iva = 1.21;
		double precioFinal=this.precioBase * 1.10 * iva;
		
		return precioFinal;
	}
	public double preciopPVPRebajado(double rebajaPorc){
		double rebajaNum = 1-(rebajaPorc/100) ;
		double precioFinal=precioPVP() * rebajaNum;
		
		return precioFinal;
	}
	
}
