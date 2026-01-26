package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][][] matriz = new int[9][9][9];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int j2 = 0; j2 < matriz[j].length; j2++) {

                    if (
                        i == j || i == j2 || j == j2 || i == 0 || j == 0 || j2 == 0 || i == matriz.length || j == matriz[i].length || j2 == matriz[j].length
                    ) {
                        
                        matriz[i][j][j2] = 1;
                    }
                    
                }
                
            }
        }

        for (int[][] is : matriz) {
            System.out.println(Arrays.deepToString(is) + "\n");
        }
    }
}
