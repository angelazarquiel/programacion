package ejemplos;

import java.util.Scanner;

public class BibliotecaPersonal {

	private Libro[] libros;
	private int num_libros;
	
	public BibliotecaPersonal(int max_libros) {
		libros=new Libro[max_libros];
		
		num_libros = 0;
	}
	
	public void añadirLibro(String nombre, String autor, String isbn) {
		Libro nuevoLibro;
		
		nuevoLibro = new Libro(nombre,autor,isbn);
		
		libros[num_libros] = nuevoLibro;
		num_libros++;
	}
	
	public String toString() {
		String cadena;
		
		cadena = "BibliotecaPersona: " + num_libros + " ejemplares\n";
		for(int i=0;i<num_libros;i++) {
			cadena = cadena + libros[i] + "\n"; 
		}
		
		return cadena;
	}
	
	public Libro getLibro(int orden) { 
		return libros[orden];
	}
	
	public int getNumLibros() {
		return num_libros;
	}

	
	private int mostrarMenu(){
		System.out.println("Biblioteca Personal");
		System.out.println("1. Listar libros");
		System.out.println("2. Añadir libro");
		System.out.println("3. Salir");
		System.out.println(" Opción: ");
		Scanner teclado=new Scanner(System.in);
		
		return teclado.nextInt();
	}
	
	public static void main(String[] args) {
		BibliotecaPersonal mibiblioteca;
		int respuesta;
		
		mibiblioteca=new BibliotecaPersonal(100);
		
		respuesta=mibiblioteca.mostrarMenu();
		while (respuesta<=2){
			//hacer lo que me diga
			
			respuesta = mibiblioteca.mostrarMenu();
		}

	}

}
