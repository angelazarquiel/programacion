package ejemplos;


enum Tallas {XS,S,M,L,XL}

class Cliente {
	public String nombre;
	public Tallas talla;
	
}


public class ClientesConTalla {
	
	public static void main(String[] args) {
		Cliente[] clientes={new Cliente(),new Cliente()};
		
		clientes[0].nombre = "Juan";
		clientes[0].talla = Tallas.XL;
		
		clientes[1].nombre = "Pedro";
		clientes[1].talla = Tallas.L;		

		System.out.println("Dos clientes creados:");
		for(Cliente c:clientes) {
			System.out.println("\t" +c.nombre + " " + c.talla);
		}

	}

}
