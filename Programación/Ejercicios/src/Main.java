import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //
        System.out.println("Inserta unidad de medida: ");
        String unidad = sc.next();
        System.out.println("Inserta radio del cilindro en " + unidad+ ": ");
        float r = sc.nextFloat();
        //el numero se tiene que poner con comas, si es un punto no lo interpreta y da error
        //tiene que ver con el idioma del teclado
        //float r = 76.5F;
        // si se pone el valor con coma no lo reconoce, es la diferencia entre lo que se escribe en teclado y lo que java reconoce
        System.out.println("Inserta la altura del cilindro en " + unidad+ ": ");
        float h = sc.nextFloat();
        float volumen = (float) ((Math.PI*Math.pow(r,2))*h);
        System.out.println("El volumen de este cilindro es: " + volumen + " " + unidad + "^3");

    }
}