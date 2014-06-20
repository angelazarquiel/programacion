package ej4;

public class Incidencia {

	public enum Estado {Abierta,Asignada,Cerrada};
	
	private long id;
	private String descripción;
	private Estado estado;
	
	public Incidencia(long id, String descripción) {
		this.id = id;
		this.descripción = descripción;
		this.estado = Estado.Abierta;
	}

	public long getId() {
		return id;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Incidencia (" + id + ") - "+estado+"\n\tDescripción:" + descripción;
	}
	
	public static void main(String[] args) {
	

	}

}
