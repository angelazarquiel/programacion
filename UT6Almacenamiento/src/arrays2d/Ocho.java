package arrays2d;

public class Ocho {

	public static void mostrar(char[][] matriz) {
		/*for(char[] fila:matriz) {
			for(char elemento:fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
		}*/
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		char [][] caracteres={{'a','b','c'},{'e','f','g','x','z'},{'h','i','j'}};
		
		mostrar(caracteres);
				
				
	}
	
	
}
