package ejercicios;
/*
 * Crea la clase Coche con dos constructores. Uno no toma par�metros y el otro s�.
 * Los dos constructores inicializar�n los atributos marca y modelo de la clase.
 * Crea dos objetos (cada objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
 */
public class Coche22 {
	private String marca;
	private String modelo;
	
	
	public Coche22(){
		this.marca="sin marca";
		this.modelo="sin modelo";
	}
	
	public Coche22(String marca, String modelo){
		this.marca=marca;
		this.modelo=modelo;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}

	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
}
