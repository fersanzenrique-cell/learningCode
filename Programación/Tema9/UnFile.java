package Tema9;
import java.io.IOException;
import java.io.File;
import java.util.Scanner; 

public class UnFile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce el nombre de un fichero > ");
        String fichero = sc.nextLine();
        File f = new File(fichero);
        if (f.exists()){
            System.out.println("La longitud del fichero es de " + f.length());
            if (f.canRead())
                System.out.println("Se puede leer");
            if(f.canWrite())
                System.out.println("Se puede escribir");
        } else {
            System.out.println("El fichero no existe pero lo voy a crear.");
            
        try {
            f.createNewFile();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        }
        sc.close();
    }
    
}

