package ejercicio_3;

import java.util.Arrays;

public class Cine {
	
	private String nombre;
	private Pelicula[] cartelera;
	private int numPeliculas=0;
	
	public Cine(String nombre, int numPeliculas) {
		this.nombre=nombre;
		this.cartelera=new Pelicula[numPeliculas];
		this.numPeliculas=0;
	}
	
	//Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//getPeliculas() que devuelve un array con las películas en cartelera,
	public Pelicula[] getPeliculas() {
		return Arrays.copyOf(this.cartelera,this.numPeliculas);
	}

//addPelícula(Película p ) que añade una película a la cartelera y 
	public void addPelicula(Pelicula p) {
		this.cartelera[this.numPeliculas++]=p;
	}
	
// delPelícula(String nombre) que borra la película que se llame como el nombre que se pasa por parámetro.
	public void delPelicula(String nombre) {
		for(int i=0;i<this.numPeliculas;i++)
		{
			if (this.cartelera[i].getNombre().equals(nombre)) {
				for(int j=i;j<this.numPeliculas-1;j++)
					this.cartelera[j]=this.cartelera[j+1];
				this.numPeliculas--;
				break;
			}
		}
	}
	
	//PRUEBAS
	public static void main(String[] args) {
		Cine cine;
		
		cine=new Cine("Pepito",6);
		Pelicula p1,p2;
		p1=new Pelicula("Peli 1");
		p2=new Pelicula("Peli 2");
		p1.setGenero("Drama");
		p2.setGenero("Aventuras");
		p2.setGenero("Ficción");
		cine.addPelicula(p1);
		cine.addPelicula(p2);
		
		System.out.println(Arrays.toString(cine.getPeliculas()));
		
		cine.delPelicula("Peli 2");
		
		System.out.println(Arrays.toString(cine.getPeliculas()));
	}

}
