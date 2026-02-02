package Programación.Tema5.pruebas;

public class Cuenta {
    private double saldo;

    public Cuenta () {}

    public Cuenta (double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar (double cantidad) throws BankTransactionException {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            throw new BankTransactionException("No hay saldo suficiente");
        }
    }

    public void depositar (double cantidad) throws BankTransactionException {
        if (cantidad <= 0) {
            throw new BankTransactionException("No puedes añadir una cantidad negativa o 0");
        } else {
            saldo += cantidad;
        }
    }

    public void transferencia (Cuenta c, double cantidad) throws BankTransactionException {
        if (cantidad > saldo) {
            throw new BankTransactionException("No se puede transferir, no hay saldo suficiente");
        } else {
            this.sacar(cantidad);
            c.depositar(cantidad);
        }
    }

    // realmente las dos funciones hacen lo mismo, una sin crear una excepcion

    public void transferencia2 (Cuenta c, double cantidad) throws BankTransactionException {
        this.sacar(cantidad);
        c.depositar(cantidad);
    }
}
