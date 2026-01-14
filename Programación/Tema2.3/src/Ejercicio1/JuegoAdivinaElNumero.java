package Ejercicio1;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JuegoAdivinaElNumero {
    public static void main(String[] args) {
        Azar azar1 = new Azar();
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        int contador = 0;
        do {
            System.out.println("Escribe un número entero entre 1 y 100");
            numero = teclado.nextInt();
            if (azar1.menor(numero)) {
                System.out.println(numero + " es mayor que el número.");
            } else if (azar1.mayor(numero)) {
                System.out.println(numero + " es menor que el número.");
            } else {
                System.out.println(numero + " es igual.");
            }
            contador++;
        } while (numero <=0 || numero >=100 || !azar1.igual(numero));
        System.out.println("Lo intentaste " + contador + " veces.");
    }
}
