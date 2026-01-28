package TresEnRaya;

public class TresEnRaya {

    static final char TOKEN1 = 'X';
    static final char TOKEN2 = 'O';

    private int[][] matriz;

    TresEnRaya() {
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                contador++;
                this.matriz[i][j] = contador;
            }
        }
    }

    String toString() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
            }
        }
    }

    


}
