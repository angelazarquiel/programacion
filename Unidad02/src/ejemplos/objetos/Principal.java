package ejemplos.objetos;

public class Principal {

	public static void main(String[] args) {
		Clase1 objeto,objeto2;
		
		objeto = new Clase1();
		objeto2 = new Clase1();
		objeto.mensaje();

		
		Alumno juan,pedro;
		
		juan= new Alumno();
		pedro = new Alumno();
		
		juan.setNombre("Juan");;
		
		System.out.println(juan.getNombre());
	}

}
