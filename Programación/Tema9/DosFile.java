package Tema9;

import java.io.IOException;
   //Ejemplo de lectura de líneas entrada estándar carácter a carácter

   // Contamos los caracteres que hay en una línea. 
public class DosFile {
     public static void main( String args[] ) throws IOException {

         int c; int contador = 0;

         // Se lee hasta encontrar el fin de línea

        while( (c = System.in.read() ) != '\n' ) {

            contador++;

            System.out.print( (char) c );

        }

        System.out.println(); // Se escribe el fin de línea

        System.err.println( "Contados " + contador + " bytes/caracteres en total." );

    } 
}
