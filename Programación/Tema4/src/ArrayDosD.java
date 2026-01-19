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
    }
    
}
