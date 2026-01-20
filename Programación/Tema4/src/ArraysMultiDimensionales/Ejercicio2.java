package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[][] m = new int[4][5];
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m [i][j] = contador;
                contador++;
            }
        }

        System.out.println(Arrays.deepToString(m));

    }
}
