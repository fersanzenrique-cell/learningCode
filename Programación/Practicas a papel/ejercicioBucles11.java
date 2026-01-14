import java.util.Scanner;

public class ejercicioBucles11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sum = 0;
        
        for (int i = 0; i <= 15; i++) {
            sum += teclado.nextInt();
            System.out.print(sum + "(" + i + ")" + " -> ");
        }
        
        System.out.print(" ");  
        teclado.close();
        
    }
}
