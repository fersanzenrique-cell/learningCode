import java.util.Scanner;

class Ej456 {
    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {
        int n, m, r;
        n = teclado.nextInt();
        m = teclado.nextInt() * n;
        r = teclado.nextInt() / m;
        System.out.println(r);
        //Hay que hacerlo con bucle
    }
}
