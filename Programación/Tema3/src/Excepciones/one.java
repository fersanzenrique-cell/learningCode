package Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        String cad = "hola";
        try {

            System.out.println("Escriba un número entero");
            x =Integer.parseInt(sc.nextLine()); // peligro de excepción: 1
            System.out.println("Escriba otro número entero");
            y = sc.nextInt(); // peligro de excepción: 2
            System.out.println(x/y); // peligro de excepción: 3
            System.out.println(cad.charAt(10)); // peligro de excepción: 4

        } catch (NumberFormatException ex) { // excepción 1

            System.out.println("No escribiste un número entero");
            System.out.println(ex);

        } catch (InputMismatchException ex) { // excepción 2

            System.out.println("El otro número tampoco es un número entero");
            System.out.println(ex);

        } catch (StringIndexOutOfBoundsException ex) { // excepción 4, dos excepciones!!, se ponen mas con un |

            System.out.println("Accediste a una posición inexistente de la cadena");
            System.out.println(ex);
            System.out.println();
            System.out.println(ex.getMessage());
            System.out.println(ex.getCause());
            System.out.println(ex.getClass());

        } catch (ArithmeticException ex) { // excepción 3

            System.out.println("Intentaste dividir entre cero");
            System.out.println(ex);

        } /* catch (Exception ex) {

            System.out.println("Se produjo un error inesperado");
            System.out.println(ex);
        */

        sc.close();


    }
}
