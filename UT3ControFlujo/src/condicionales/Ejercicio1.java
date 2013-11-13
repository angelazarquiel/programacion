package condicionales;

import java.util.Scanner;
public class Ejercicio1 {
//Crea un programa que tiene un numero oculto (del 1 al 10). El programa pregunta el número al jugador,
//si la adivina muestra un mensaje de éxito. Si no, muestra el error.
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                int numero;
                int oculto = 3;
                
                //oculto= (int) (Math.random()*10+1);
                
                System.out.println("Dime el número elegido: ");
                numero = teclado.nextInt();
                teclado.close();
                
                if (numero == oculto) {
                        System.out.println("Enhorabuena muchacho !!");
                }else{
                        System.out.println("Error, sigue intentándolo...");
                }
        }
}