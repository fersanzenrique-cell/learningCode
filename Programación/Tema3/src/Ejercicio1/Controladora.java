package Ejercicio1;

import java.util.Scanner;

public class Controladora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escriba un número: ");
        int num = teclado.nextInt();
        Numero num1 = new Numero(num);
        num1.paridad();
        num1.signo();
        num1.cero();

        teclado.close();
    }
}
