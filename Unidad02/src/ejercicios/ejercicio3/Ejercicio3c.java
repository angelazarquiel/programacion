package ejercicios.ejercicio3;

import java.util.Scanner;


/*
 * Ejercicio 3.
    Calculen el perímetro y área de un rectángulo dada su base y su altura.
    Calculen el perímetro y área de un círculo dado su radio.
    Calculen el volumen de una esfera dado su radio.
    Calculen el área de un rectángulo (alineado con los ejes x e y) dadas sus coordenadas x1,x2,y1,y2.
    Dados los catetos de un triángulo rectángulo, calcular su hipotenusa.

 * 
 */

public class Ejercicio3c {

	public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in );
        
        int radio;
        double volumen;
        //final double PI = Math.PI; 
                        
        System.out.print( "Introduzca el RADIO de la esfera (cm): ");
        
        radio = teclado.nextInt(); //asignación de lectura de teclado a radio
        
        teclado.close(); //cerramos introducción de datos por teclado
        
        volumen = (4 * Math.PI * Math.pow(radio, 3))/3;
        
        System.out.println( "------RESULTADOS------"); //imprime cabecera "Resultados"
        
        System.out.println( "Volumen: " + Math.round(volumen*100)/100.0);
	}

}
