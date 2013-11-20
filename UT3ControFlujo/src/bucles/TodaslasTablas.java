package bucles;

public class TodaslasTablas {
	public static void main(String[] args) {
	int linea,multiplicacion,numero;
	
	
	for(numero=1;numero<=10;numero++) {
		multiplicacion=numero;
		linea=1;
		System.out.println("\nTabla del " + numero);
		while (linea<=10) {	
			   System.out.println(numero + " x " + linea + " = "
					   	+ (multiplicacion));
			   linea++;
			   multiplicacion+=numero; //multiplicacion=multiplicacion+numero;
		    }
		}
	}
}
