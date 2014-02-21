package ejercicios;

import java.util.Scanner;


// prueba de Racionales usando métodos genéricos
public class RacionalPrueba2
{
   public static void main( String args[] )
   {
      
      Racional numero1;
      Racional numero2 = null;

      System.out.println("Introduce primera fracción");
      numero1=leerFracción();
      
      int opción = mostrarMenú();
      
      while ( opción != 5 )
      {
    	
         System.out.println("Introduce fracción para operar");
         numero2=leerFracción();
         
         switch ( opción )
         {
            case 1:
               numero1.suma(numero2);
               System.out.printf( "a + b = %s = %s\n",
                  numero1.toString(),
                  numero1.toFloatString() );
               break;

            case 2:
               numero1.resta(numero2);
               System.out.printf( "a - b = %s = %s\n",
            		   numero1.toString(),
            		   numero1.toFloatString() );
               break;

            case 3:
            	numero1.multiplica(numero2 );
               System.out.printf( "a * b = %s = %s\n",
            		   numero1.toString(),
            		   numero1.toFloatString() );
               break;
               
            case 4:
               numero1 = Racional.divide(numero1, numero2 );
               System.out.printf( "a / b = %s = %s\n",
            		   numero1.toString(),
            		   numero1.toFloatString() );
               break;
         }
         
         opción = mostrarMenú();
      }
   }
   
   private static Racional leerFracción() {
	   Scanner teclado = new Scanner( System.in );
	   
	   int numerador,denominador;
	   System.out.print( "Introduce numerador: " );
	   numerador = teclado.nextInt();
	   System.out.print( "Introduce denominador: " );
	   denominador = teclado.nextInt();
	   
	   return  new Racional( numerador, denominador );
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
