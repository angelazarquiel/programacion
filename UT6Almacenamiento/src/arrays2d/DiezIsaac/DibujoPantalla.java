package arrays2d.DiezIsaac;
import java.util.Scanner;

public class DibujoPantalla {

	public static void main(String[] args) {
	Scanner teclado=new Scanner(System.in);
	int x, y, lado, ladoX, ladoY;
		
	Pantalla pantalla=new Pantalla(24, 24);
	Menu menu=new Menu();
	menu.añadirOpcion("Elegir caracter");
	menu.añadirOpcion("Cuadrdado");
	menu.añadirOpcion("Rectangulo");
	menu.añadirOpcion("Triangulo");
	menu.añadirSalir("Salir");
	menu.obtenerOpcionElegidaUsuario();
	
	if(menu.getOpcion()==1){
		char caracter;
		System.out.println("Que caracter quieres?: ");
		caracter=teclado.next().charAt(0);
		pantalla.setCaracter(caracter);
		menu.obtenerOpcionElegidaUsuario();
	}
	
	switch (menu.getOpcion()){
	case 2:
		System.out.println("Coordenadas eje x: ");
		x=teclado.nextInt();
		System.out.println("Coordenadas eje y: ");
		y=teclado.nextInt();
		System.out.println("Tamaño del lado: ");
		lado=teclado.nextInt();
		pantalla.cuadrado(x, y, lado); pantalla.dibujar(); break;
	case 3:
		System.out.println("Coordenadas eje x: ");
		x=teclado.nextInt();
		System.out.println("Coordenadas eje y: ");
		y=teclado.nextInt();
		System.out.println("Tamaño del lado horizontal: ");
		ladoX=teclado.nextInt();
		System.out.println("Tamaño del lado vertical: ");
		ladoY=teclado.nextInt();
		pantalla.rectangulo(x, y, ladoX, ladoY); pantalla.dibujar(); break;
	case 4:
		System.out.println("Coordenadas eje x: ");
		x=teclado.nextInt();
		System.out.println("Coordenadas eje y: ");
		y=teclado.nextInt();
		System.out.println("Tamaño del lado: ");
		lado=teclado.nextInt();
		pantalla.triangulo(x, y, lado); pantalla.dibujar(); break;
	}

	}
}
