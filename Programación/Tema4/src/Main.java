import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner teclado = new Scanner(System.in);
    public static String longitudMax(String[] cadenaMax) {
        for (int i = 0; i < cadenaMax.length; i++) {
            cadenaMax[i] = teclado.nextLine();
        }
        String cadenaMin = "";
        for (String max : cadenaMax) {
            if (max.length() > cadenaMin.length()) {
                cadenaMin = max;
            }
        }
        return Arrays.toString(cadenaMax);
    }
    public static void main(String[] args) {

        int[] enteros = new int[6];

        for (int i = 0; i < enteros.length; i++) {
            enteros [i] = teclado.nextInt();
        }
        teclado.nextLine(); //limpieza de buffer
        System.out.println(Arrays.toString(enteros));
        /*
        for (int entero : enteros) {
            System.out.print(entero + " ,");
        }
        */

        String[] cadenas = new String[6];

        for (int i = 0; i < cadenas.length; i++) {
            cadenas [i] = teclado.next();
        }
        teclado.nextLine(); // limpieza de buffer
        System.out.println(Arrays.toString(cadenas));

        char[] caracteres = new char[6];

        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = teclado.nextLine().charAt(0);

        }
        System.out.println(Arrays.toString(caracteres));
    }
}