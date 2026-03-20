/**
 * @author Enrique
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tres números: ");
        float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();
        sc.nextLine(); //se pone asi, sin nada mas y funciona
        System.out.println("Escribe una palabra");
        String variable = sc.next();
        System.out.println(a + " " + b + " " + c + " " + variable );
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(variable);
        System.out.println(a + "\n" + b + "\n" + c + "\n" + variable );
    }
}