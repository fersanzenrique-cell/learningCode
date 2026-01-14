import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int [] tempArray = {9,8,7,8,8,8,8,7,8,8,9,11,12,13,15,16,14,12,11,10,10,10,10,10};

        tempArray[12] = 13;

        // Arrays.fill(tempArray,2);

        System.out.print(Arrays.toString(tempArray));

        System.out.print("\n" + String.format("%2.2f",mediaArray(tempArray)));
        System.out.print("\n" + minimoArray(tempArray));
        System.out.print("\n" + maximoArray(tempArray));

        System.out.println();

    }

    public static float mediaArray(int[] a) {

        int suma = 0;

        for (int i = 0; i < a.length; i++) {

            suma += a[i];

        }
        
        /* 
        for (int i : a) {
            suma += i;
        }
        */

        return (float)(suma/a.length);

    }

    public static int minimoArray(int[] a) {
        int min = 100;


        for (int i : a) {
            if (i < min) {
                min = i;
            }
        }
        return min;

    }

    public static int maximoArray(int[] a) {
        int max = -100;


        for (int i : a) {
            if (i > max) {
                max = i;
            }
        }
        return max;

    }



}