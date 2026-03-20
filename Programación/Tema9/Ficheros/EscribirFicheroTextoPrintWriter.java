package Tema9.Ficheros;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EscribirFicheroTextoPrintWriter {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String palabra = sc.next();
            File f = new File("Programación/Tema9/Ficheros/pepe2.txt");
            f.createNewFile();
            PrintWriter salida = new PrintWriter(new FileWriter(f,true));
            while (!palabra.equalsIgnoreCase("fin")) {
                salida.print(palabra + " ");
                palabra = sc.next();
            }
            sc.close();
            salida.close();
        } catch (IOException e) {
            System.err.println("Error");
        }
        
    }
}
