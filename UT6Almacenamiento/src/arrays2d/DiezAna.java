package arrays2d;

	import java.util.Scanner;

	/*
	 *
	 */
	public class DiezAna {

	    private int alto=10;
	    private int ancho=10;
	    private char caracter='*';
	    private char caracterFigura='@';
	    private char[][] pixeles;
	   
	    //Constructor
	    public DiezAna(){
	        this.pixeles=new char[this.ancho][this.alto];
	        for (int i=0; i<this.pixeles.length;i++){
	            for (int j=0; j<this.pixeles[i].length;j++){
	                pixeles [i][j]=this.caracter;
	            }
	        }
	    }
	   
	    public DiezAna(int ancho, int alto, char caracter){
	        this.alto=alto;
	        this.ancho=ancho;
	        this.caracter=caracter;
	        this.pixeles=new char[ancho][alto];
	       
	        for (int i=0; i<this.pixeles.length;i++){
	            for (int j=0; j<this.pixeles[i].length;j++){
	                pixeles [i][j]=caracter;
	            }
	        }
	       
	    }
	   
	    //Accesadores
	   
	    public int getAlto() {
	        return alto;
	    }
	   
	    public void setAlto(int alto) {
	        this.alto = alto;
	    }
	   
	    public int getAncho() {
	        return ancho;
	    }
	   
	    public void setAncho(int ancho) {
	        this.ancho = ancho;
	    }
	   
	    public char getCaracter() {
	        return caracter;
	    }
	   
	    public void setCaracter(char caracter) {
	        this.caracter = caracter;
	    }
	   
	    public void setCaracterFigura(char caracterFigura) {
	        this.caracterFigura = caracterFigura;
	    }
	   
	    public char getCaracterFigura() {
	        return caracterFigura;
	    }
	   
	   
	    public char[][] getPixeles() {
	        return pixeles;
	    }
	   
	    public void setPixeles(char[][] pixeles) {
	        this.pixeles = pixeles;
	    }
	   
	    public void mostrar(){
	       
	        limpiar();
	        for (int i=0; i<pixeles.length; i++){
	            for (int j=0; j<pixeles[i].length; j++){
	                System.out.print(pixeles [i][j]+" ");
	            }
	            System.out.print("\n");
	        }
	    }
	   
	    public void limpiar(){

	        for ( int i = 0 ; i < 50 ; i++ )
	        {
	            System.out.println();
	        }
	    }
	   
	    public void lineaHorizontal(int fila, int columna, int tamano){
	        for (int i=columna; i<columna+tamano;i++){
	            pixeles[fila][i]=caracterFigura;
	        }
	    }
	   
	    public void lineaVertical (int fila, int columna, int tamano){
	        for (int i=fila; i<fila+tamano;i++){
	            pixeles[i][columna]=caracterFigura;
	        }
	    }
	   
	    public void lineaDiagonal (int fila1, int columna1, int fila2, int columna2){
	       
	        int j=columna1+1;
	        for (int i=fila1+1; i<fila2; i++){
	            if (i<=fila2 && j<=columna2){
	                pixeles[i][j]=caracterFigura;
	                j++;
	            }else break;
	        }
	       
	    }
	    public void cuadrado(int fila, int columna, int tamano){
	       
	        lineaHorizontal(fila,columna,tamano);
	        lineaHorizontal(fila+tamano-1,columna,tamano);
	        lineaVertical(fila,columna,tamano);
	        lineaVertical(fila,columna+tamano-1,tamano);
	                           
	    }
	   
	    public void rectangulo (int fila, int columna, int largo, int alto){
	       
	        lineaHorizontal(fila,columna,largo);
	        lineaHorizontal(fila+alto-1,columna,largo);
	        lineaVertical(fila,columna,alto);
	        lineaVertical(fila,columna+largo-1,alto);
	    }
	   
	    //Solo pinta equilateros
	    public void triangulo (int fila, int columna, int longitud){
	       
	        lineaVertical(fila, columna, longitud);
	        lineaHorizontal(fila+longitud-1,columna,longitud);
	        lineaDiagonal(fila,columna,fila+longitud,fila+longitud);
	       
	    }
	   
	    public void circulo (int fila, int columna, int radio){
	        //Puntos basicos
	        pixeles[fila-radio][columna]=caracterFigura;
	        pixeles[fila][columna-radio]=caracterFigura;
	        pixeles[fila+radio][columna]=caracterFigura;
	        pixeles[fila][columna+radio]=caracterFigura;
	       
	        //Puntos auxiliares
	       
	        pixeles[fila-radio/2-1][columna-radio/2-1]=caracterFigura;
	        pixeles[fila-radio/2-1][columna+radio/2+1]=caracterFigura;
	        pixeles[fila+radio/2+1][columna-radio/2-1]=caracterFigura;
	        pixeles[fila+radio/2+1][columna+radio/2+1]=caracterFigura;
	    }
	   
	    public void menu (){
	           
	            int opcion=0;
	            System.out.println("1. Elegir caracter");
	            System.out.println("2. Cuadrado");
	            System.out.println("3. Rectángulo");
	            System.out.println("4. Triángulo");
	            System.out.println("5. Círculo");
	            System.out.println("6. Mostrar DiezAna");
	           
	            Scanner teclado;
	            teclado = new Scanner(System.in);
	           
	            opcion=teclado.nextInt();
	               
	            switch(opcion){
	            case 1: opcionElegirCaracter(); break;
	            case 2: opcionCuadrado(); break;
	            case 3: opcionRectangulo(); break;
	            case 4: opcionTriangulo(); break;
	            case 5: opcionCirculo(); break;
	            case 6: mostrar(); break;
	           
	            }
	        }
	   
	    public void opcionElegirCaracter(){
	        Scanner teclado;
	        teclado = new Scanner(System.in);
	        System.out.println("¿Que carcter quieres para dibujar?");
	        this.caracterFigura=teclado.next().charAt(0);
	        menu();
	    }
	   
	    public void opcionCuadrado(){
	       
	        Scanner teclado;
	        teclado = new Scanner(System.in);
	       
	        int fila,columna,tamano;

	        System.out.println("¿En qué fila empieza?");
	        fila=teclado.nextInt();
	       
	        System.out.println("¿En qué columna empieza?");
	        columna=teclado.nextInt();

	        System.out.println("¿De qué tamaño?");
	        tamano=teclado.nextInt();
	       
	        cuadrado(fila,columna,tamano);
	        mostrar();
	    }       
	       
	    public void opcionRectangulo(){
	       
	        Scanner teclado;
	        teclado = new Scanner(System.in);
	       
	        int fila,columna,largo,ancho;

	        System.out.println("¿En qué fila empieza?");
	        fila=teclado.nextInt();
	       
	        System.out.println("¿En qué columna empieza?");
	        columna=teclado.nextInt();

	        System.out.println("¿De qué largo?");
	        largo=teclado.nextInt();
	       
	        System.out.println("¿De qué ancho?");
	        ancho=teclado.nextInt();
	       
	        rectangulo(fila,columna,largo,ancho);
	        mostrar();
	    }
	   
	    public void opcionTriangulo(){
	       
	        Scanner teclado;
	        teclado = new Scanner(System.in);
	       
	        int fila,columna,longitud;

	        System.out.println("¿En qué fila empieza?");
	        fila=teclado.nextInt();
	       
	        System.out.println("¿En qué columna empieza?");
	        columna=teclado.nextInt();

	        System.out.println("¿De qué longitud?");
	        longitud=teclado.nextInt();
	       
	        triangulo(fila,columna,longitud);
	        mostrar();
	    }
	   
	    public void opcionCirculo(){
	       
	        Scanner teclado;
	        teclado = new Scanner(System.in);
	       
	        int fila,columna,radio;

	        System.out.println("¿En qué fila empieza?");
	        fila=teclado.nextInt();
	       
	        System.out.println("¿En qué columna empieza?");
	        columna=teclado.nextInt();

	        System.out.println("¿De qué radio?");
	        radio=teclado.nextInt();
	       
	        circulo(fila,columna,radio);
	        mostrar();
	    }
	   
	   
	   
	public static void main(String[] args) {
	   
	    DiezAna miDiezAna;
	   
	    miDiezAna = new DiezAna(15,15,'*');
	   
	    //miDiezAna.mostrar();
	    miDiezAna.menu();
	    //miDiezAna.cuadrado(0,3,4);
	    //miDiezAna.rectangulo(3, 2, 5, 4);
	    //miDiezAna.triangulo(2, 3, 6);
	    //miDiezAna.circulo(6, 6, 4);
	    //miDiezAna.mostrar();
	   
	}
	}