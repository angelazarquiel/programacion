package metodos;

import java.util.Scanner;

public class Minimo3 {
        
        public static float minimoDeTres ( float num1, float num2, float num3 ) {
                
                float minimo;
                
                minimo = Math.min( Math.min(num1, num2), num3 );        
                
                return minimo;
        }
        
        public static int minimoDeTres ( int num1, int num2, int num3 ) {
            
            int minimo;
            
            minimo = Math.min( Math.min(num1, num2), num3 );        
            
            return minimo;
        }

        public static void main(String[] args) {
                
                float num1;
                float num2;
                float num3;
                
                Scanner teclado = new Scanner(System.in);
                
                System.out.print("Dame 3 números float: ");
                num1 = teclado.nextFloat();
                num2 = teclado.nextFloat();
                num3 = teclado.nextFloat();
                
                teclado.close();
                
                System.out.printf("El mínimo de [ %f, %f, %f ] = %f", num1, num2, num3,
                                minimoDeTres(num1, num2, num3));
        }

}
