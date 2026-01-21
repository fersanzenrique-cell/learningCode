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
    /* 
    static boolean isSumaValida(int[][] array1, int[][] array2) {

    }
    */
    static int[][] sumaMatriz (int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            System.out.println("Suma no válida");
        }
        int[][] arrayResultado = new int[array1.length][array1.length]; //Asumiendo que son de igual tamaño
        
        for (int i = 0; i < arrayResultado.length; i++) { // i < arrayResultado.length && isSumaValida
            
            for (int j = 0; j < arrayResultado[i].length; j++) {
                arrayResultado[i][j] = array1[i][j] + array2[i][j];
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
    }

}
