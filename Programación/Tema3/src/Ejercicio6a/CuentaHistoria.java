package Ejercicio6a;

public class CuentaHistoria {
    int contador = 0;
    public static void main(String[]args) {
        Cuenta c1 = new Cuenta(1,100);
        Cuenta c2 = new Cuenta(2,405);

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());
        c1.transferencia(c2,50);
        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());


    }
}
