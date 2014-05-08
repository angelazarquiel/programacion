package ejemplos;

public class Jefe extends Empleado {
	private double complemento;
	private String departamento;
	
	public Jefe(String pnombre, double psueldo, double pcomplemento) {
		super(pnombre, psueldo);
		//super();
		
		this.complemento=pcomplemento;
	}
	
	public double getSueldo() {
		double sueldo_total;

		sueldo_total= super.getSueldo() + this.complemento;
		
		return sueldo_total;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Jefe jefe=new Jefe("Pedro",1000.0,500.0);
	}
	
	
}


