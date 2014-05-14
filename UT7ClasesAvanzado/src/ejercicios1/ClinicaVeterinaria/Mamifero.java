package ejercicios1.ClinicaVeterinaria;


public class Mamifero extends Animales {

	private String raza;
	
	public Mamifero(Cliente dueño, String nombre,double peso, 
					String fechaNac, String raza) {
		super(dueño, nombre, peso, fechaNac);
		this.raza=raza;
	}

	@Override
	public String toString() {
		return super.toString() +  " Mamifero [raza=" + raza + "]";
	}
	

}
