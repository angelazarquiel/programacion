package ejercicios.actividad4;

public class SumaComplejosSinMetodos {

	private static double aleatorio10() {
		return Math.random() *(11); 
	}
	
	
	public static void main(String[] args) {
	
		Complejo vector[];
		
		vector=new Complejo[40];
		
		for(int i=0;i<vector.length;i++) {
			vector[i]=new Complejo(aleatorio10(),aleatorio10());
		}
			
		Complejo sumatorio=new Complejo();
		
		for(int i=0;i<vector.length;i++) sumatorio.suma(vector[i]);
		
		System.out.println("Sumatorio: " + sumatorio);
	}

}



