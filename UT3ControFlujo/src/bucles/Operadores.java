package bucles;

import java.util.Scanner;

public class Operadores {

		public static void main(String[] args) {
			
			
			int n1=0,n2=0;
			String operador;
			boolean continuar=true;
			boolean primera = true;

			Scanner teclado = new Scanner(System.in);
			
			
			do {
				if (primera){
				  System.out.println("Dame una operación en la forma: [numero operador numero]");
				  System.out.println("Operadores: \n+-Sumar \n--Restar \n*-Multiplicar \n/-Dividir\n");
				
				  n1= teclado.nextInt();
				  operador = teclado.next();
				  n2 = teclado.nextInt();
				  primera = false;
				} else {
					System.out.println("Dame otro operador para " + n1 + " y " + n2);
					operador = teclado.next();
				}
				
				switch (operador) {
					case "+":
						System.out.println("El resultado de la suma es: " +(n1+n2));
						break;
					case "-":
						System.out.println("El resultado de la resta es: " +(n1-n2));
						break;
					case "*":
						System.out.println("El resultado del producto es: " +(n1*n2));
						break;
					case "/":
						System.out.println("El resultado de la división es: " + (n1/n2));
						break;
					default:
						System.out.println("Error, operación no disponible.");
						continuar=false;
				}
			} while (continuar);
		}

	}
