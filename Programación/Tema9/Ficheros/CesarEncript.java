package Tema9.Ficheros;

import java.util.Scanner;

public class CesarEncript {

    static final String ABECEDARIO = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    // Juega con el valor ASCII
    // Con la clase fileReader miraras cada letra, en vez de un palabra

    static Scanner scIn = new Scanner(System.in);

    int defineROT(int rot) {
        if (rot > ABECEDARIO.length()/2 || rot < 1) {return 0;}
        return rot;
    }

    String encode(String in) {
        int num = Integer.parseInt(in);
        if ()
            // JUEGA CON EL VALOR ASCII
    }

    public static void main(String[] args) {
        while (scIn.hasNext()) {
            System.out.println("¿Que archivo quieres encodificar?(El archivo tiene que estar dentro de ficheros)");


        }
    }
}
