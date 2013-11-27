package arrays;

import java.util.Scanner;
import java.util.Arrays;


public class Ejemplo_Enteros {

        public static void main(String[] args) {
                int[] enteros;
                Scanner teclado;
                
                teclado = new Scanner(System.in);
                
                enteros = new int[10];
                
                for(int i=0;i<10;i++){
                        enteros[i]=teclado.nextInt();
                }
                
                //NO SABEMOS PORQUE SALE ESTE ERROR
                System.out.println(Arrays.toString(enteros));
                
                for(int i = 9; i > 0; i--)
                        System.out.println(" " + enteros [i]);
                
                teclado.close();

        }

}
