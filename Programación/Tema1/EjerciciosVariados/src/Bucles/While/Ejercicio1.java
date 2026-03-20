package Bucles.While;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Escriba un número mayor que 0");
            System.out.println(
                    Math.pow(teclado.nextInt(),2)
            );
        } while (teclado.nextInt() >= 0);
    }
}
