
import java.util.Scanner;

public class ejercicioBucles15 {

    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        
        int num;
        int numSup = 0; 
        int numNeg = 0; 
        int contadorNeg = 0; 
        int contadorSup = 0;
        int contadorCero = 0;
        
        for (int i = 0;i <= 10;i++) {
            
            System.out.println("Ingresa " + (10-i) + " número/s.");
            num = teclado.nextInt();
            
            if (num > 0) {
            
                contadorSup++;
                numSup += num;
                
            } else if (num < 0) {
            
                contadorNeg++;
                numNeg += num;
            
            } else {
            
                contadorCero++;
            
            }
        
        }
        
        System.out.println("Media de números positivos: " + (numSup/contadorSup));
        System.out.println("Media de números negativos: " + (numNeg/contadorNeg));
        System.out.println("Número de ceros: " + contadorCero);
        teclado.close();
        
    }


}
