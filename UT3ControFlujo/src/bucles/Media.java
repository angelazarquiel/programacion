package bucles;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        
        /*
         * Escribe un programa que pida tantos números como el usuario
         * del programa indique al principio.
         * El programa mostrará al final la media y si se ha insertado un número par.
         */
        
        
        
        Scanner teclado = new Scanner(System.in);
        
        int i,media=0,suma=0,n=0,total=0;
        boolean pares=false;
        
        System.out.println("¿Cuantos números quieres?");
        
        total=teclado.nextInt();
        for(i=total;i>0;i--){
                System.out.println("Introduce un numero");
                n=teclado.nextInt();
                suma = suma+n;
                //media = (media + suma)/2;
                if (n%2==0) pares=true;
        }
        
        System.out.println("la media es: " + (double)suma / (double)total);
        if (pares) System.out.println("Has utilizado nº pares.");
        
}
}
