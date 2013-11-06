package ejercicios.objetos;

import javax.swing.JOptionPane;

public class EjemplosEjercicio3 {

	public static void main(String[] args) {

		Alumno alumno1;
		
		JOptionPane.showMessageDialog(null, "La edad media de los alumnos es 23");
		
		alumno1=new Alumno();
		
		alumno1.setNombre(
				JOptionPane.showInputDialog( "¿Cómo se llama el alumno 1?" ));
		String cadena;
		
		cadena="23";
		
		int edad=Integer.parseInt(cadena); 
	}
}










