package ejercicios;

public class PruebaCoche {

	public static void main(String[] args) {
		// Crear un coche y probar acelerar/frenar
		Coche coche1;
		coche1=new Coche();
		coche1.acelera(100);
		System.out.println("Velocidad: "+coche1.getVelocidad());
		coche1.frena(15);
		System.out.print("Velocidad: "+coche1.getVelocidad());
	}
}
