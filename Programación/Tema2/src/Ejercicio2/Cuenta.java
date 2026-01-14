package Ejercicio2;

public class Cuenta {

    //Atributos
    Double saldo;
    int numCuenta;

    //Constructor
    Cuenta(int cuenta, double inicial) {
        this.numCuenta = cuenta;
        this.saldo = inicial;
    }

    //Metodos
    double saldo() {
        return this.saldo;
    }

    void depositar(double cantidad) {
        this.saldo = this.saldo+cantidad;
    }

    void retirar(double cantidad) {
        this.saldo = this.saldo-cantidad;
    }
    void prediccion(float interes,int meses) {
        this.saldo = this.saldo*((this.saldo*interes)*meses);
        System.out.println(String.format("%.2f", this.saldo));
    }

    @Override
    public String toString() {
        return("La cuenta " + this.numCuenta + " tiene un saldo de " + this.saldo +" euros.");
    }
}
