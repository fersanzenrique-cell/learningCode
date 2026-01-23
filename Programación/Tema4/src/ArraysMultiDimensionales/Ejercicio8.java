package ArraysMultiDimensionales;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio8 {

    static Random Random;
    public static void main(String[] args) {
        Random = new Random(); 
        int[][] m = new int[5][5];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Random.nextInt(1,10);   
            }
        }

        System.out.println(Arrays.deepToString(m));

        System.out.println();

        for (int[] is : m) {
            System.out.println(" " + is + " ");
        }

        // Suma de arrays de columnas

        
        
        for (int i = 0; i < m.length; i++) {
            int sumaI = 0;
            for (int j = 0; j < m[i].length; j++) {
                sumaI += m[i][j];
            }
            System.out.println("Suma fila " + i + " : " + sumaI);
        }

        int contador = 0;
        int sumaJ = 0;
        for (int i = 0; i < m.length; i++) {
            
            for (int j = 0; j < m[i].length; j++) {
                if (j == contador) {
                    sumaJ += m[i][j];
                } 
            }
            contador++;
            //Corregir y hacerlo, creo que son tres for anidados
            System.out.println("Suma columna " + i + " : " + sumaJ);
            // Pon un sout dentro poniendo suma columna j en vez de esto
        }

    }
}
