package ArraysMultiDimensionales;

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[][] m = {{1,4,7},{2,5,8},{3,6,9}};
        int[][] t = new int[3][3];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                t[i][j] = m[j][i];
            }
        }
        
        System.out.println(Arrays.deepToString(m));
        System.out.println(Arrays.deepToString(t));

    }
}
