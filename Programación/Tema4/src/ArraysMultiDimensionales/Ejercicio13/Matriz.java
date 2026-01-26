package ArraysMultiDimensionales.Ejercicio13;

import java.util.Random;

public class Matriz {
    private int m,n;
    private int[][] matriz;

    Matriz(int m , int n) {
        this.m = m;
        this.n = n;
        this.matriz = new int[m][n];
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    void inicializarMatriz() {
        Random Random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[j].length; j++) {
                matriz[i][j] = Random.nextInt(0,101);
            }
        }
    }

    int maximo() {
        int max = 0;
        for (int[] is : matriz) {
            for (int i : is) {
                if (i > max) {
                    i = max;
                }
            }
        }
        return max;
    }

    // manejo de excepcion primitivo
    void sumaFilaPrimitivo(int f) {

        boolean prueba = f > m || f < 0;

        while (prueba) {
            if (prueba) {
                System.out.println("Fila no válida.");
                prueba = f > m || f < 0;
            } else {
                int suma = 0;
                for (int i = 0; i < matriz[f].length; i++) {
                    System.out.print(
                        " " + matriz[f][i] + (matriz[f][i] == matriz[f].length? " = ":" + ")
                    );
                    suma += suma + matriz[f][i];
                }
                System.out.println(suma);
            }
        }
    }

    void sumaColumnaPrimitiva (int f) {

        boolean prueba = f > m || f < 0;

        while (prueba) {
            if (prueba) {
                System.out.println("Columna no válida.");
                prueba = f > m || f < 0;
            } else {
                int suma = 0;
                for (int i = 0; i < matriz.length; i++) {
                    System.out.print(
                        " " + matriz[i][f] + (matriz[i][f] == matriz[i].length? " = ":" + ")
                    );
                    
                    suma += suma + matriz[i][f];
                }    
                System.out.println(suma);
            }
        }
    }

    void sumaDiagonal () {

    }

    void visualizar() {
        for (int[] is : matriz) {
            for (int i : is) {
                System.out.print(" " + i + " ");
            }
            System.out.println();
        }
    }

}
