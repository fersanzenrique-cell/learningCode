package Java.CrearArchivos;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File ficheroTexto = new File("cago_en_la_leche.txt");

        Java.CrearArchivos.ficheroTexto.rellenaFicherosTresMil(ficheroTexto);
    }
}
