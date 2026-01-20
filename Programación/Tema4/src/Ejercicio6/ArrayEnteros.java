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

    int[] getArrayEnteros() {
        return arrayEnteros;
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
        
        int aIndex = 0;
        int bIndex = 0;

        for (int entero : arrayEnteros) {
            if (entero != a) {
                aIndex++;
            } else if (entero != b) {
                bIndex++;
            }
        }
        arrayEnteros[aIndex] = b;
        arrayEnteros[bIndex] = a;
    }

    int maximo() {
        Arrays.sort(arrayEnteros);
        return arrayEnteros[arrayEnteros.length - 1];
    }

    int minimo() {
        Arrays.sort(arrayEnteros);
        return arrayEnteros[0];
    }

    float media() {
        int suma = 0;
        for (int entero : arrayEnteros) {
            suma =+ entero;
        }

        return suma/arrayEnteros.length;
    }

    int[] encontrar(int num) {
        int[] arrayPos = new int[arrayEnteros.length];

        for (int entero : arrayEnteros) {
            if (entero == num) {
                arrayPos[entero] = num;
            }
        }

        return arrayPos;

    }

    int[] encontrar2(int num) {
        int[] arrayPos = null;
        int repeticiones = this.cuentaVeces(num);
        int j = 0;

        if (repeticiones > 0) {
            arrayPos = new int[repeticiones];

            for (int i = 0; i < this.arrayEnteros.length; i++) {
                
                if (this.arrayEnteros[i] == num) {
                    arrayPos[j] = i;
                    j++;
                }
            }
        }

        return arrayPos;

    }

    @Override
    public String toString() {
        return Arrays.toString(arrayEnteros);
    }

    

}
