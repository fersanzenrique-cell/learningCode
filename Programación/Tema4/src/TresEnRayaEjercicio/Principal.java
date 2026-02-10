
import java.util.Random;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        TresEnRaya juego = new TresEnRaya();
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int estado = -1;          // -1 = el juego continúa
        boolean turnoOrdenador = true;

        // El juego continúa mientras no haya ganador ni empate
        while (estado == -1) {

            juego.verEnConsola();

            if (turnoOrdenador) {
                eligeOrdenador(juego, rand);
            } else {
                eligeUsuario(juego, sc);
            }

            // Tras cada movimiento se comprueba el estado
            estado = juego.determinarGanador();

            // Cambio de turno solo si el juego sigue
            if (estado == -1) {
                turnoOrdenador = !turnoOrdenador;
            }
        }

        juego.verEnConsola();

        if (estado == 1) {
            System.out.println("Gana el ordenador");
        } else if (estado == 2) {
            System.out.println("¡Has ganado!");
        } else {
            System.out.println("Empate");
        }
    }

    // ================= USUARIO =================
    static void eligeUsuario(TresEnRaya juego, Scanner sc) {
        boolean valido = false;

        while (!valido) {
            System.out.print("Ingresa tu movimiento: ");
            int m = sc.nextInt();

            if (!juego.validarMovimiento(m)) {
                System.out.println("Casilla no válida");
            } else {
                juego.mover(m, TresEnRaya.TOKEN2);
                valido = true;
            }
        }
    }

    // ================= ORDENADOR =================
    static void eligeOrdenador(TresEnRaya juego, Random rand) {
        boolean valido = false;

        while (!valido) {
            int m = rand.nextInt(9) + 1;

            if (juego.validarMovimiento(m)) {
                System.out.println("El ordenador elige " + m);
                juego.mover(m, TresEnRaya.TOKEN1);
                valido = true;
            }
        }
    }
}

