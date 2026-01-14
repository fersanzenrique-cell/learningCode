import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convierte euros a pesetas, inserta un valor: ");
        int peseta = sc.nextInt();
        float euro = (float) (peseta / 166.386);
        String euro2 = String.format("%.2f",euro);
        System.out.printf("Tiene un total de " + euro2 + " €.");
    }
}