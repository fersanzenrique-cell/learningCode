package TresEnRayaEjercicio;

import java.util.Arrays;

public class TresEnRaya {

    public static final char TOKEN1 = 'X';
    public static final char TOKEN2 = 'O';

    private char[][] matriz = new char[3][3];

    public TresEnRaya() {
        char contador = '1';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = contador++;
            }
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(matriz);
    }

    void verEnConsola() {
        for (int i = 0; i < 3; i++) {
            System.out.println("+-------+-------+-------+");
            System.out.println("|       |       |       |");
            System.out.println("|   " + matriz[i][0] + "   |   " + matriz[i][1] + "   |   " + matriz[i][2] + "   |");
            System.out.println("|       |       |       |");
        }
        System.out.println("+-------+-------+-------+");
    }

    char get(int n) {
        if (n < 1 || n > 9) return '\0';
        return matriz[(n - 1) / 3][(n - 1) % 3];
    }

    boolean validarMovimiento(int m) {
        if (m < 1 || m > 9) return false;
        char c = get(m);
        return c != TOKEN1 && c != TOKEN2;
    }

    void mover(int m, char token) {
        if (validarMovimiento(m)) {
            matriz[(m - 1) / 3][(m - 1) % 3] = token;
        }
    }

    int determinarGanador() {

        
        if (
            (matriz[0][0] == TOKEN1 && matriz[0][1] == TOKEN1 && matriz[0][2] == TOKEN1) ||
            (matriz[1][0] == TOKEN1 && matriz[1][1] == TOKEN1 && matriz[1][2] == TOKEN1) ||
            (matriz[2][0] == TOKEN1 && matriz[2][1] == TOKEN1 && matriz[2][2] == TOKEN1) ||
            (matriz[0][0] == TOKEN1 && matriz[1][0] == TOKEN1 && matriz[2][0] == TOKEN1) ||
            (matriz[0][1] == TOKEN1 && matriz[1][1] == TOKEN1 && matriz[2][1] == TOKEN1) ||
            (matriz[0][2] == TOKEN1 && matriz[1][2] == TOKEN1 && matriz[2][2] == TOKEN1) ||
            (matriz[0][0] == TOKEN1 && matriz[1][1] == TOKEN1 && matriz[2][2] == TOKEN1) ||
            (matriz[2][0] == TOKEN1 && matriz[1][1] == TOKEN1 && matriz[0][2] == TOKEN1)
        ) return 1;

    
        if (
            (matriz[0][0] == TOKEN2 && matriz[0][1] == TOKEN2 && matriz[0][2] == TOKEN2) ||
            (matriz[1][0] == TOKEN2 && matriz[1][1] == TOKEN2 && matriz[1][2] == TOKEN2) ||
            (matriz[2][0] == TOKEN2 && matriz[2][1] == TOKEN2 && matriz[2][2] == TOKEN2) ||
            (matriz[0][0] == TOKEN2 && matriz[1][0] == TOKEN2 && matriz[2][0] == TOKEN2) ||
            (matriz[0][1] == TOKEN2 && matriz[1][1] == TOKEN2 && matriz[2][1] == TOKEN2) ||
            (matriz[0][2] == TOKEN2 && matriz[1][2] == TOKEN2 && matriz[2][2] == TOKEN2) ||
            (matriz[0][0] == TOKEN2 && matriz[1][1] == TOKEN2 && matriz[2][2] == TOKEN2) ||
            (matriz[2][0] == TOKEN2 && matriz[1][1] == TOKEN2 && matriz[0][2] == TOKEN2)
        ) return 2;

        
        for (char[] fila : matriz) {
            for (char c : fila) {
                if (c != TOKEN1 && c != TOKEN2)
                    return -1;
            }
        }

        return 0; 
    }
}