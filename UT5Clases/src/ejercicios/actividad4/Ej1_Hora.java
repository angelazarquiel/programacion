package ejercicios.actividad4;


/*Escribe una clase llamada Hora que tenga como atributos la hora, los minutos y los segundos (números enteros).
Un constructor inicializará estos datos a 0 y otro los inicializará a valores pasados por parámetro.
Un método de la clase devolverá la cadena con formato: 12:45:32.
Otro método, que tendrá un argumento de tipo Hora, sumará dicha hora a la propia. Por ejemplo:

[...]
mihora=new Hora(12,45,32);
unahoraycuarto=new Hora(1,15,0);
mihora.suma(unahoraycuarto);
System.out.println(mihora.aCadena());
[...]

14:00:32

Para probar la clase crea un main() con dos objetos inicializados a una hora determinada.
Crea otro sin inicializar y súmale las dos anteriores. Visualiza el valor de las dos horas y el resultante.*/

/*
 *
Ejercicio 2 Añade los métodos tick, incrementarMinuto e incrementarHora que incrementan la hora en
1 segundo, 1 minuto y 1 hora respectivamente.
Crea un programa que prueba el funcionamiento de estos métodos.
Has de asegurarte de que funcionan bien los siguientes casos:

a. incremento al siguiente minuto, b. incremento a la siguiente hora, c. incremento al siguiente día.
 */

public class Ej1_Hora {
    private int hora;
    private int minutos;
    private int segundos;
    //private int dia=0;
   
    public Ej1_Hora () {
        this.hora=0;
        this.minutos=0;
        this.segundos=0;
    }
   
    public Ej1_Hora  (int h, int m, int s){
        this.hora=h;
        this.minutos=m;
        this.segundos=s;
    }
   

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public String horaActual(Ej1_Hora  mihora){
        return  mihora.getHora()+":"+mihora.getMinutos()+":"+mihora.getSegundos();          
    }
   
    private void revisar() {
    	if (this.segundos>=60){
            this.segundos-=60;
            this.minutos=this.minutos+1;
        }
        if (this.minutos>=60){
            this.minutos-=60;
            this.hora=this.hora+1;
        }
        if (this.hora>=24){
            this.hora-=24;
        }
    }
   
    public void suma(Ej1_Hora  horaSumada){
               
        this.segundos+=horaSumada.getSegundos();
        revisar(); 
        this.minutos+=horaSumada.getMinutos();
        revisar();
        this.hora+=horaSumada.getHora();
        revisar();
		
    }
   
   
   
    @Override
    public String toString() {
        return  String.format("%02d:%02d:%02d",hora,minutos,segundos);
        /* return  (hora<10?"0":"") + hora + ":" +
                 (minutos<10?"0":"") + minutos +
                  ":" + (segundos<10?"0":"") + segundos; */
    }

    public void tick() {
        this.segundos=this.segundos+1;
		revisar();
    }
       
    public void incrementarMinuto(){
        this.minutos=this.minutos+1;
        revisar();
    }
   
    public void incrementarHora(){
        this.hora=this.hora+1;
        revisar();
    }
   
   
   

    public static void main(String[] args) {
        Ej1_Hora  mihora, unahoraycuarto;
        mihora=new Ej1_Hora (12,45,32);
        unahoraycuarto=new Ej1_Hora (1,15,0);
        mihora.suma(unahoraycuarto);
        System.out.println(mihora);
        System.out.println(mihora.horaActual(mihora));
        
        
        Ej1_Hora hora_uno,hora_dos,hora_final;

		hora_uno = new Ej1_Hora(22,45,23);
		hora_dos = new Ej1_Hora(2,5,53);
		hora_final = new Ej1_Hora();
		
		hora_final.suma(hora_uno);
		hora_final.suma(hora_dos);
		
		System.out.println("Hora 1: " + hora_uno + "\nHora 2:" +
			hora_dos + "\nResultado: " + hora_final);


        mihora.incrementarHora();
        System.out.println(mihora);
        mihora.tick();
        System.out.println(mihora);
        mihora.incrementarMinuto();
        System.out.println(mihora);
        
        Ej1_Hora prueba;
        
        prueba=new Ej1_Hora(0,0,0);
       
        System.out.println("Probando ticks");
       	for(int i=0;i<65;i++,prueba.tick())
       		System.out.println(prueba);
       	prueba.setMinutos(58);
       	for(int i=0;i<5;i++,prueba.incrementarMinuto())
       		System.out.println(prueba);
    }
   

}