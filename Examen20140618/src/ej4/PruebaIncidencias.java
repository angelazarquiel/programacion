package ej4;

import java.util.ArrayList;
import java.util.Date;

import ej4.Incidencia.Estado;

public class PruebaIncidencias {

	public static void main(String[] args) {
		ArrayList<Incidencia> incidencias;
		Menu menu;
		String[] opciones={"Nueva","Listado","Resumen","Salir"};
		boolean salir=false;
		
		incidencias=new ArrayList<Incidencia>();
		menu=new Menu(opciones, 4);
		menu.setTitulo("Gestor de Incidencias");
		
		while (!salir) {
			int res=menu.mostrar();
			switch (res) {
				case 1:
					incidencias.add(pedirIncidencia());
					break;
				case 2:
					mostrar(incidencias);
					break;
				case 3:
					resumen(incidencias);
					break;
				case 4:
					salir=true;
					break;
			}
		}

	}

	private static Incidencia pedirIncidencia() {
		Incidencia i;
		
		if (Math.random()>0.5)
		
			i=new Mejora((long)(Math.random()*10000),"Creación de una nueva funcionalidad",new Date());
		else
			i=new Defecto((long)(Math.random()*10000),"Creación de una nueva funcionalidad","1.0.1");
		
		i.setEstado(Math.random()>0.3?Estado.Asignada:Estado.Cerrada);
		
		return i;
	}

	private static void resumen(ArrayList<Incidencia> incidencias) {
		System.out.println("Existe un total de " + incidencias.size() + " incidencias.");
		int[] defectos={0,0},mejoras={0,0};
		
		for(Incidencia i:incidencias) {
			//if (i.getClass().getName().equals("Mejora"))
			if (i instanceof Mejora)
				if (i.getEstado()==Incidencia.Estado.Cerrada)
					mejoras[1]++;
				else
					mejoras[0]++;
			else
				if (i.getEstado()==Incidencia.Estado.Cerrada)
					defectos[1]++;
				else
					defectos[0]++;
		}
		
		System.out.println("Total mejoras:" +(mejoras[0]+mejoras[1])+"("+mejoras[0]+" abiertas)");
		System.out.println("Total defectos:" +(defectos[0]+defectos[1])+"("+defectos[0]+" abiertos)");
		
	}

	private static void mostrar(ArrayList<Incidencia> incidencias) {

		System.out.println("Listado de Incidencias\n");
		for(Incidencia i:incidencias) {
			System.out.println(i);
		}
		
	}

}
