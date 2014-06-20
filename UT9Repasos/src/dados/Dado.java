package dados;

public class Dado {

	private int valor;
	
	public Dado() {
		tirar();
	}
	
	public void tirar() {
		this.valor=(int)(Math.random()*6+1);
	}
	
	public int getValor() {
		return valor;
	}
	
	
	@Override
	public String toString() {
		return String.valueOf(valor);
		//return Integer.toString(valor);
		//return valor+"";
	}

	public static void main(String[] args) {
		
		Dado d=new Dado();
		
		d.tirar();
		
		System.out.println(d);
	}

}
