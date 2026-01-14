import java.util.Arrays;
import java.util.Scanner;

public class Ej168 {
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a;
        int n = teclado.nextInt() - 1;
        while (n % 2 != 0) {
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = teclado.nextInt();
            }
            Arrays.sort(a);
            int contador = 0;
            while (a[contador] == a[contador+1] + 1) {
                if (a[contador] != a[contador+1] + 1) {
                    System.out.println(a[contador]+1);
                }
                contador++;
            }
            n = teclado.nextInt();
    }
    }
}
