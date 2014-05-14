package ejercicios1.ClinicaVeterinaria;

import java.util.Arrays;


public class Reptiles extends Animales {

	private String[] alimentos;
	
	public Reptiles(Cliente dueño, String nombre,
			double peso, String fechaNac) {
		super(dueño, nombre, peso, fechaNac);
		this.alimentos=alimentos;
	}

	public String[] getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(String[] alimentos) {
		this.alimentos = alimentos;
	}

	@Override
	public String toString() {
		return super.toString() + "Reptiles [alimentos=" + Arrays.toString(alimentos) + "]";
	}
	
	

}
