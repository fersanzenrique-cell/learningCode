import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tres notas: ");
        float nota1 = sc.nextFloat(), nota2 = sc.nextFloat(), nota3 = sc.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Tienes una media de " + media + ".");


    }
}