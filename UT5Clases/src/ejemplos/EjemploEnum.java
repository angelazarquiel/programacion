package ejemplos;

public class EjemploEnum {

	public static final int  ROJO = 1;
	public static final int  VERDE = 2;
	
	public static final int  LUNES = 1;
	public static final int  MARTES = 2;
	public static final int  MIERCOLES = 3;
	public static final int  JUEVES = 4;
	public static final int  VIERNES = 5;
	public static final int  SABADO = 6;
	public static final int  DOMINGO = 7;
	
	public enum DiaSemana { LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO }
	
	public static void main(String[] args) {
		
		int color;
		
		color = ROJO;
		
		int dia;
		
		dia=JUEVES;
		
		switch (dia) {
		  case JUEVES:
		  	System.out.println("Comenzamos con programación");
		}
		
		// CON ENUM	
		DiaSemana midia;
		
		midia=DiaSemana.LUNES;
		//midia=7;

	}

}
