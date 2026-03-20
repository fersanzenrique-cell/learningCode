import java.util.Scanner;

public class Ej116 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        for(byte i = 0, numTeclado = teclado.nextByte(); i < numTeclado && i < 5; i++){
            System.out.print("Hola mundo.\n");
        }
    }
}
