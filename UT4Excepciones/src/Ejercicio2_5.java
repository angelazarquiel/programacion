import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2_5 {
        
        private static Scanner teclado;
        
        public static double leerNumero() {
                
                teclado = new Scanner(System.in);
                double numero = 0;
                
                System.out.print("Introduzca un número [pulse * para finalizar]: ");
                
                try {
                        
                        numero = teclado.nextDouble();
                }
                
                catch ( InputMismatchException entradaInvalida ) {
                        
                        throw entradaInvalida;
                }
                
                return numero;
        }

        public static void main(String[] args) {

                double[] numeros = new double[40];
                int contadorNumeros = 0;
                String letraIntroducida = "";
                boolean continuarLeyendo = true;

                int i = 0;
                do {
                
                        try {
                                
                                for (; i < numeros.length; ++i ) {
                                
                                        numeros[i] = leerNumero();
                                        ++contadorNumeros;                                
                                }
                        }
                        
                        catch (InputMismatchException entradaInvalida ) {
                                
                                letraIntroducida = teclado.next();
                                
                                if (letraIntroducida.equals("*") && contadorNumeros == 0) {
                                        
                                        System.out.println("No ha introducido ningún número.");
                                        System.exit(-1);
                                
                                } else if (letraIntroducida.equals("*") && contadorNumeros > 0) {
                                        
                                        System.out.println("Fin de lectura. Números leídos: " + contadorNumeros);
                                        continuarLeyendo = false;
                                
                                } else {
                                        
                                        System.out.println("Debe introducir números. Inténtelo de nuevo.");
                                }        
                        }
                
                } while ( continuarLeyendo );
                
                double mayor = numeros[0];
                
                for ( int j = 1; j < contadorNumeros; ++j ) {
                                
                        if ( numeros[j] >= mayor ) mayor = numeros[j];                                        
                }
                        
                System.out.println("El MAYOR es: " + mayor );
        }

}