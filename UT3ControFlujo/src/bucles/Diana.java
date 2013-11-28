package bucles;
import graphics.Color;
import graphics.Ellipse;


public class Diana {

	public static void main(String[] args) {
	
		Color[] colores;
		int centro_x,centro_y;
		int distancia;
		int anterior;
		
		colores = new Color[5];
		
		colores[0] = new Color(255,0,0);
		colores[1] = Color.CYAN;
		colores[2] = Color.DARK_GRAY;
		colores[3] = Color.YELLOW;
		colores[4] = Color.BLACK;

		centro_x=200;
		centro_y=200;
		distancia = 15;
		anterior=-1;
		for(int i=10;i>0;i--){
			Ellipse circulo;
			int actual;
			
			circulo = new Ellipse(centro_x-i*distancia,
					centro_y-i*distancia,distancia*i*2,distancia*i*2);
			do {
				actual=(int)(Math.random()*5);
			} while (anterior==actual);
			circulo.setColor(colores[actual]);
			circulo.fill();
			anterior=actual;
		}
		
	}

}
