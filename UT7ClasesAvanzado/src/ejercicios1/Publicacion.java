package ejercicios1;

public class Publicacion {
	private String editor;
	private String fecha;
	
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return this.editor + " " + this.fecha;
	}
}
