package bucles;

import java.util.Scanner;

public class NumeroDistinto0 {

    public static void main(String[] args) {
        //Pedir números hasta que se inserte un 0.
        //Mostrar la cantidad de números leídos y el resultado de multiplicar todos ellos.
        
        Scanner teclado = new Scanner (System.in);
        int numero = 0;
        int contador=0;
        int resultado_multiplicacion =1;
        
        do {
                System.out.println ("Escribe numeros");
                numero = teclado.nextInt ();
                if (numero !=0 ) resultado_multiplicacion=numero*resultado_multiplicacion;
                
                contador++;
                
        } while (numero != 0);
        
        System.out.println ("Has introducido "+ (contador-1)+" numeros");
        if (contador>1) 
        	System.out.println ("El resultado de las multiplicaciones es: "+ resultado_multiplicacion);
}

}
