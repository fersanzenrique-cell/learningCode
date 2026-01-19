public class ArrayDosD {
    public static void main(String[] args) {
        int [][] ArrayDosD = {
            {0,4},
            {2,4},
            {3,6},
        };

        for (int i = 0; i < ArrayDosD.length; i++) {
            for (int j = 0; j < ArrayDosD.length; j++) {
                System.out.print(ArrayDosD[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] fila : ArrayDosD) {
            for (int num : fila) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int [][] m = new int[4][];
        m [0] = new int[2];
        m [1] = new int[7];
        m [2] = new int[4];
        m [3] = new int[5];
        m [0][0] = 2;
        m [0][1] = 3;
        m [0][2] = 5;
        m [1][0] = 5;
        //asi sucesivamente, array 0 , posicion 0
    }
    
}
