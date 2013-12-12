package bucles;
import java.util.Scanner;


public class Figuras {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tama�o;

		System.out.print("Dame el tama�o de las figuras: ");
		tama�o = input.nextInt();

		for(int i=0;i<tama�o;i++) {
			//fila i
			for(int j=0;j<=i;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tama�o;i++) {
			//fila i
			for(int j=tama�o-i;j>0;j--) { 
				System.out.print("@");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<tama�o;i++) {
			//fila i
			for(int j=0; j< tama�o-i ;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<tama�o;i++) {
			//fila i
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0; j< tama�o-i ;j++) { 
				System.out.print("@");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0;i<tama�o;i++) {
			//fila i
			for(int j=0;j<tama�o-i-1;j++)
				System.out.print(" ");
			for(int j=0;j<=i;j++) { 
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int k=0;k<tama�o-1;k++)
			for(int i=0;i<k+2;i++) {
				//fila i
				for(int j=0;j<tama�o-i-1;j++)
					System.out.print(" ");
				for(int j=0;j<=i;j++) { 
					System.out.print("@ ");
				}
				System.out.println();
			}
	}
}
