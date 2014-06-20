package ej3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LineaLog {

	private static int lastid=0;
	private int id;
	private String hora;
	private String mensaje;
	
	public LineaLog(int identificador, String hora, String mensaje) {
		this.id=identificador;
		lastid=identificador;
		this.hora=hora;
		this.mensaje=mensaje;
	}
	
	public LineaLog(int identificador, String mensaje) {
		this(identificador,now(),mensaje);
	}
	
	public LineaLog(String mensaje) {
		this(++lastid,mensaje);
	}
	
	private static String now() {
		Date d=new Date();
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return df.format(d);
	}
	
	@Override
	public String toString() {
		
		return "#" + this.id + " - " + this.hora + " - " + this.mensaje;
	}
	
	public static long getLastid() {
		return lastid;
	}

	public long getId() {
		return id;
	}

	public String getHora() {
		return hora;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public static void main(String[] args) {
		LineaLog log,log2,log3;
		
		log=new LineaLog("Hola");
		log2=new LineaLog("Hola2");
		log3=new LineaLog("Hola3");
		
		System.out.println(log);
		System.out.println(log2);
		System.out.println(log3);

	}

}
