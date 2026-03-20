package Tema9.Ficheros;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class LeerFicheroConScanner {
    public static void main(String[] args) {
        File f = new File("Programación/Tema9/Ficheros/pepe.txt");
        
        byte cont = 0;
        try {
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.exists());
            System.out.println(f.canRead());
            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                System.out.print(sc.nextLine() + "\n");
                cont++;
            }
            System.out.println();
            System.out.println(cont);
            
            sc.close();
            
        } catch (FileNotFoundException e) {
            System.err.println("No se encontro el archivo");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
}
