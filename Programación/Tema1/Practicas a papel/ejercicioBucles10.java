import java.util.Scanner;

public class ejercicioBucles10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 1; i <= 100; i += 9) {
            System.out.print((i < 100)? i + " + " : i);
        }
        
        System.out.print(" ");  
        teclado.close();
        
    }
}
