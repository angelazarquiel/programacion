package ejercicio_3;


 /*
  a)	La clase Película tiene los atributos Nombre y Genero de una película. Una película puede tener varios géneros 
(ej. “C.Ficción y Drama”). Tendrá los siguientes métodos:
•	Un método constructor que recibe el nombre de la película. También el constructor por defecto.
•	Métodos getNombre() y setNombre(String nombre) para manejar el nombre y el método setGenero(String genero) que añade un género a la película o getGeneros() que devuelve una cadena de la forma “genero, género,…”.
•	Método toString() que generará la cadena de forma “Nombre (Generos)”, p.e.  “Elysium (Ciencia ficción, Acción)”.



*/
public class Pelicula {
	
	private String nombre;
	private String[] genero;
	private final int MAX_GENEROS=6;
	private int numGeneros; 
	
	public Pelicula(){
		this.nombre = "Desconocido";
		this.genero=new String[MAX_GENEROS];
		this.numGeneros=0;
	}
	
	public Pelicula(String nombre){
		this.nombre = nombre;
		this.genero = new String[MAX_GENEROS];
		this.numGeneros=0;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		String cadena;
		cadena="(";
		for(int i=0;i<numGeneros;i++) {
			cadena=cadena+genero[i];
			if (i<numGeneros-1)
				cadena=cadena+", ";
		}
		return cadena+")";
	}

	public void setGenero(String genero) {
		this.genero[numGeneros++] = genero;
	}
	
	public String toString() {
		return this.nombre + " " + getGenero();
	}
	
	//PRUEBAS
	public static void main(String[] args) {
		Pelicula peli;
		
		peli=new Pelicula("Ellysium");
		
		peli.setGenero("C.Ficción");
		System.out.println(peli);
		peli.setGenero("Acción");
		System.out.println(peli);
	}
}