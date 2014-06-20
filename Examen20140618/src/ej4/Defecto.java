package ej4;

import java.util.ArrayList;

public class Defecto extends Incidencia{

	private String versión;
	private ArrayList<String> archivosAfectados;
	
	public Defecto(long id, String descripción, String versión) {
		super(id, descripción);
		this.versión=versión;
		archivosAfectados=new ArrayList<String>();
	}
	
	public String getVersión() {
		return versión;
	}

	public void setVersión(String versión) {
		this.versión = versión;
	}

	public ArrayList<String> getArchivosAfectados() {
		return archivosAfectados;
	}

	public void addArchivoAfectado(String archivoAfectado) {
		this.archivosAfectados.add(archivoAfectado);
	}

	public void delArchivoAfectado(String archivoNoAfectado) {
		this.archivosAfectados.remove(archivoNoAfectado);
	}

	@Override
	public String toString() {
		String result;
		result= super.toString();
		result+=String.format("\n\tTipo: Defecto\n\tVersión afectada:%s", this.versión);
		result+="\n\tArchivos afectados:";
		for(String s:this.archivosAfectados)
			result+="\n\t\t"+s;
		return result;
	}
	
	public static void main(String[] args) {
		Defecto d;
		
		d=new Defecto(2334, "Error al crear una nueva línea sin id en constuctor", "1.0.1");
		
		d.addArchivoAfectado("ej3/LineaLog.java");
		d.addArchivoAfectado("ej3/Log.java");

		System.out.println(d);
	}

}
