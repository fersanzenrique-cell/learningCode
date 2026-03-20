/**
 * @author Enrique
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre, su peso en kg y su estatura en cm: ");
        String nombre = sc.next();
        float peso = sc.nextFloat(), estatura = sc.nextFloat()/100,
                imc = (float) (peso/(Math.pow(estatura,2)));
        // Redondear resultado a dos decimales.
        System.out.println(imc);
    }
}