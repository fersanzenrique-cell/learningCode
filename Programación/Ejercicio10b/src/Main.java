import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, introduce tu clase incluyendo el curso: ");
        Scanner sc = new Scanner(System.in);
        String respuesta = sc.nextLine();
        String r_mayus = respuesta.toUpperCase();
        System.out.println("Bienvenido a " + r_mayus.charAt(0) + "ª de " + r_mayus.substring(1,4)
        + " grupo " + r_mayus.charAt(4));

    }
}