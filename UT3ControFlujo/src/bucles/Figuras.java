package bucles;
import java.util.Scanner;


public class Figuras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamaño;

		System.out.print("Dame el tamaño de las figuras: ");
		tamaño = input.nextInt();

		for(int i=0;i<tamaño;i++) {
			//fila i
			for(int j=0;j<=i;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tamaño;i++) {
			//fila i
			for(int j=tamaño-i;j>0;j--) { 
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tamaño;i++) {
			//fila i
			for(int j=0; j< tamaño-i ;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<tamaño;i++) {
			//fila i
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0; j< tamaño-i ;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<tamaño;i++) {
			//fila i
			for(int j=0;j<tamaño-i-1;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) { 
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int k=0;k<tamaño-1;k++)
			for(int i=0;i<k+2;i++) {
				//fila i
				for(int j=0;j<tamaño-i-1;j++)
					System.out.print(" ");
				for(int j=0;j<=i;j++) { 
					System.out.print("@ ");
				}
				System.out.println();
			}
	}
}
