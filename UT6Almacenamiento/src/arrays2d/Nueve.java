package arrays2d;

import java.util.Arrays;

public class Nueve {

	public static void mostrar(double[][] matriz) {
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static double[][] crearUnitaria(int orden) {
		double[][] matriz;
		
		matriz=new double[orden][orden];
		
		for(int i=0;i<orden;i++)
			Arrays.fill(matriz[i], 0);
		
		for(int i=0;i<orden;i++)
			matriz[i][i]=1.0;
		
		return matriz;
	}
	
	public static void main(String[] args) {
		double[][] unitaria;
	
		unitaria=crearUnitaria(8);
		
		mostrar(unitaria);
	}
}
