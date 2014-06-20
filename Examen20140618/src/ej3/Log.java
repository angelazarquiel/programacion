package ej3;

import java.util.ArrayList;

public class Log {

	private ArrayList<LineaLog> lineas;
	
	public Log() {
		this.lineas = new ArrayList<LineaLog>();
	}

	public void add(String mensaje) {
		lineas.add(new LineaLog(mensaje));
	}

	@Override
	public String toString() {
		StringBuffer sb=new StringBuffer();
		for(LineaLog l:lineas)
			sb.append(l+"\n");
		return sb.toString();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Log log=new Log();
		
		log.add("Primera línea");
		Thread.sleep(1000);
		log.add("Segunda línea");
		Thread.sleep(1800);
		log.add("Tercera línea");
		
		System.out.println(log);
	}

}
