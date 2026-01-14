package Ejercicio2;

public class CuentaHistoria {
    public static void main(String[]args) {
        Cuenta c1 = new Cuenta(1,100);
        c1.depositar(50);
        System.out.println(c1.saldo);
        c1.retirar(25);
        System.out.println(c1.saldo);
        Cuenta c2 = new Cuenta(2,125);
        System.out.println(c2.saldo);
        c2.prediccion(0.05F,12);
    }
}
