package bucles;

import java.util.Scanner;

public class CincoFrases {

    public static void main(String[] args) {
            
            Scanner teclado = new Scanner(System.in);
            
            String a="";       
            
            for(int i=0;i<5;i++){
                    System.out.println("\nEscribe una frase");
                    a = teclado.nextLine();
                    System.out.println("\n"+a);        
            }
    }
}
