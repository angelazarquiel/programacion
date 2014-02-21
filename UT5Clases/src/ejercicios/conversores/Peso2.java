package ejercicios.conversores;

public class Peso2 {

	/*
	 * Ejercicio 6. Crea la clase peso, la cual tendr� las siguientes caracter�sticas:

	Deber� tener un atributo donde se almacene el peso de un objeto en kilogramos.
	En el constructor se le pasar� el peso y la medida en la qu� se ha tomado �Lb� para libras, �Li� para lingotes,
		�Oz� para onzas, �P� para peniques, �K� para kilos, �G� para gramos y �Q� para quintales).
	Deber� tener los siguientes m�todos:
	getLibras. Devuelve el peso en libras.
	getLingotes. Devuelve el peso en lingotes.
	getPeso. Devuelve el peso en la medida que se pase como par�metro 
		(�Lb' para libras, �Li� para lingotes, �Oz� para onzas, �P� para peniques, �K' para kilos, �G� para gramos y �Q� para quintales).
	Para la realizaci�n del ejercicio toma como referencia los siguientes datos:
	 	1 Libra = 16 onzas = 453 gramos. 1 Lingote = 32,17 libras = 14,59 kg.
	 	1 Onza = 0,0625 libras = 28,35 gramos. 1 Penique = 0,05 onzas = 1,55 gramos. 1 Quintal = 100 libras = 43,3 kg.
	 */
	
	// peso en kilos
	private double peso;
	
	public Peso2(double peso, String unidad) {
		this.peso = peso * factorConversión(unidad);
	}
	
	private double factorConversión(String unidad) {
		double factor;
		
		switch (unidad) {
			case "lb": factor=453/1000.0;break;
			case "li": factor=14.59; break;
			case "oz": factor=(28.35/1000); break;
			case "p": factor=(1.55/1000); break;
			case "k": factor=1; break;
			case "g": factor=1000.0; break;
			case "q": factor=43.3; break;
			default:  factor=1;
		}
		return factor;
	}
	
	public double getLibras() {
		return peso/factorConversión("lb");
	}
	
	public double getLingotes() {
		return peso/factorConversión("li");
	}
	
	public double getPeso(String medida) {
		return peso/factorConversión(medida);
	}
	
	public static void main(String[] args) {
		Peso2 camion;
		camion = new Peso2(3000, "li");
		
		System.out.println("Peso del camión en medida inicial: "
				+" "+camion.getPeso("k")+" kg.");
		
		System.out.println("Peso del camión en kilos inicialmente: "
				+camion.getPeso("oz")+" oz.");
		
		System.out.println("Peso del camión en libras: "+camion.getLibras()+".");
		System.out.println("Peso del camión en lingotes: "+camion.getLingotes()+".");

	}

}
