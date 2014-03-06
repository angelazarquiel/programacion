package ejemplos;

import java.util.Arrays;

public class ArrayPersonas {

	Persona[] personas;
	
	public ArrayPersonas(Persona[] vector) {
		this.personas=Arrays.copyOf(vector,vector.length);
	}
	
	public static void main(String[] args) {
		
		
		ArrayPersonas miarray;
		
		Persona[] alumnos;
		alumnos= new Persona[10];
		alumnos[0]=new Persona();
		alumnos[0].nombre="Oscar";
		alumnos[1]=new Persona();
		alumnos[1].nombre="Luis";
		
		miarray=new ArrayPersonas(alumnos);
		
		alumnos[0].nombre="Oscar Mérida";

	}

}
