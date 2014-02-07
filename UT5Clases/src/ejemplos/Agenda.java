package ejemplos;

public class Agenda {

	public static void main(String[] args) {
		
		Contacto[] listin;
		
		listin = new Contacto[10];
		
		listin[0] = new Contacto("Contacto1","Apellido1","1111111");
		listin[1] = new Contacto("Contacto2","Apellido2","2222222");
		listin[2] = new Contacto("Contacto3","Apellido3","3333333");
		
		
		for(int i=0;i<3;i++)
			System.out.println(listin[i].getNombre() + ": " + listin[i].getTelMovil());
	
		
		
	}

}
