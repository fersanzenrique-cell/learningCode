import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero de horas: ");
        int horas = sc.nextInt();
        int dias = horas / 24;
        int horas2 = horas % 24;
        System.out.println("El resultado es: " +  dias + " días y " + horas2 + " horas restantes.");
    }
}