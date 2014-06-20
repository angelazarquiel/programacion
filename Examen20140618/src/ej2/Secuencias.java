package ej2;

public class Secuencias {
	
	public static int contarSecuencias(int[] nums) {
		  int secuencias=0;
		  boolean enSecuencia;
		  
		  if (nums.length<2) return 0;
		  
		  enSecuencia=false;
		  for(int i=1;i<nums.length;i++) {
			  // si dos seguidos son iguales y !secuencia
		    if (nums[i]==nums[i-1] && !enSecuencia) {
		      secuencias++;
		      enSecuencia=true;
		    }    // si dos distintos contiguos
		    else if (nums[i]!=nums[i-1])
		      enSecuencia=false;
		  }
		  return secuencias;
		}
	
	public static int contarSecuencias2(int[] nums) {
		  int secuencias=0;
		  
		  if (nums.length<2) return 0;
		  
		  for(int i=1;i<nums.length;i++) {
		    if (nums[i]==nums[i-1]) { // Si dos iguales -> secuencia
		      secuencias++;
		      while(i<nums.length && nums[i]==nums[i-1]) i++; // Consumir el resto de secuencia
		    }
		  }
		  return secuencias;
		}
	
	public static void main(String[] args) {
		assert contarSecuencias(new int[] {1, 2, 2, 3, 4, 4})==2;
		assert contarSecuencias(new int[] {1, 1, 2, 1, 1})==2;
		assert contarSecuencias(new int[] {1, 1, 1, 1, 1})==1;
		assert contarSecuencias(new int[] {})==0;
		assert contarSecuencias(new int[] {1, 2, 3})==0;
		assert contarSecuencias(new int[] {2, 2, 1, 1, 1, 2, 1, 1, 2, 2})==4;
		assert contarSecuencias(new int[] {0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})==4;
		assert contarSecuencias(new int[] {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})==5;
		assert contarSecuencias(new int[] {0, 0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2})==5;
	}

}
