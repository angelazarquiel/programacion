package ejemplos;

public class PruebaEmpleado {

	
	public static void main(String []args) {
	
		Empleado emple1,emple2;
		String nombre1="Juan";
		
		emple1 = new Empleado(nombre1,"Cruz");
		emple2 = new  Empleado("Jose","Zarco");
		
		System.out.println("Empleado 1: " + emple1.getNombre());
		System.out.println(emple1.getDNI());
		emple2.setApellido2("García");
		emple2.setSueldoBase(1500);
		System.out.println(emple2.calculaSueldo(10,9));
	}
}
