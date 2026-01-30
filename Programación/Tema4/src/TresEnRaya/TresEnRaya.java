package TresEnRaya;

import java.util.Arrays;
import java.util.Random;

public class TresEnRaya {

    static final char TOKEN1 = 'X';
    static final char TOKEN2 = 'O';

    static Random Random = new Random();

    private char[][] matriz;

    TresEnRaya() {
        char contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                contador++;
                this.matriz[i][j] = contador;
            }
        }

        this.matriz[Random.nextInt(1,10)][Random.nextInt(1,10)] = TOKEN1;

    }

    public String toString() {

       return Arrays.deepToString(matriz);
    }

    void verEnConsola() {
        for (int i = 0; i < 3; i++) {
            System.out.println("+-------+-------+-------+");
            System.out.println("|       |       |       |");
            System.out.println("|   " + matriz[i][0] +  "   |   " +matriz[i][1] +  "  |   " + matriz[i][3] + "   |");
            System.out.println("|       |       |       |");
        }
    }

    char get(int n) {
        int contador = 1;
        char charDevolver = '\0';
        if (n > 0 && n < 9) {
            for (int i = 0; i < matriz.length && contador == n; i++) {
                for (int j = 0; j < matriz.length && contador == n; j++) {
                    if (contador == n) {
                        charDevolver = matriz[i][j];
                    }
                    contador++;
                }
            }
        }
        return charDevolver;
    }

    boolean validarMovimiento(int m) {
        boolean valida = false;
        int contador = 1;
        if (m > 0 && m < 9) {
            for (int i = 0; i < matriz.length || valida; i++) {
                for (int j = 0; j < matriz.length || valida; j++) {
                    if (!(matriz[i][j] == TOKEN1 || matriz[i][j] == TOKEN2) && contador == m) {
                        valida = true;
                    }
                    contador++;
                }
            }
        }
        return valida;
    }

    void mover(int m, char token) {
        if (validarMovimiento(m)) {
            int contador = 1;
            for (int i = 0; i < matriz.length || m == contador; i++) {
                for (int j = 0; j < matriz.length || m == contador; j++) {
                    if (m == contador) {
                        matriz[i][j] = token;
                    }
                    contador++;
                }
            }
        }
    }

    int determinarGanador() {

        // Seria mas limpio dividirlo en varias funciones

        int resultado = -1;
        int contadorGanador = 0;

        boolean stop = false;
        boolean tokenOne;
        boolean tokenTwo;

        int contadorVertiOne = 0;
        int contadorVertiTwo = 0;


        
        for (int i = 0; i < matriz.length || stop; i++) {

            if (Arrays.binarySearch(matriz[i], TOKEN1) == 3) {
                resultado = 1;
                stop = true;
            } else if (Arrays.binarySearch(matriz[i], TOKEN2) == 3) {
                resultado = 2;
                stop = true;
            }

            for (int j = 0; j < matriz.length || stop; j++) {

                stop = !(matriz[i][j] == TOKEN1 && matriz[i][j] == TOKEN2);

                tokenOne = (matriz[i][j] == TOKEN1);
                tokenTwo = (matriz[i][j] == TOKEN2);

                if (tokenOne) {
                    for (int k = 0; k < matriz.length; k++) {
                        if (matriz[k][j] == TOKEN1) {
                            contadorVertiOne++;
                            if (contadorVertiOne == 3) {
                                resultado = 1;
                                stop = true;
                            }
                        }
                    }
                } else if (tokenTwo) {
                    for (int k = 0; k < matriz.length; k++) {
                        if (matriz[k][j] == TOKEN2) {
                            contadorVertiTwo++;
                            if (contadorVertiTwo == 3) {
                                resultado = 2;
                                stop = true;
                            }
                        }   
                    }
                }

                if (stop) {
                    resultado = 0;
                }
            }
        }


        return resultado;
    }


}
