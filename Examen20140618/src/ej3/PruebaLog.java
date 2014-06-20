package ej3;

public class PruebaLog {

	public static void main(String[] args) throws InterruptedException {
		Log log=new Log();
		
		log.add("Comenzando el programa");
		Thread.sleep(1000);
		log.add("Aviso: la red no responde");
		Thread.sleep(1800);
		log.add("Cerrando");
		
		System.out.println(log);

	}

}
