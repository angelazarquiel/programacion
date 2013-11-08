package ejerciciosinicial;

import java.util.Scanner;

public class DiaLaborableLetra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String dia;
		
		System.out.print("Dame el día de la semana (en letra): ");
		dia = teclado.nextLine();
		
		/*
		dia = dia.toLowerCase();
		if (dia.equals("lunes")) // dia == "lunes"
		*/
		
		switch (dia.toLowerCase()) {
			case "lunes":
			case "martes":
			case "miercoles":
			case "jueves":
			case "viernes":
				System.out.println("Día laborable.");
				break;
			case "sabado":
			case "domingo":
				System.out.println("Día festivo");
				break;
		}

	}

}
