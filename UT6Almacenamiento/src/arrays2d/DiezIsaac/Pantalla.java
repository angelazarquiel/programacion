package arrays2d.DiezIsaac;

public class Pantalla {

	private int alto;
	private int ancho;
	private char[][]caracteres;
	private char caracterDibujo;
	
	public Pantalla(int alto, int ancho){
		this.alto=alto;
		caracteres=new char[alto][ancho];
		for(int i=0;i<caracteres.length;++i){
			for(int j=0;j<caracteres[i].length;++j){
				caracteres[i][j]='*';
			}
		}
		caracterDibujo='@';
	}
	
	public void setCaracter(char caracterDibujo) {
		this.caracterDibujo = caracterDibujo;
	}
	
	public void dibujar() {
		for(int i=0;i<caracteres.length;++i){
			for(int j=0;j<caracteres[i].length;++j){
				System.out.print(caracteres[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void cuadrado(int x, int y, int lado){
		for(int i=0;i<lado;++i){
			caracteres[y][x+i]=caracterDibujo; //lado horizontal superior
			caracteres[lado+y-1][x+i]=caracterDibujo; //lado horizontal inferior
			caracteres[y+i][lado+x-1]=caracterDibujo; //lado vertical derecho
			caracteres[y+i][x]=caracterDibujo; //lado vertical izquierdo
		}
	}
	
	public void rectangulo(int x, int y, int ladoX, int ladoY){
		for(int i=0;i<ladoX;++i){
			caracteres[y][x+i]=caracterDibujo; //lado horizontal superior
			caracteres[ladoY+y-1][x+i]=caracterDibujo; //lado horizontal inferior
		}
		for(int i=0;i<ladoY;++i){
			caracteres[y+i][ladoX+x-1]=caracterDibujo; //lado vertical derecho
			caracteres[y+i][x]=caracterDibujo; //lado vertical izquierdo
		}
		
	}
	
	public void triangulo(int x, int y, int lado){
		for(int i=0;i<lado;++i){
			try{
				caracteres[y+i][x+i]=caracterDibujo;
				caracteres[y+i][x-i]=caracterDibujo;
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Triangulo fuera de pantalla: Cambia los parametros: ");
				break;
			}	
		}
		for(int i=0;i<lado;++i){
			caracteres[lado+y-1][x+i]=caracterDibujo;
			caracteres[lado+y-1][x-i]=caracterDibujo;
		}
	}
	
	public static void main(String[] args) {
		
		Pantalla mipantalla=new Pantalla(14, 14);
		mipantalla.setCaracter('H');
	
		mipantalla.triangulo(1,2,6);
		mipantalla.dibujar();
			
	}

}
