package ejercicios1.ClinicaVeterinaria;

public class Perro extends Mamifero {

	private int numID;
	private boolean peligroso;
	
	public Perro(Cliente dueño, String nombre,
			double peso, String fechaNac, String raza, int numID, boolean peligroso) {
		super(dueño, nombre, peso, fechaNac, raza);
		this.numID=numID;
		this.peligroso=peligroso;
	}

}
