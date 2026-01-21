package ArraysMultiDimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio4 {

    static Random Random = new Random();
    static int x = 3;

    static int[][] generadorMatrices () {
        int[][] arrayAleatorio = new int[x][x];
        for (int i = 0; i < arrayAleatorio.length; i++) {
            for (int j = 0; j < arrayAleatorio[i].length; j++) {
                arrayAleatorio[i][j] = Random.nextInt(1,10);
            }
        }

        return arrayAleatorio;
    }

    static void rellenadorMatrices (int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Random.nextInt(1,10);
            }
        }
    }
    
    static boolean isSumaValida(int[][] a, int[][] b) {
        
        if (a.length != b.length) {
            System.out.println("Suma no válida");
            return false;
        } else {
            return true;
        }
    }
    
    static int[][] sumaMatriz (int[][] a, int[][] b) {
        
        int[][] arrayResultado = new int[a.length][b.length];
        
        for (int i = 0; i < arrayResultado.length && isSumaValida(a,b); i++) {
            
            for (int j = 0; j < arrayResultado[i].length; j++) {
                arrayResultado[i][j] = a[i][j] + b[i][j];
            }
        }
        
        return arrayResultado;
    }


    public static void main(String[] args) {

        int[][] array1 = generadorMatrices();
        int[][] array2 = generadorMatrices();
        System.out.println(Arrays.deepToString(array1));
        System.out.println(Arrays.deepToString(array2));

        int[][] suma = sumaMatriz(array1, array2);

        System.out.println(Arrays.deepToString(suma));
        ArraysMultiDimensionales.Arrays2D.DisplayMatriz(array2);
    }

}
