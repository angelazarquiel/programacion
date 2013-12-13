package metodos;

public class Ejemplo3 {

	public static void main(String[] args) {
		
		
		int minimo,maximo;
		
		minimo=1;
		maximo=3;
		
		for(int i=0;i<100;i++) {
			int aleatorio = devolverAleatorio(minimo,maximo);
			
			System.out.println(aleatorio);
			if (aleatorio<minimo || aleatorio>maximo)
				System.out.print("getAleatorio se ha ido de rango!!");
		}
	}
	
	public static int devolverAleatorio(int min, int max) {
		// (int)(Math.random() *((max - min) + 1)) + min;
		int aleatorio;
		
		aleatorio =(int)(Math.random() *((max - min) + 1)) + min;
		
		return aleatorio;
	}
	
	

}




