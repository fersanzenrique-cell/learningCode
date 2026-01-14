package mayorymenor;

import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String linea = teclado.nextLine();

        String[] numero = linea.split(" ");
        int numero1 = Integer.parseInt(numero[0]);
        int numero2 = Integer.parseInt(numero[1]);
        int numero3 = Integer.parseInt(numero[2]);
        int numero4 = Integer.parseInt(numero[3]);
        int numero5 = Integer.parseInt(numero[4]);

        System.out.println(numero1 + " " + numero2 + " " + numero3 + " " + numero4 + " " + numero5);

    }
}
