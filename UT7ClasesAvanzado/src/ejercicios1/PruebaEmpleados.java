package ejercicios1;

public class PruebaEmpleados {
  public static void main(String[] args) {
	//Empleado e=new Empleado();
	  
	EmpleadoAsalariado ea=new EmpleadoAsalariado();
	
	ea.setNombre("Antonio");
	ea.setOcupacion("Litigante");
	ea.setSalarioSemanal(300);
	
	System.out.println(ea.calculaSalarioSemanal());
	
  }
}
