import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {
    static Scanner in;
    static Random Random;
    static int length = 10;
    public static void main(String[] args) {
        
        int[] array1 = new int[length];
        int[] array2 = new int[length];

        numAleatorio(array1);
        numAleatorio(array2);
        
        
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(tercerArray(array1, array2)));
        System.out.println(concurrenciasArray(tercerArray(array1, array2)));
    }

    public static void numAleatorio(int[] a) {

        Random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = Random.nextInt(20) + 1; 
        }
        
    }

    public static int[] tercerArray(int[] a, int[] b) {

        int[] tercerArray = new int[length];
        for (int i = 0; i < tercerArray.length; i++) {
            tercerArray[i] = a[i] + b[i];
        }
        return tercerArray;
        
    }

    public static int concurrenciasArray(int[] a) {
        int contador = 0;
        for (int i : a) {
            if (i == 3) {
                contador++;
            }
        }
        return contador;
    }

}

