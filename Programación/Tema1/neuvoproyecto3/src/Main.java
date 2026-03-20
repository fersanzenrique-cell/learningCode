import jdk.swing.interop.SwingInterOpUtils;

import javax.xml.transform.Source;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a,b,c;
        System.out.print("Escribe a: ");
        a = keyboard.nextInt();
        System.out.printf("\rEscribe b: ");
        b = keyboard.nextInt();
        c = a + b;
        keyboard.close();
        System.out.printf("La suma es " + c + ".");

        Random dado = new Random();
        float number = dado.nextFloat(0,6);
        System.out.printf("\nNúmero aleatorio: " + number);

    }
}