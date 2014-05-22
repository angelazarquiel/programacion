package interfaces;

import java.util.ArrayList;
import java.util.Scanner;


public class Banco {
	//Atributos
	private static String nombre, cuenta;
	private static double cantidad, tipo;
	private static int dias;
	
	public static void main(String[] args) {
		Menu menu;
		String[] opciones={"Nueva Cuenta", "Salir"};
		int opcion;
		Scanner entrada = new Scanner(System.in);
		
		Menu menu2;
		String[] opciones2={"Estado", "Ingreso", "Reintegro", "Asignar tipo de interés", 
				"Obtener tipo de interés", "Aplicar tipo de interés", "Salir"};
		
		menu = new Menu(opciones, 2);
		menu.setTitulo("Cuenta Bancaria 0.4");
		menu2 = new Menu(opciones2, 7);
		menu2.setTitulo("Cuenta Bancaria 0.4");
		
		do{
			opcion=menu.mostrar();
			switch(opcion){
			case 1:
				System.out.println("Nombre del propietario:");
				nombre = entrada.nextLine();
				System.out.println("Número de cuenta:");
				cuenta = entrada.nextLine();
				Cuenta miCuenta = new Cuenta(nombre, cuenta);
				int opcion2;
				do{
					opcion2=menu2.mostrar();
					switch(opcion2){
					case 1:
						System.out.println("Estado de la cuenta:");
						System.out.println(miCuenta.estado());
						break;
					case 2:
						System.out.println("Cantidad a ingresar:");
						cantidad = entrada.nextDouble();
						miCuenta.ingreso(cantidad);
						break;
					case 3:
						System.out.println("Cantidad a sacar:");
						cantidad = entrada.nextDouble();
						miCuenta.reintegro(cantidad);
						break;
					case 4:
						System.out.println("Tipo de interés a asignar:");
						tipo = entrada.nextDouble();
						miCuenta.asignarTipoInteres(tipo);
						break;
					case 5:
						System.out.println("Tipo de interés:");
						System.out.println(miCuenta.obtenerTipoInteres()+"%");
						break;
					case 6:
						System.out.println("Dias que quieres aplicar el tipo de interés:");
						dias = entrada.nextInt();
						System.out.println("Resultado de aplicar el tipo de interés:");
						System.out.printf("Intereses: %.3f\n", miCuenta.intereses(dias));
						break;
					}
				}while(opcion2<7);
				break;
			}
		}while(opcion<2);

	}

}