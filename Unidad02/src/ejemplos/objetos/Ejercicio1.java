package ejemplos.objetos;

public class Ejercicio1 {

	public static void main(String[] args) {
		Alumno alu1,alu2;
		
		alu1= new Alumno();
		alu2= new Alumno();
		
		alu1.setNombre("Angel");
		System.out.println(alu1.getNombre());
	
		alu2.setNombre("Juan");
		alu2.setEdad(25);
		System.out.println(alu2.getNombre()+" "+alu2.getEdad());

	}

}
