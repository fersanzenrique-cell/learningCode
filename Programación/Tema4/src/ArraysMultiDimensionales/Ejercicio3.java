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
    public static void main(String[] args) {
        /*0,1 1,0 */
        int[][] m = {{0,1,2,3},{1,0,4,5},{2,4,0,6},{3,5,6,0}};
        isSimetrica(m);
        if (isSimetrica(m)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
