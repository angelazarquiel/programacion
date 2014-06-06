package primitiva;

import java.util.Arrays;
import java.util.Date;

public class Primitiva {
	
	private Date fecha;
	private double recaudacion;
	private int[] combinaciónGanadora;
	// private Map<Premios,Integer> aciertos;
	private int[] aciertos;
	public enum Premios {
	    TRES, CUATRO, CINCO, CINCO_Y_COMPLEMENTARIO, SEIS }

	public Primitiva(Date fecha, double recaudacion, int[] ganadora) {

		compruebaValido(ganadora,7);
		
		this.fecha = fecha;
		this.recaudacion = recaudacion;
		this.combinaciónGanadora = ganadora;
		Arrays.sort(this.combinaciónGanadora);
		this.aciertos = new int[5];
		
	}

	private void compruebaValido(int[] ganadora,int numeros) {
		int i = 0;
		
		if (ganadora.length!=numeros) 
			throw new IllegalArgumentException("La combinación ganadora no tiene "+numeros+" elementos");
		
		while(ganadora.length>i){
			if(ganadora[i]<1 || ganadora[i] > 49){
				throw new IllegalArgumentException("Números no permitidos");
			}
			i++;
		}
		
		for(int j=0;j<ganadora.length;j++){
			for(int k=j+1;k<ganadora.length;k++){
				if(ganadora[j]==ganadora[k]){
					throw new IllegalArgumentException("Números repetidos");
				}
			}
		}
	}
	
	
	public void compruebaAciertos(int[] jugada){
		
		compruebaValido(jugada, 6);
		
		int acertados = 0;
		boolean complementario = false;
		for(Integer numero:jugada){
			int indice=Arrays.binarySearch(this.combinaciónGanadora, numero);
			if(indice==6){
				complementario = true;
			} else if (indice>=0){
				acertados++;
			}
		}
		switch (acertados) {
		case 3:
			this.aciertos[Premios.TRES.ordinal()]++;
			break;
			
		case 4:
			this.aciertos[Premios.CUATRO.ordinal()]++;
			break;
			
		case 5:
			if(complementario){
				this.aciertos[Premios.CINCO_Y_COMPLEMENTARIO.ordinal()]++;
			}else{
				this.aciertos[Premios.CINCO.ordinal()]++;
			}
			break;
		
		case 6:
			this.aciertos[Premios.SEIS.ordinal()]++;
			break;
		}
		
	}
	
	public void compruebaMultiple(int[] jugadaMultiple){
		compruebaAciertos(jugadaMultiple);
	}
	
	public void muestraPremios(){
		System.out.println("Resultados: ");
		System.out.println(" Recaudado: " + recaudacion);
		System.out.println(" 3 Aciertos: " + aciertos[Premios.TRES.ordinal()]);
		System.out.println(" 4 Aciertos: " + aciertos[Premios.CUATRO.ordinal()]);
		System.out.println(" 5 Aciertos: " + aciertos[Premios.CINCO.ordinal()]);
		System.out.println(" 5 Aciertos + complementario: " + aciertos[Premios.CINCO_Y_COMPLEMENTARIO.ordinal()]);
		System.out.println(" 6 Aciertos: " + aciertos[Premios.SEIS.ordinal()]);
	}

	@Override
	public String toString() {
		return "Primitiva [fecha=" + fecha + ", recaudacion=" + recaudacion
				+ ", ganadora=" + combinaciónGanadora + ", aciertos=" + aciertos + "]";
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getRecaudacion() {
		return recaudacion;
	}

	public void setRecaudacion(double recaudacion) {
		this.recaudacion = recaudacion;
	}

	public int[] getGanadora() {
		return combinaciónGanadora;
	}

	public int[] getAciertos() {
		return aciertos;
	}

}

