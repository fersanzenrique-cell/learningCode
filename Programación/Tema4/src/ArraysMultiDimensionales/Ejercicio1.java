package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        int[][] m = new int[5][5];
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                
                m[i][j] = j + i;

            }
        }

        System.out.println(Arrays.deepToString(m));

    }
}
