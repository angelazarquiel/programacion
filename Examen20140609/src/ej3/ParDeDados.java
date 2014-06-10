package ej3;

public class ParDeDados {
	private Dado dado1,dado2;
        
    public ParDeDados() {
    	dado1=new Dado();
    	dado2=new Dado();
        //tirar();
    }
        
    public void tirar() {
            this.dado1.tirar();
            this.dado2.tirar();
    }
                 
        public int getDado1() {
           return dado1.getValor();
        }
        
        public int getDado2() {
            return dado2.getValor();
         }
        
        public int getValor() {
           
           return dado1.getValor() + dado2.getValor();
        }
        
        public String toString() {
        	return dado1+"+"+dado2+"="+getValor();
        }
        
        public static void main(String[] args) {
            
            ParDeDados dados;
            int tiradas;
      
            dados = new ParDeDados ();
            tiradas = 0;
            
            do {
                dados.tirar();
                System.out.println("Tirada de dados, ha salido " + dados.getDado1() 
                                                 + " y " + dados.getDado2());
                tiradas++;
            } while (dados.getValor() != 2);
                  
            System.out.println("\nMe llevó " + tiradas + " tiradas conseguir dos unos.");
         }

}
