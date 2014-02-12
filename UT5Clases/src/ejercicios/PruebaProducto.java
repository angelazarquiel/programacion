package ejercicios;

public class PruebaProducto {

	public static void main(String[] args) {

       Producto p;
       
       p=new Producto(2345,200);
       
       p.setDescuento(20);
       
       System.out.println("Producto:" + p.getCodigo());
       System.out.println("\tPrecio:" + p.getPrecio());
       System.out.println("\tDto.  :" + p.getDescuento());
       System.out.println("\tPVF:" + p.getPrecioTotal());
       
       System.out.println("\nSi el precio es 160");
       System.out.println("\tPrecio: 160");
       System.out.println("\tPVF:" + p.getPrecioTotal(160));
       
       System.out.println("\nPongo precio final de 180");
       p.setPrecioTotal(180);
       System.out.println("\tPrecio:" + p.getPrecio());
       System.out.println("\tPVF:" + p.getPrecioTotal());
	}

}

