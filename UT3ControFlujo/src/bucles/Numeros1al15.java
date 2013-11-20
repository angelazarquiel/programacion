package bucles;

public class Numeros1al15 {

    public static void main(String[] args) {
           int i;    
    	
            for(i=15;i>0;i--){
                    System.out.println(i);
            }
            
            i=15;
            while (i<0){
            	System.out.println(i);
                i--;
            }
            
            for(i=15;i>0;System.out.println(i--));
    }

}
