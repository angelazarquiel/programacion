package ejercicios;

public class Ejercicio2_2Concesionario {

	public static void main(String[] args) {
		
		Coche22 coche1,coche2;
		coche1=new Coche22();
		coche2=new Coche22("Ford","Fiesta");
		
		System.out.println("Coche 1: Marca=> "+coche1.getMarca()+". Modelo=> "+coche1.getModelo()+".");

		coche1.setMarca("Toyota");
		coche1.setModelo("Corola");
		System.out.println("Coche 1: Marca=> "+coche1.getMarca()+". Modelo=> "+coche1.getModelo()+".");
		
		System.out.println("Coche 2: Marca=> "+coche2.getMarca()+". Modelo=> "+coche2.getModelo()+".");
	}

}
