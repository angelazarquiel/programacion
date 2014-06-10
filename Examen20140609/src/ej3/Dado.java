package ej3;

public class Dado {
            
        private int valor;
        
        public Dado() {
            tirar();
        }
        
        public void tirar() {
            valor = (int)(Math.random()*6) + 1;
        }
                 
        public int getValor() {
           return valor;
        }
        
        public String toString() {
        	return Integer.toString(getValor());
        }
}
