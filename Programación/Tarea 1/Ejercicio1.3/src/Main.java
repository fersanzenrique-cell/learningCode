import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros reales (con decimales): ");
        float real1 = sc.nextFloat();
        float real2 = sc.nextFloat();
        System.out.println("Ingresa además un numero entero: ");
        int entero = sc.nextInt();
        System.out.println("La suma es: " + (real1+real2));//se le puede dar un mejor formato
        System.out.println("La resta es: " + (real1-real2));
        System.out.println("La multiplicacion es: " + (real1*real2));
        System.out.println("La division es: " + (real1/real2));
        System.out.println("La multiplicacion es: " + (real1*entero));
        System.out.println("La division es: " + (real1/entero));

    }
}