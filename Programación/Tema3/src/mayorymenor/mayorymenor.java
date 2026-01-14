package mayorymenor;


import java.util.Scanner;

public class mayorymenor {
    private Scanner teclado = new Scanner(System.in);
    private int numero;

    public mayorymenor(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int mayor(){

        int mayor = Integer.MIN_VALUE;
        int numero = 0;

        System.out.println("Ingrese numeros separados por enter, ponga un 0 para terminar: ");
        while (numero != 0) {
            numero = teclado.nextInt();
            if (numero != 0 && numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }
}
