package Java.CrearArchivos;

import java.io.File;
import java.util.Scanner;

class ficheroTexto {

    static Scanner sc = null;

    static void rellenaFicherosTresMil (File fichero) {
        try {

            System.out.println("Este archivo ha sido leido por el rellenaFicherosTresMil!!!111");

            Thread.sleep(1000);

            System.out.println("get ready twin");

            for (int i = 0; i < 4; i++) {

                System.out.print(".");

                Thread.sleep(1000);
                
            }
            
 
            System.out.println();

            for (int i = 0; i < 500; i++) {

                int rampage = (1000 - (int)(Math.pow(i, 2)));

                System.out.println("cago en la leche merche x" + i);

                if (rampage < 0) {
                    Thread.sleep(10);
                } else {
                    Thread.sleep(rampage);
                }
    
            }
        } catch (Exception e) {

            System.out.println(e.getMessage() + "\n wtf meen?");

        } finally {
            try {
                if (sc != null) {
                    sc.close();
                }
            } catch (Exception e2) {

                System.out.println(e2.getMessage() + "\n wtf meen? x2");

            }
        }
    }

}
