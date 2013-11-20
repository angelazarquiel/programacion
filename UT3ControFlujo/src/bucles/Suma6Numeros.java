package bucles;

import java.util.Scanner;

public class Suma6Numeros {

        public static void main(String[] args) {
         

                Scanner teclado = new Scanner(System.in);
                
                int n=0,suma=0;
                
                for(int i=1;i<7;i++){
                        System.out.println("Introduce un numero");
                        n = teclado.nextInt();
                        suma = suma + n;
                        
                }
                
                System.out.println("La suma de todos los números es: "+suma);
                
        }

}
