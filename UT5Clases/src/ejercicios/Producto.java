package ejercicios;

public class Producto {
    private int codigo;
    private float precio;
    private float descuento;
    
    Producto(int codigo){
    	this.codigo=codigo;
    }
    
    Producto(int codigo,float precio){
    	this.codigo=codigo;
    	this.precio=precio;
    }
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		if (precio>0) this.precio = precio;
		else this.precio=0;
	}
	
	public float getDescuento() {
		return descuento;
	}
	
	public void setDescuento(float descuento) {
		if (descuento<0) 
			this.descuento=0;
		else if (descuento>100) 
			this.descuento=100;
		else this.descuento=descuento;
	}
    
	public float getPrecioTotal(){
	  return precio-precio*descuento/100;
	}
	
	// Establece el precio final teniendo en cuenta el precio dado y el descuento aplicable
	public void setPrecioTotal(float precio_final){
		  this.precio=precio_final/(1-(float)descuento/100);
	}
	
	public float getPrecioTotal(float nuevoPrecio) {
		return nuevoPrecio-nuevoPrecio*descuento/100;
	}
	
	
}
