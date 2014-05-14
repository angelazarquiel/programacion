package ejemplos;

import ejercicios1.*;

public class PolimorfismoPuntos {

	public static void main(String[] args) {
		PuntoP[] puntos;
		
		puntos=new PuntoP[3];
		
		puntos[0]=new PuntoP();
		
		PuntoP3D p=new PuntoP3D();
		p.setZ(34);
		
		puntos[1]=p;
		((PuntoP3D)puntos[1]).setZ(4);
		puntos[2]=new PuntoP();
		
		
		for(int i=0;i<3;i++) System.out.println(puntos[i]);
	}
	
}
