package ejercicios.actividad4;

public class Hora {
	private   int hora;
	private int min;
	private int seg;

	Hora(){
		this.hora=0;
		this.min=0;
		this.seg=0;
	}
	Hora(int hora, int min, int seg){
		this.hora=hora;
		this.min=min;
		this.seg=seg;
	}
	public String aCadena(){
		String segString = Integer.toString(seg);
		String horaString = Integer.toString(hora);
		String minString = Integer.toString(min);
		if (hora<10)
		{
			horaString="0"+horaString;
		}
		if (min<10)
		{
			minString="0"+minString;
		}
		if (seg<10)
		{
			segString="0"+segString;
		}
		
		return horaString+":"+minString+":"+segString;
	}
	 public void sumaHora(Hora h){
		hora=hora+h.hora;
		if(hora>=24){
			while(hora>=24){
			hora=hora-24;}
		}
		min=min+h.min;
		if(min>59){
			hora=hora+1;
			min=60-min;
		}
		seg=seg+h.seg;
		if(seg>59){
			min=min+1;
			seg=60-seg;
			}
	}
	 public void tick(){
		 seg=seg+1;
		 if(seg>59){
				min=min+1;
				seg=60-seg;
				}
		 if(min>59){
				hora=hora+1;
				min=60-min;
			}
		 if(hora>24){
				hora=hora-24;
			}
	 }
	public  void incrementarMinuto(){
		 min=min+1;
		 if(seg>59){
				min=min+1;
				seg=60-seg;
				}
		 if(min>59){
				hora=hora+1;
				min=60-min;
			}
		 if(hora>24){
				hora=hora-24;
			}
	 }
	 public void incrementarHora (){
		 hora=hora+1;
		 if(seg>59){
				min=min+1;
				seg=60-seg;
				}
		 if(min>59){
				hora=hora+1;
				min=60-min;
			}
		 if(hora>=24){
				hora=hora-24;
			}
	 }
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getSeg() {
		return seg;
	}
	public void setSeg(int seg) {
		this.seg = seg;
	}
}
