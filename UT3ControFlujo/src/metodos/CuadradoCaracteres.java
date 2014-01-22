package metodos;

import java.util.Scanner;

public class CuadradoCaracteres {
        
        public static void cuadradoCaracteres ( int filas_columnas, char caracter ) {                
                                
                for ( int i = 0; i < filas_columnas; ++i ) {
                        
                        for ( int j = 0; j < filas_columnas; ++j ) {
                                
                                System.out.print(caracter);
                        }
                        
                        System.out.println();
                }
        }
        
        public static void main(String[] args) {

                int numFilasColumnas;        
                char caracter;
                String cadena;
                
                Scanner teclado = new Scanner(System.in);
                
                System.out.print("Dame el caracter: ");
                cadena=teclado.next();
                caracter =  cadena.charAt(0);
                
                do {
                        
                        System.out.print("Dame el número de filas y columnas [ > 0 ]: ");
                        numFilasColumnas = teclado.nextInt();                        
                        
                } while ( numFilasColumnas <= 0 );
                
                teclado.close();
                
                cuadradoCaracteres(numFilasColumnas, caracter);

        }

}