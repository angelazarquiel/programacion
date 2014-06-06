package elecciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Eleccion {
	private ArrayList<Candidatura> partidos;
	private ArrayList<Integer> votos;
	private int escaños;
	
	public Eleccion(ArrayList<Candidatura> partidos, int escaños) {
		this.partidos = partidos;
		this.escaños = escaños;
		this.votos=new ArrayList<Integer>();
		for(int i=0;i<partidos.size();i++)
			this.votos.add(0);
	}

	public void setVotos(String nombrePartido, int votos) {
		int encontrado=
				partidos.indexOf(new Candidatura(nombrePartido,null));
		
		if (encontrado>=0)
			this.votos.set(encontrado,votos);
	}
	
	public void mostrarEscaños() {
		// siguiendo la ley D'Hondt
		
		int[][] tabla;
		int[] numEscaños=new int[this.partidos.size()];
		int[] divisores=new int[this.partidos.size()];
		
		Arrays.fill(divisores, 1);
		
		tabla=new int[this.escaños+1][this.partidos.size()];
		
		for(int i=0;i<this.partidos.size();i++)
			tabla[0][i]=this.votos.get(i);
		
		for(int j=1;j<=this.escaños;j++){
			//encontramos máximo
			int m=maximo(tabla[j-1]);
			numEscaños[m]++;
			divisores[m]++;
			for(int i=0;i<this.partidos.size();i++) 
				tabla[j][i]=tabla[j-1][i];
			tabla[j][m]=tabla[0][m]/divisores[m];
		}
		
		for(int i=0;i<this.partidos.size();i++) {
			System.out.print(partidos.get(i).getNombrePartido());
			System.out.println(": "+votos.get(i)+" votos - " + numEscaños[i] +" escaños");
		}
		
	}
	
	private int maximo(int[] lista){
		int maximo=0;
		for(int i=1;i<lista.length;i++)
			if (lista[maximo]<lista[i])
				maximo=i;
		return maximo;
	}
	
	public static void main(String[] args) {
		Eleccion prueba;
		ArrayList<Candidatura> candidatos = new ArrayList<Candidatura>();
		
		candidatos.add(new Candidatura("Partido A",null));
		candidatos.add(new Candidatura("Partido B",null));
		candidatos.add(new Candidatura("Partido C",null));
		candidatos.add(new Candidatura("Partido D",null));
		candidatos.add(new Candidatura("Partido E",null));
		prueba=new Eleccion(candidatos,7);
		
		prueba.setVotos("Partido A", 340000);
		prueba.setVotos("Partido B", 280000);
		prueba.setVotos("Partido C", 160000);
		prueba.setVotos("Partido D", 60000);
		prueba.setVotos("Partido E", 15000);
		
		prueba.mostrarEscaños();
		 	 	 	 	
	}
}
