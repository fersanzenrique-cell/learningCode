package Programación.Tema5.pruebas;

public class pruebaBanco {
    public static void main(String[] args) {
        Cuenta c = new Cuenta(100);
        Cuenta c1 = new Cuenta(55.32);

        try {

            c.transferencia(c1, 200);

            c.transferencia2(c1, 200);

        } catch (BankTransactionException e) {

            System.err.println(e.getMessage());

        } finally {
            System.out.println(c.getSaldo());
            System.out.println(c1.getSaldo());
        }
    }
}
