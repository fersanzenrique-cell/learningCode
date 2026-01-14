package Bucles.While;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            numero = scanner.nextInt();
            System.out.println(
                    (numero > 0)? "Número positivo" : "Número negativo"
            );
            System.out.println(
                    (numero % 2 == 0)? "Número impar" : "Número par"
            );
        } while (numero != 0);
    }
}
