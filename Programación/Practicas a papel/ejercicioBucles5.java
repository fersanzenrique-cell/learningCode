import java.util.Scanner;

public class ejercicioBucles5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int clave, contador;
        System.out.println("Hola, introduce tu contraseña");
        contador = 0;
        do {
            clave = teclado.nextInt();
            if (clave != 1234 && contador != 3) {
                contador++;
                System.out.println(contador);
                System.out.println((contador < 3)?
                    "Intentalo otra vez, te quedan " + (3 - contador) + " intentos."
                    :
                    "No hay más intentos"
                );
            } else {
                System.out.println("Login");
            }
            
            
        } while (clave != 1234 && contador != 3);
        
       
    }
}
