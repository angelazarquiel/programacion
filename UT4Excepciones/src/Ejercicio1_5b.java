import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1_5b {

	static Scanner teclado;
	
	public static int leerEdad() {
		boolean hayDatosErroneos;
		int edad=0;
		
		hayDatosErroneos=true;
		do {                        
            
            try {                                
                    
                    System.out.print("Introduzca Edad de Alumno nº1: ");                                
                    edad = teclado.nextInt();
                    hayDatosErroneos = false;
            }
            catch ( InputMismatchException entradaInvalida ) {
                    
                    System.out.println("Error al escribir la edad. Inténtelo de nuevo.");
                    teclado.nextLine();
            }
    
		} while ( hayDatosErroneos );
		
		return edad;
	}
	
	public static void main(String[] args) {
        
        String nomAlumno1;
        String nomAlumno2;
        int edadAlumno1 = 0;
        int edadAlumno2 = 0;
        float altAlumno1 = 0f;
        float altAlumno2 = 0f;                
        boolean hayDatosErroneos;
        
        teclado = new Scanner(System.in);
        
        hayDatosErroneos = true;
        
        System.out.print("Introduzca Nombre de Alumno nº1: ");                                
        nomAlumno1 = teclado.next();
        
        edadAlumno1 = leerEdad();
        
        hayDatosErroneos = true;
        
        do {                        
                
                try {                                
                        
                        System.out.print("Introduzca Altura de Alumno nº1: ");                                
                        altAlumno1 = teclado.nextFloat();
                        hayDatosErroneos = false;
                }                        
                
                catch ( InputMismatchException entradaInvalida ) {
                        
                        System.out.println("Error al escribir la altura. Inténtelo de nuevo.");
                        teclado.nextLine();
                }
        
        } while ( hayDatosErroneos );
        
        System.out.print("Introduzca Nombre de Alumno nº2: ");                                
        nomAlumno2 = teclado.next();
        
        edadAlumno2 = leerEdad();
        
        
        hayDatosErroneos = true;
        
        do {                        
                
                try {                                
                        
                        System.out.print("Introduzca Altura de Alumno nº2: ");                                
                        altAlumno2 = teclado.nextFloat();
                        hayDatosErroneos = false;
                }                        
                
                catch ( InputMismatchException entradaInvalida ) {
                        
                        System.out.println("Error al escribir la altura. Inténtelo de nuevo.");
                        teclado.nextLine();
                }
        
        } while ( hayDatosErroneos );
        
        teclado.close();
        
        int mayor = Math.max(edadAlumno1, edadAlumno2);
        
        System.out.printf("\n%10s%10s%10s%10s\n", "NOMBRE", "EDAD", "ALTURA", "MAYOR");
        System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno1, edadAlumno1, altAlumno1,
                        edadAlumno1 == mayor ? "X" : "");
        System.out.printf("\n%10s%10d%10.2f%10s\n", nomAlumno2, edadAlumno2, altAlumno2,
                        edadAlumno2 == mayor ? "X" : "");     

	}
}