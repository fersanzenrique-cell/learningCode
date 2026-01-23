package ArraysMultiDimensionales;
import java.util.Scanner;

public class Ejercicio7 {

    static Scanner sc = new Scanner(System.in); 

    static boolean casoPrueba() {
        int casoNum = sc.nextInt();
        if (casoNum != 0) {

            boolean isIdentidad = true;

            // Parte de escritura de matriz

            int[][] matriz = new int[casoNum][casoNum];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            // Parte de lectura de matriz

            for (int i = 0; i < matriz.length && isIdentidad; i++) {
                for (int j = 0; j < matriz[i].length && isIdentidad; j++) {
                    if (i == j && matriz[i][j] != 1) {
                        isIdentidad = false;
                    } else if (i !=j && matriz[i][j] != 0){
                        isIdentidad = false;
                    }
                }
            }   

            sc.nextLine();

            if (isIdentidad) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }

            // System.out.println(isIdentidad? "SI" : "NO");
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        while (casoPrueba())
            ;

    }
}
