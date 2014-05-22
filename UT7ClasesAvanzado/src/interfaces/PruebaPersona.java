package interfaces;

public class PruebaPersona {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.pedirDatos();
		cliente.visualizarDatos();
		
		Empleado empleado = new Empleado();
		
		empleado.pedirDatos();
		empleado.visualizarDatos();
		
		System.out.println(empleado.dato);
		//empleado.dato="Empresa2";
	}

}