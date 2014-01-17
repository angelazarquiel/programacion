package metodos;

import java.util.Scanner;

public class CuadradoAsteriscosB {
        
        public static String cuadradoAsteriscos ( int filas_columnas ) {                
                                
        	    String resultado="";
        	    
                for ( int i = 0; i < filas_columnas; ++i ) {
                        
                        for ( int j = 0; j < filas_columnas; ++j ) {
                                resultado=resultado+"*";
                        }
                        
                        resultado=resultado+"\n";
                }
                
                return resultado;
        }
        
        public static void main(String[] args) {

                int numFilasColumnas;        
                
                Scanner teclado = new Scanner(System.in);
                
                do {
                        
                        System.out.print("Dame el número de filas y columnas [ > 0 ]: ");
                        numFilasColumnas = teclado.nextInt();                        
                        
                } while ( numFilasColumnas <= 0 );
                
                teclado.close();
                
                String cuadrado = cuadradoAsteriscos(numFilasColumnas);
                
                System.out.println(cuadrado);

        }

}