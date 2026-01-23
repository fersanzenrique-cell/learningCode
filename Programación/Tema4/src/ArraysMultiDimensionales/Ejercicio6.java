package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz = new int[7][7];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                }
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(Arrays.deepToString(matriz));

    }
}
