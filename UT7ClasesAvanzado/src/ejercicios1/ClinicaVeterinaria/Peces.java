package ejercicios1.ClinicaVeterinaria;

public class Peces extends Animales {

	private int numPeces;
	private boolean tropicales;//si es false (Agua Fr�a)
	
	public Peces(Cliente dueño, String nombre,
			double peso, String fechaNac,int numPeces, boolean tropicales) {
		super(dueño, nombre, peso, fechaNac);
		this.numPeces=numPeces;
		this.tropicales=tropicales;
	}

}
