/**
 * @author Enrique
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tres notas:");
        float a = sc.nextFloat(), b = sc.nextFloat(), c = sc.nextFloat();

        System.out.println("La nota en el expediente será " + String.format(java.util.Locale.US,"%.2f",((a+b+c)/3)) + ".");
        //java.util.Locale.US, hace que en vez de imprimir con comas los decimales, lo haga con un punto
        // tambien se puede poner Locale.ROOT, de donde es la maquina
        System.out.println("La nota en el sin redondear boletín será " + ( (int) (a+b+c)/3) + ".");
        System.out.println("La nota en el boletín será " + Math.round((a+b+c)/3) + ".");

    }
}