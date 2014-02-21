package ejercicios;

public class Racional
{
   // Atributos
   private int numerador;
   private int denominador;

   // Constructores
   public Racional()
   {
      numerador = 1;
      denominador = 1;
   }

   public Racional( int pNumerator, int pDenominator )
   {
      numerador = pNumerator;
      denominador = pDenominator;
      simplifica();
   }

   // Métodos públicos
   public void suma( Racional otro )
   {
      int resultDenominador = denominador * otro.getDenominador();
      int resultNumerador = numerador * otro.getDenominador() +
         otro.getNumerador() * denominador;

      actualiza(resultNumerador, resultDenominador);
   }
   
   public void resta( Racional otro )
   {
      int resultDenominador = denominador * otro.getDenominador();
      int resultNumerador = numerador * otro.getDenominador() -
         otro.getNumerador() * denominador;

      actualiza(resultNumerador, resultDenominador);
   }
   
   public void multiplica( Racional otro )
   {
	   int resultDenominador = denominador * otro.denominador;
	   int resultNumerador = numerador * otro.numerador;
	   
	   actualiza(resultNumerador, resultDenominador);
   }
   
   public void divide( Racional otro )
   {
	   int resultDenominador = denominador * otro.numerador ;
	   int resultNumerador = numerador * otro.denominador;
      
	   actualiza(resultNumerador, resultDenominador);
   }
   
   public int getNumerador() {
	   return this.numerador;
   }
   
   public int getDenominador() {
	   return this.denominador;
   }

   public String toString()
   {
     return numerador + "/" + denominador;
   }

   public String toFloatString( )
   {
      double value = ( double ) numerador / denominador;
    
      return String.format( "%f", value ); // Double.toString(value);
   }
   
   // Métodos públicos de clase
   public static Racional suma( Racional uno, Racional dos )
   {
      int resultDenominador = uno.getDenominador() * dos.getDenominador();
      int resultNumerador = uno.getNumerador() * dos.getDenominador() +
         dos.getNumerador() * uno.getDenominador();
      
      return new Racional(resultNumerador,resultDenominador);
      
      /*
       * resultado = new Racional(uno.numerador,uno.denominador);
       * 
       * resultado.suma(dos);
       * 
       * return resultado;
       */
   }
   
   public static Racional resta( Racional uno, Racional dos )
   {
      int resultDenominador = uno.getDenominador() * dos.getDenominador();
      int resultNumerador = uno.getNumerador() * dos.getDenominador() -
         dos.getNumerador() * uno.getDenominador();
      
      return new Racional(resultNumerador,resultDenominador);
   }
    
   public static Racional  multiplica( Racional uno, Racional dos )
   {
	   int resultDenominador = uno.denominador * dos.denominador;
	   int resultNumerador = uno.numerador * dos.numerador;
	   
	   return new Racional(resultNumerador,resultDenominador);
   }
   
   public static Racional  divide(  Racional uno, Racional dos )
   {
	   int resultDenominador = uno.denominador * dos.numerador ;
	   int resultNumerador = uno.numerador * dos.denominador;
      
	   return new Racional(resultNumerador,resultDenominador);
   }
 
   // Métodos privados
   private void actualiza(int numerador, int denominador) {
	   this.numerador=numerador;
	   this.denominador=denominador;
	   
	   simplifica();
   }
   
   private void simplifica()
   {
      int mcd = 0;
      int mas_pequeño;

      if ( numerador < denominador )
    	  mas_pequeño = numerador;
      else
    	  mas_pequeño = denominador;

      for ( int divisor = mas_pequeño; divisor >= 2; divisor-- )
      {
         if ( numerador % divisor == 0 && denominador % divisor == 0 )
         {
            mcd = divisor;
            break;
         }
      }

      if ( mcd != 0 )
      {
         numerador /= mcd;
         denominador /= mcd;
      }
   }

}

