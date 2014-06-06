package elecciones;

import java.util.List;

public class Candidatura {

	private String nombrePartido;
	private List<String> candidatos;
	
	public Candidatura(String nombrePartido, List<String> candidatos) {
		this.nombrePartido = nombrePartido;
		this.candidatos = candidatos;
	}
	
	public String getNombrePartido() {
		return nombrePartido;
	}

	public void setNombrePartido(String nombrePartido) {
		this.nombrePartido = nombrePartido;
	}

	public List<String> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<String> candidatos) {
		this.candidatos = candidatos;
	}
	
	public void addCandidato(String candidato) {
		this.candidatos.add(candidato);
	}

	@Override
	public String toString() {
		StringBuilder papeleta;
		
		papeleta=new StringBuilder(nombrePartido);
		papeleta.append("\n\n");
		for(int i=1;i<=candidatos.size();i++){
			papeleta.append(i+". ");
			papeleta.append(candidatos.get(i-1));
		}
				
		return papeleta.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nombrePartido == null) ? 0 : nombrePartido.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatura other = (Candidatura) obj;
		if (nombrePartido == null) {
			if (other.nombrePartido != null)
				return false;
		} else if (!nombrePartido.equals(other.nombrePartido))
			return false;
		return true;
	}

	public static void main(String[] args) {
		

	}


}
