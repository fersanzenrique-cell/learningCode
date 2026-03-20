
import java.util.Scanner;

public class ejercicioBucles14 {

    public static void main(String[] args){
    
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número de saldos");
        
        int numSueldo = teclado.nextInt();
        int maxima = 0;
        
        for (int i = 0 ; i < numSueldo ; i++) {
            
            System.out.println("Ingresa sueldo: ");
            double sueldo = teclado.nextDouble();
            if (sueldo > maxima) {
            
                sueldo = maxima;
            
            }
           
            teclado.nextLine();
        }
        System.out.println(maxima);
        teclado.close();
        
    }


}
