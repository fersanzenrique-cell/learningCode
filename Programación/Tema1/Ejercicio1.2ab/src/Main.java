/**
 * @author Enrique
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x = 3;
        double y = 5.15684987468;
        double z = 200 * y + x;
        float z1 = (float) (200 * y + x);
        int z2 = (int) (200 * y + x);
        System.out.println(z);
        System.out.println(z1);
        System.out.println(z2);
        //
        int xb = 3;
        double yb = 5.15684987468;
        System.out.println((double) (200 * yb + xb));
        System.out.println((float) (200 * yb + xb));
        System.out.println((int) (200 * yb + xb));
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un int y un double: ");
        int xc = sc.nextInt();
        double yc = sc.nextDouble();
        double zc = 200 * yc + xc;
        float z1c = (float) (200 * yc + xc);
        int z2c = (int) (200 * yc + xc);
        System.out.println(zc);
        System.out.println(z1c);
        System.out.println(z2c);
    }
}