import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tres notas: ");
        float nota1 = sc.nextFloat(), nota2 = sc.nextFloat(), nota3 = sc.nextFloat();
        float media = ( nota1 + nota2 + nota3 ) / 3; //IntelliJ te dice si pierdes precisión
        // float media = (float) (nota1 + nota2 + nota3 ) / 3; es lo mismo que
        // float media = (float) (nota1 + nota2 + nota3) / 3.0;
        System.out.println("La media de tus notas es: " + media );
    }
}