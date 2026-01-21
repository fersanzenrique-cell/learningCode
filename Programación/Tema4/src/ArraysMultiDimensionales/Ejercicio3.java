package ArraysMultiDimensionales;

public class Ejercicio3 {

    static boolean isSimetrica (int [][] m) {
        boolean isSimetrico = false;
        int contador = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i != j && m[i][j] == m[j][i]) {
                    contador++;
                }
            }
        }

        if (contador / 2 == 6) {
            isSimetrico = true;
        }
        System.out.println(contador);
        return isSimetrico;
    }

    static boolean isSimetrica2 (int [][] m) {
        boolean isSimetrico = true;
        

        for (int i = 0; i < m.length && isSimetrico; i++) {

            if (m.length != m[i].length) {
                isSimetrico=false;
            }

            for (int j = i+1; j < m[i].length && isSimetrico; j++) {
                if (m[i][j] != m[j][i]) {
                    isSimetrico = false;
                }
            }
        }
        return isSimetrico;
    }

    public static void main(String[] args) {
        /*0,1 1,0 */
        int[][] m1 = {{0,1,2,3},{1,0,4,5},{2,4,0,6},{3,5,6,0}};
        int[][] m2 = {{1,1,2,2},{1,2,2,3},{2,2,3,4},{2,3,4,4}};
        int[][] m3 = {{1,1,2,2},{1,4,2,3},{2,2,7,4},{5,3,4,4}};
        isSimetrica(m1);
        if (isSimetrica(m1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (isSimetrica(m2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (isSimetrica(m3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
    }
}
