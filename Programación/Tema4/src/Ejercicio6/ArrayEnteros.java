package Ejercicio6;

import java.util.Arrays;

class ArrayEnteros {

    private int[] arrayEnteros;

    ArrayEnteros() {
        arrayEnteros = new int[10];
    }

    ArrayEnteros(int num) {
        arrayEnteros = new int[num];
    }

    ArrayEnteros(int[] arrayEnteros) {
        this.arrayEnteros = arrayEnteros;
    }

    int cuentaVeces(int num) {
        int contador = 0;
        for (int i : arrayEnteros) {
            if (i == num) {
                contador++;
            }
        }
        return contador;
    }

    void intercambiar(int a, int b) {
        if ()

    }

}
