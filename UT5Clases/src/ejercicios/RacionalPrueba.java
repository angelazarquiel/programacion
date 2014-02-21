package ejercicios;

import java.util.Scanner;


// prueba de Racionales usando métodos estáticos
public class RacionalPrueba
{
   public static void main( String args[] )
   {
      Scanner teclado = new Scanner( System.in );
      
      int numerador;
      int denominator;
      Racional numero1;
      Racional numero2;
      Racional resultado;

      // read first fraction
      System.out.print( "Introduce numerador 1: " );
      numerador = teclado.nextInt();
      System.out.print( "Introduce denominador 1: " );
      denominator = teclado.nextInt();
      numero1 = new Racional( numerador, denominator );
      
      // read second fraction
      System.out.print( "Introduce numerador 2: " );
      numerador = teclado.nextInt();
      System.out.print( "Introduce denominador 2: " );
      denominator = teclado.nextInt();
      numero2 = new Racional( numerador, denominator );

      int opción = mostrarMenú();
      
      while ( opción != 5 )
      {
         switch ( opción )
         {
            case 1:
               resultado = Racional.suma(numero1,numero2);
               System.out.printf( "a + b = %s = %s\n",
                  resultado.toString(),
                  resultado.toFloatString() );
               break;

            case 2:
               resultado = Racional.resta(numero1,numero2);
               System.out.printf( "a - b = %s = %s\n",
                  resultado.toString(),
                  resultado.toFloatString() );
               break;

            case 3:
               resultado = Racional.multiplica(numero1, numero2 );
               System.out.printf( "a * b = %s = %s\n",
                  resultado.toString(),
                  resultado.toFloatString() );
               break;
               
            case 4:
               resultado = Racional.divide(numero1, numero2 );
               System.out.printf( "a / b = %s = %s\n",
                  resultado.toString(),
                  resultado.toFloatString() );
               break;
         }
         
         opción = mostrarMenú();
      }
   }
   
   
   private static int mostrarMenú()
   {
      Scanner input = new Scanner( System.in );
      
      System.out.println( "1. Sumar" );
      System.out.println( "2. Restar" );
      System.out.println( "3. Multiplicar" );
      System.out.println( "4. Dividir" );
      System.out.println( "5. Salir" );
      System.out.print( "Tu elección: " );
      
      return input.nextInt();
   }
}
