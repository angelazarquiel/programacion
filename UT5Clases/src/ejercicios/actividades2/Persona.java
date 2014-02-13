package ejercicios.actividades2;

public class Persona {

	private String nombre;
	private String dni;
	
	public Persona(String nombre,String dni) {
		this.nombre=nombre;
		this.dni=dni;
	}
	
	public void imprime() {
		System.out.println(nombre + " (" +dni+ ")");
	}
	
	public static void main(String[] args) {
		Persona pepe;
		
		pepe=new Persona("Pepe","0005667");

		pepe.imprime();
		
	}
	

}
