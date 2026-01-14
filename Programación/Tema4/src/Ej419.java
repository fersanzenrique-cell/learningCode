import java.util.Arrays;
import java.util.Scanner;

public class Ej419 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a;
        int n = teclado.nextInt();
        while (n != 0) {
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = teclado.nextInt();
            }
            Arrays.sort(a);
            if (a.length % 2 == 0) {
                System.out.println(a[(n/2)-1] + a[n/2]);
            } else {
                System.out.println((a[n/2]) * 2);
            }
            // System.out.println(Arrays.toString(a));
            n = teclado.nextInt();
        }
    }
}
