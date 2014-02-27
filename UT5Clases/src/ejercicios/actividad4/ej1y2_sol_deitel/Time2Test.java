package ejercicios.actividad4.ej1y2_sol_deitel;


import java.util.Scanner;

public class Time2Test
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );
      
      Time2 time = new Time2(); // the Time2 object

      int choice = getMenuChoice();
      
      while ( choice != 5 )
      {
         switch ( choice )
         {
            case 1: // set hour
               System.out.print( "Enter Hours: " );
               int hours = input.nextInt();
               
               if ( !time.setHour( hours ) )
                  System.out.println( "Invalid hours." );
               
               break;
               
            case 2: // set minute
               System.out.print( "Enter Minutes: " );
               int minutes = input.nextInt();
               
               if ( !time.setMinute( minutes ) )
                  System.out.println( "Invalid minutes." );

               break;
            
            case 3: // set seconds
               System.out.print( "Enter Seconds: " );
               int seconds = input.nextInt();
               
               if ( !time.setSecond( seconds ) )
                  System.out.println( "Invalid seconds." );

               break;
               
            case 4: // add 1 second
               time.tick();               
               break;               
         } // end switch
         
         System.out.printf( "Hour: %d  Minute: %d  Second: %d\n",
            time.getHour(), time.getMinute(), time.getSecond() );
         System.out.printf( "Universal time: %s   Standard time: %s\n",
            time.toUniversalString(), time.toString() );

         choice = getMenuChoice();
      } // end while      
   } // end main

   // prints a menu and returns a value corresponding to the menu choice
   private static int getMenuChoice()
   {
      Scanner input = new Scanner( System.in );
      
      System.out.println( "1. Set Hour" );
      System.out.println( "2. Set Minute" );
      System.out.println( "3. Set Second" );
      System.out.println( "4. Add 1 second" );
      System.out.println( "5. Exit" );
      System.out.print( "Choice: " );
      
      return input.nextInt();
   } // end method getMenuChoice
} // end class Time2Test




/**************************************************************************
 * (C) Copyright 1992-2007 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
