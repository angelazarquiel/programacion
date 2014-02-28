package ejercicios.actividad4;

/*Crea la clase FechaYHora. La clase utiliza la clase Hora definida en el ejercicio 1,
y la clase Fecha del ejercicio anterior, ya que queremos que almacene tanto la fecha como la hora. 
Crea un nuevo método siguienteHora que incrementa la hora pero que también llame al métodosiguienteDía 
si es necesario porque se avanza un día. Crea el método aCadena (toString()) que muestre la fecha y 
la hora de forma conjunta. Escribe un programa que pruebe la nueva clase,
especialmente el incremento de de hora que cambia el día.*/

public class FechaYHora {
	private Hora hora;
	private Fecha fecha;
	
	
	FechaYHora(Fecha f,Hora h){
		this.hora=h;
		this.fecha=f;
	}
	
	public void siguienteHora(){
		
		this.hora.sumaHora(new Hora(1,0,0));
		
		if (hora.getHora()==0) {
			this.fecha.siguienteDia();
		}
		
	}
		
	public String toString(){
		return hora.aCadena()+" "+fecha.toString() ;
	}

	public static void main(String[] args) {
		Fecha mifecha=new Fecha(2,28,2015);
		Hora mihora=new Hora(23,45,56);
		FechaYHora fyh=new FechaYHora(mifecha,mihora);
		System.out.println(fyh);
		
		fyh.siguienteHora();
		System.out.println(fyh);
	}
	
}

