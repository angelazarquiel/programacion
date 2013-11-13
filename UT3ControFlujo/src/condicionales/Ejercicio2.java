package condicionales;
import java.util.Scanner;
public class Ejercicio2 {
//Crea un programa que tiene una palabra oculta.
//El programa pregunta la contraseña al jugador, si la adivina muestra un mensaje de éxito. Si no, muestra el error.
        public static void main(String[] args) {
                Scanner teclado = new Scanner(System.in);
                String palabra;
                String oculto = "Filología";
                
                System.out.println("Dime la palabra elegida: ");
                palabra = teclado.nextLine();
                teclado.close();
                
                if (palabra.equals(oculto)) {
                        System.out.println("Enhorabuena muchacho !!");
                }else{
                        System.out.println("Error, sigue intentándolo...");
                }

        }

}
