package Programación.Tema5.pruebas;

public class BankTransactionException extends Exception {
    public BankTransactionException (String message) {
        super("Operacion denegada: " + message);
    }
}
