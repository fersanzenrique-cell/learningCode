import java.util.Date;

public class Main {
    public static void main(String[] args) {
        byte bite = 23;
        short peque = 12345;
        int entero = 232453256;
        long largo = 483920394;
        double doble= 32323143244345553452.432432453255435435623426654756345;

        final double g = -9.80665;
        float mass = 54, peso = (float) (mass * g);
        System.out.println(Math.abs(peso)+" kg");

        char mongus = 'a'; //los char se ponen como solo una comilla (con la tecla "?")
        String a = "mongus";
        System.out.println(mongus+a);
        boolean nublado;
        nublado = true;

        if (nublado) {
            System.out.println("Esta nublado");
        } else {
            System.out.println("No esta nublado");
        }

    }
}