import java.util.Arrays;
import java.util.Scanner;

public class Ej418 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int n = teclado.nextInt();
        int[] a = new int[n];

        while (n != 0) {

            for (int i = 0; i < n; i++) {
                a[i] = teclado.nextInt();
            }

            n = teclado.nextInt();
        }

        Arrays.sort(a);

        System.out.println(a[n-2] * a[n-1]);

    }
}
