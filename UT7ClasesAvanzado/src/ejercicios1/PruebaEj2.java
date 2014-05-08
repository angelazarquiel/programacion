package ejercicios1;

public class PruebaEj2 {

	public static void main(String[] args) {
		Publicacion pub;
		Revista revista;
		Libro milibro;

		pub=new Publicacion();
		revista=new Revista();
		milibro=new Libro();
		
		pub.setFecha("3/7/2012");
		pub.setEditor("Rojo Editores");
		
		revista.setEditor("Azul Editores");
		revista.setFecha("30/11/2011");
		revista.setNumeros(2);
		
		milibro.setEditor("Azul Editores");
		milibro.setFecha("30/11/2011");
		milibro.setISBN("1234567890");
		milibro.setAutor("A. Cañete");
		
		System.out.println("publicación:" + pub);
		System.out.println("revista:" + revista);
		System.out.println("libro:" + milibro);
	}

}
