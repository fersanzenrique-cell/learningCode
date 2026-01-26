package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[][][] matriz = new int[6][6][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                for (int j2 = 0; j2 < matriz[j].length; j2++) {

                    if (
                        i == 0 || j == 0 || j2 == 0 || i == matriz.length - 1 || j == matriz[i].length - 1 || j2 == matriz[j].length - 1
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
