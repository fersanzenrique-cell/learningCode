import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    static Random Random;
    static int length = 6;

    public static int[] arrayNoRepetido() {

        Random = new Random(); 
        int[] array = new int[length];
        int topeArray = array.length - 1;


        for (int i = 0; i < array.length; i++) {
            array[i] = Random.nextInt(1,9);
        }
        
        
        for (int i = 0; i < topeArray; i++) {

              if (i != array.length) {
                while (array[i] == array[i+1]) {
                    array[i] = Random.nextInt(9) + 1;
                    System.out.println(i);
                }
            }
        }
        // no vale
           
    

        /* 

        for (int i = 0; i < topeArray; i++) {
            if (i != topeArray) {
                while (array[i] == array[i+1]) {
                    array[i] = Random.nextInt(48) + 1;
                }
            }
        }

        */
        
        return array;

    }
    public static void main(String[] args) {
        
        System.out.println(Arrays.toString(arrayNoRepetido()));
    }
}
