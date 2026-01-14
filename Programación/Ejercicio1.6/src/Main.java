import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu nombre: ");
        String nombre = sc.next();
        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
    }
}