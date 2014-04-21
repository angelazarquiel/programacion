package simulacro2ev;
import java.util.Arrays;


public class ArrayOrdenado {

	int[] numeros;
	
	private void ordenar() {
		Arrays.sort(numeros);
	}
	
	public ArrayOrdenado(int[] vector) {
		numeros=Arrays.copyOf(vector, vector.length);
		ordenar();
	}
	
	public ArrayOrdenado(int tamaño) {
		numeros=new int[tamaño];
		Arrays.fill(numeros, 0);
	}
	
	public int getElemento(int x) {
		return numeros[x];
	}
	
	public void setElemento(int x, int elto) {
		numeros[x]=elto;
		ordenar();
	}
	
	public String toString() {
		return Arrays.toString(numeros);
	}
	
	public static void main(String[] args) {
		ArrayOrdenado x;
		
		x=new ArrayOrdenado(100);
		
		for(int i=0;i<100;i++) {
			x.setElemento(0,(int)(Math.random()*100+1));
		}
		
		System.out.println(x);
	}

}
