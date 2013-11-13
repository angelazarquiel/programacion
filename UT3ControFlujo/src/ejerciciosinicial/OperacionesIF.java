package ejerciciosinicial;

import java.util.Scanner;

public class OperacionesIF {

	public static void main(String[] args) {
		
		
		int n1,n2;
		String respuesta;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame una operación en la forma: [numero operador numero]");
		System.out.println("Operadores: \n+-Sumar \n--Restar \n*-Multiplicar \n/-Dividir\n");
		
		n1= teclado.nextInt();
		respuesta = teclado.next();
		n2 = teclado.nextInt();
				
		if(respuesta.equals("+")){
			System.out.println("El resultado de la suma es: " +(n1+n2));
		} else if (respuesta.equals("-")){
			System.out.println("El resultado de la resta es: " +(n1-n2));
		} else if(respuesta.equals("*")){
			System.out.println("El resultado del producto es: " +(n1*n2));		
		}else if(respuesta.equals("/")){
			System.out.println("El resultado de la división es: " + (n1/n2));
		}else {
			System.out.println("Error, operación no disponible.");
		}
	}

}