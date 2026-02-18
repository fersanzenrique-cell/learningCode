package Java.OOP.EmpresaApp;
import java.util.Scanner;

public class pruebas {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String as = in.nextLine();
        for ( char a : as.toCharArray()) {
            if (Character.isDigit(a)) {
                System.out.println(a);
            }
        }

       System.out.println();
   } 
}
