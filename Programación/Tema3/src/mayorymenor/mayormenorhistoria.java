package mayorymenor;

import Ejercicio1.Numero;

import java.util.Scanner;

public class mayormenorhistoria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        mayorymenor num1 = new mayorymenor(teclado.nextInt());
        System.out.println(num1.mayor());
    }
}
