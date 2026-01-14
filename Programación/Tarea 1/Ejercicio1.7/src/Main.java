import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad: ");
        int edad = sc.nextInt(); // el intro (\n) sigue estando en el buffer y por eso salta la variable.
        // MIRAR BUFFER
        sc.nextLine();
        System.out.print("Introduzca su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduzca su/s apellido/s: ");
        String apellidos = sc.nextLine();

        System.out.println("Hola, " + nombre + " " + apellidos + ", tienes " + edad + " años.");
    }
}