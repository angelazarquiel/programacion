package ej4;

import java.util.Date;
import java.util.Locale;

public class Mejora extends Incidencia {

	private double realizadaAl;
	private Date fechaPrevista;
	
	public Mejora(long id, String descripción,Date fechaPrevista) {
		super(id, descripción);
		realizadaAl=0.0;
		setFechaPrevista(fechaPrevista);
	}
	
	public double getRealizadaAl() {
		return realizadaAl;
	}

	public void setRealizadaAl(double realizadaAl) {
		if (realizadaAl>100.0) realizadaAl=100.0;
		if (realizadaAl<0.0) realizadaAl=0.0;
		this.realizadaAl = realizadaAl;
	}

	public Date getFechaPrevista() {
		return fechaPrevista;
	}

	public void setFechaPrevista(Date fechaPrevista) {
		Date ahora = new Date();
		if (ahora.after(fechaPrevista)) fechaPrevista=ahora;
		this.fechaPrevista = fechaPrevista;
	}

	@Override
	public String toString() {
		return super.toString() + 
				String.format("\n\tTipo: Mejora\n\tFecha salida:%s\n\tRealizada: %.2f%%", fechaPrevista,realizadaAl);
	}
	
	public static void main(String[] args) {
		Mejora m;
		m=new Mejora(2345,"Creación función borrar",new Date());
		
		System.out.println(m);
	}

}
