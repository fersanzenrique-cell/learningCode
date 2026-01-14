import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introducir un número de 5 dígitos: ");
        //solucion 1
        //int num = sc.nextInt();
        //int d1 = num/10000;
        //int d2 = num/1000 %?
        //solucion 2
        int n = sc.nextInt();
        String d1 = String.valueOf(n);
        System.out.println(
                d1.charAt(0) + " " + d1.charAt(1) + " " + d1.charAt(2) + " " + d1.charAt(3) + " " + d1.charAt(4)
        );

    }
}