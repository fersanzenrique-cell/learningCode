package Ejercicio6a;

public class Cuenta {

    //Atributos
    private Double saldo;
    private int numCuenta;

    //Constructor
    Cuenta(int cuenta, double inicial) {
        this.numCuenta = cuenta;
        this.saldo = inicial;
    }

    //Metodos
    public int getNumCuenta() {return numCuenta;}

    public double getSaldo() {
        return saldo;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    void depositar(double cantidad) {
        this.saldo = saldo+cantidad;
    }

    void retirar(double cantidad) {
        this.saldo = saldo-cantidad;
    }

    void transferencia(Cuenta Cuenta, double cantidad) {
        retirar(cantidad);
        Cuenta.depositar(cantidad);
    }

    /*
   void prediccion(float interes,int meses) {
       this.saldo = saldo*((saldo*interes)*meses);
       System.out.println(String.format("%.2f", this.saldo));
   }
   */

    @Override
    public String toString() {
        return("La cuenta " + this.numCuenta + " tiene un saldo de " + this.saldo +" euros.");
    }
}
