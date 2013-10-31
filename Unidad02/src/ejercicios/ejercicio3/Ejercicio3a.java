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

public class Ejercicio3a {

	public static void main(String[] args) {
        Scanner teclado = new Scanner( System.in ); //creamos objeto teclado para introducción de datos
        
        double base,
                altura,
                perimetro,
                area; //declaración de variables enteras
        
        System.out.print( "-- Cáculo de perímetro y área (en cm) --");
        System.out.print( "Introduzca la BASE del rectángulo (número positivo): "); //petición de base
        
        base = teclado.nextDouble(); //asignación de lectura de teclado a base
        
        System.out.print( "Introduzca la ALTURA del rectángulo (número positivo): "); //petición de altura
        
        altura = teclado.nextDouble(); //asignación de lectura de teclado a altura
        
        teclado.close(); //cerramos entradas por teclado.
        
        perimetro = 2 * base + 2 * altura; //asignación del resultado de la operación a perímetro
        area = base * altura; //asignamos el resultado de la operación a area
        
        System.out.println( "------RESULTADOS------"); //impresión de cabecera "Resultados"
        
        System.out.println( "Perímetro: " + perimetro + " cm"); //imprime perimetro
        System.out.println( "Área: " + area + " cm2"); //imprime area
	
	}

}
